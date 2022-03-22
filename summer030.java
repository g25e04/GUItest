package summer030;
//§d²Ð¦w U10716012

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

public class summer030 extends Application{

	public summer030() {
		// TODO Auto-generated constructor stub
	}

	public void start(Stage primaryStage) {
		RunPane scene1 = new RunPane();
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(scene1.pane);
		
		Scene scene = new Scene(borderPane,800,600);
                
		primaryStage.setTitle("Summer030");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
