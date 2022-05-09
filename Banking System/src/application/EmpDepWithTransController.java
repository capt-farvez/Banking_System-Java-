package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpDepWithTransController {
	@FXML
	public TextField accNum;
	@FXML
	public TextField WDAmount;
	@FXML
	public TextField fromAcc;
	@FXML
	public TextField toAcc;
	@FXML
	public TextField transAmmount;
	
	public void empHomePage(ActionEvent e) {
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
	public void exit(ActionEvent e) {
		System.exit(0);
	}
	public void deposit(ActionEvent e) {
		
	}
	public void withdraw(ActionEvent e) {
		
	}
	public void transfer(ActionEvent e) {
	
}



}
