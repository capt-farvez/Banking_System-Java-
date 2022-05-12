package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EmpTransferController {
	@FXML 
	public TextField sendertf;
	@FXML 
	public TextField receivertf;
	@FXML 
	public TextField amounttf;
	@FXML
	public Label status;
	
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
	
	public void transfer(ActionEvent event) {
		String sender=sendertf.getText();
		String receiver=receivertf.getText();
		double balance=Double.parseDouble(amounttf.getText());
		try {
			Main.bank.transfer(sender,receiver, balance);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		} catch (InSufficientBalanceException e) {
			e.printStackTrace();
		} catch (MaxWithdawException e) {
			e.printStackTrace();
		}
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		status.setText("Transfer Successfull.");
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
