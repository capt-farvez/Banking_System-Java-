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
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class EmpDepositWithdrawController {
	@FXML
	public TextField accNoTf;
	@FXML
	public TextField amountTf;
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
	public void deposit(ActionEvent event) {
		String accnum=accNoTf.getText();
		double amount=Double.parseDouble(amountTf.getText());
		try {
			Main.bank.deposit(accnum, amount);
		} catch (InvalidAccountException e) {
			// TODO Auto-generated catch block
			status.setText(e.getMessage());
		}
		try {
			status.setText(Double.toString(Main.bank.getBalance(accnum)));
		} catch (InvalidAccountException e) {
			status.setText(e.getMessage());
		}
		try {
			Main.bank.saveData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public void withdraw(ActionEvent event) {
		String accnum=accNoTf.getText();
		double amount=Double.parseDouble(amountTf.getText());
		try {
			Main.bank.withdraw(accnum, amount);
			status.setText(Double.toString(Main.bank.getBalance(accnum)));
			Main.bank.saveData();
		} catch (InvalidAccountException e) {
			status.setText(e.getMessage());
		} catch (InSufficientBalanceException e) {
			status.setText(e.getMessage());
		} catch (MaxWithdawException e) {
			status.setText(e.getMessage());
		}
		catch (Exception e) {
			status.setText(e.getMessage());
		}
//		try {
//			status.setText(Double.toString(Main.bank.getBalance(accnum)));
//		} catch (InvalidAccountException e) {
//			status.setText(e.getMessage());
//		}
//		try {
//			Main.bank.saveData();
//		} catch (FileNotFoundException e) {
//		
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

}
