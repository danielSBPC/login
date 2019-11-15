package application;

import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import view.Principal;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	Principal p = new Principal();

	@Override
	public void start(Stage primaryStage) {

		try {
			//FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
			
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root, 500, 500);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * EventQueue.invokeLater(new Runnable() {
		 * 
		 * @Override public void run() { p.hacerVisible();
		 * 
		 * } });
		 */
	}

	public static void main(String[] args) {
		launch(args);
	}
}
