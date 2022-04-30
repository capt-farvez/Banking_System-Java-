package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class userHomeController {
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