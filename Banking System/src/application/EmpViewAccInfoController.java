package application;

import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpViewAccInfoController {
	public void empHomePage(ActionEvent e) {
		try {
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("empHome.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();;
		
	}
		catch(Exception we) {
			
		}
	}
	
	public void exit(ActionEvent e) {
		System.exit(0);
	}
	@FXML
	public TextField accNum;
	@FXML
	public Label details;
	public void accInfo(ActionEvent e) {
		String num=accNum.getText();
		try {
			BankAccount acc=Main.bank.findAccount(num);
			details.setText(acc.toString());	
			//Main.bank.saveData();
			}
		catch(InvalidAccountException exp) {
				details.setText(exp.getMessage());
			}
	}

}
