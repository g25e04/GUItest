package summer030;

import java.util.Arrays;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.geometry.Pos;
import java.security.SecureRandom;

public class RunPane {
	SecureRandom secureRandom = new SecureRandom();
	SelectionSort SS = new SelectionSort();
	ArrayList<Integer> numberList = new ArrayList<>();
	private Button jbStart = new Button("進入程式");
	private Button jbBorn = new Button("產生");
	private Button jbSort = new Button("排序");
	TextField jtfen = new TextField("");
	
	BorderPane borderPane2 = new BorderPane();
	StackPane pane = new StackPane();
	
	public RunPane() {
		// TODO Auto-generated constructor stub
		jbStart.setMaxSize(100, 100);
		
		firstPane();
		pane.getChildren().addAll(borderPane2);
		
		jbStart.setOnAction(e ->{
			secondPane();
		});
	}

	
	protected void firstPane() {
		BorderPane borderPane1 = new BorderPane();
		borderPane1.setCenter(jbStart);
		
		borderPane2.setCenter(borderPane1);
	}
	
	protected void secondPane() {
		borderPane2.setCenter(null);
		BorderPane borderPane4 = new BorderPane();
		BorderPane borderPane5 = new BorderPane();
		
		GridPane gridPane3 = new GridPane();
		gridPane3.setAlignment(Pos.CENTER);
		gridPane3.setHgap(20);
		gridPane3.setVgap(20);
		gridPane3.add(jtfen, 0, 0);
		gridPane3.add(jbBorn, 0, 1);
		gridPane3.add(new Label("randombutton"), 1, 1);
		gridPane3.add(borderPane4, 0, 2);
		gridPane3.add(jbSort, 0, 3);
		gridPane3.add(new Label("sortbutton"), 1, 3);
		gridPane3.add(borderPane5, 0, 4);
		
		borderPane2.setCenter(gridPane3);
		
		jbBorn.setOnAction(e ->{
			borderPane4.setCenter(null);
			numberList.clear();
			String temp = jtfen.getText();
			int number = Integer.parseInt(temp);
			int [] real = new int[number];
			for(int i = 0;i<number;i++) {
				int choose = (int)(secureRandom.nextInt(40)+1);
				real[i]=choose;
				numberList.add(choose);
			}
				String tempString = Arrays.toString(real);
				
				borderPane4.setCenter(new Label(tempString));
		});
		
		jbSort.setOnAction(e ->{
			borderPane5.setCenter(null);
			String temp = jtfen.getText();
			int number = Integer.parseInt(temp);
			int [] real = new int[number];
			for(int i = 0;i<number;i++)
				real[i]=numberList.get(i);
			
			String tempString = Arrays.toString(SS.SelectionSortNumber(real));
			
			borderPane5.setCenter(new Label(tempString));
		});
	}
}
