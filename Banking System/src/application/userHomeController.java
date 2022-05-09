package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class userHomeController {
	@FXML
	public TextField accNum;
	@FXML
	public TextField nid;
	public void backToLoginPage(ActionEvent e) {
		try {
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
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
	
	public void viewAllAccounts(ActionEvent e) {
		try {
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("empViewAllAcc.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void viewAccountsInfo(ActionEvent e) {
		try {
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("userViewAccInfo.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void viewTransactionHistory(ActionEvent e) {
		try {
	
		AnchorPane root = FXMLLoader.load(getClass().getResource("userViewAccTransaction.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
		
	}
		catch(Exception we) {
			
		}
	}
	
	 

}
