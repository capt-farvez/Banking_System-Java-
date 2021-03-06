package application;

import javafx.event.ActionEvent; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginController {
	public void empHomeController(ActionEvent e) {
		try {
		AnchorPane root = FXMLLoader.load(getClass().getResource("empHome.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void userHomeController(ActionEvent e) {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("userHome.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
			
		}
			catch(Exception we) {
				
			}
		
	}
	
	public void exit(ActionEvent e) {
		System.exit(0);
	}


}
