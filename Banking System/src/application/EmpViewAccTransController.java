package application;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpViewAccTransController {
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
	@FXML
	TextField accountNumTf;
	@FXML
	ListView<String> lv;
	public void transactionHistroy() {
		String accountNum=accountNumTf.getText();
		//String nid=nidTf.getText();
		ObservableList<Transaction> list;
		try {
			list = FXCollections.observableArrayList(Main.bank.getAccTransactions( accountNum));
			for(Transaction t: list)
				lv.getItems().add(t.toString());
		} catch (InvalidAccountException e) {
		
			e.printStackTrace();
		}
		
	}

}
