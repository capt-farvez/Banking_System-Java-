package application;

import java.util.ArrayList;

import banking.BankAccount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EmpViewUserAllAccController {
	public void EmpHomePage(ActionEvent e) {
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

		@FXML
		TextField mNidtf;
		@FXML
		ListView<String> lv;
		public void accInfo(ActionEvent event) {
			lv.getItems().clear();
			String accNumber=mNidtf.getText();
				ArrayList<BankAccount> account=Main.bank.findAccounts(accNumber);
				for(int i=0; i<account.size(); i++)
					lv.getItems().add(account.get(i).toString());
		}

}
