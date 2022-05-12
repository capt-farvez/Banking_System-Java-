package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import banking.BankAccount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpViewAllAccController implements Initializable {
	ArrayList<BankAccount> accounts;
	@FXML
	ListView<String> myList;

	public void initialize(URL arg0, ResourceBundle arg1) {
		accounts=Main.bank.getAccounts();
		for(int i=0; i<accounts.size(); i++)
			myList.getItems().add(accounts.get(i).toString());
	}
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
}
