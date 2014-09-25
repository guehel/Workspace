package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Text text = new Text("centre");

			root.setCenter(text);

			root.setTop(new Text("Top"));
			root.setLeft(new Text("gauche"));
			root.setRight(new Text("droite"));
			root.setBottom(new Text("Bottom"));
			BorderPane.setAlignment(root.getCenter(), Pos.CENTER);
			BorderPane.setAlignment(root.getTop(), Pos.CENTER);
			BorderPane.setAlignment(root.getBottom(), Pos.CENTER);
			BorderPane.setAlignment(root.getLeft(), Pos.CENTER);
			BorderPane.setAlignment(root.getRight(), Pos.CENTER);
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
