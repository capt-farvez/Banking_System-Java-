package application;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class EmpDepWithTransController {
	@FXML
	public TextField accNumTf;
	@FXML
	public TextField WDAmountTf;
	@FXML
	public TextField fromAccTf;
	@FXML
	public TextField toAccTf;
	@FXML
	public TextField transAmmountTf;
	
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
		String accNum=accNumTf.getText();
		double amount=Double.parseDouble(WDAmountTf.getText());
		try {
			Main.bank.deposit(accNum, amount);
		}
		catch (InvalidAccountException e) {
			e.printStackTrace();
		} 
	//		catch (InSufficientBalanceException e) {
//			e.printStackTrace();
//		} catch (MaxWithdawException e) {
//			e.printStackTrace();
//		}
	}
	public void withdraw(ActionEvent event) {
		String accNum=accNumTf.getText();
		double amount=Double.parseDouble(WDAmountTf.getText());
		try {
			Main.bank.withdraw(accNum, amount);
		}
		catch (InvalidAccountException e) {
			e.printStackTrace();
		} catch (InSufficientBalanceException e) {
			e.printStackTrace();
		} catch (MaxWithdawException e) {
			e.printStackTrace();
		}
	}
	public void transfer(ActionEvent event) {
		String fromAcc=fromAccTf.getText();
		double balance=Double.parseDouble(transAmmountTf.getText());
		try {
			Main.bank.withdraw(fromAcc, balance);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		} catch (InSufficientBalanceException e) {
			e.printStackTrace();
		} catch (MaxWithdawException e) {
			e.printStackTrace();
		}
}
}
