package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
	Button btn = new Button();
	HBox hbox = new HBox();
	
	hbox.getChildren().add(btn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
