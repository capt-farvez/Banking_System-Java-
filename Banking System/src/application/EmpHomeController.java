package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpHomeController {
	public void deposit(ActionEvent e) {
		try {
		Stage primaryStage = new Stage();
		AnchorPane root = FXMLLoader.load(getClass().getResource("empDepWithTrans.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void createAcc(ActionEvent e) {
		try {
		Stage primaryStage = new Stage();
		AnchorPane root = FXMLLoader.load(getClass().getResource("empCreateAcc.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void view(ActionEvent e) {
		try {
		Stage primaryStage = new Stage();
		AnchorPane root = FXMLLoader.load(getClass().getResource("empView.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void backToLoginPage(ActionEvent e) {
		try {
		Stage primaryStage = new Stage();
		AnchorPane root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}


}