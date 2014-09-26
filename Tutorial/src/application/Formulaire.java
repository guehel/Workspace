package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Formulaire extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Formulaire");
		GridPane pane = new GridPane();
		pane.setId("pane");
		pane.setAlignment(Pos.CENTER);
//		pane.setHgap(10);
//		pane.setVgap(10);
//		pane.setPadding(new Insets(25, 25, 25, 25));
//		
		
		Text sceneTitle = new Text("Bienvenue");
		sceneTitle.setId("sceneTitle");
		pane.add(sceneTitle, 0, 0, 2, 1);
		
		Label userName = new Label("Code utilisateur");
		userName.setId("userName");
		pane.add(userName, 0, 1);
		
		TextField userField = new TextField();
		pane.add(userField, 1,1);
		
		Label password = new Label("Mot de passe");
		userName.setId("password");
		pane.add(password, 0, 2);
		
		PasswordField pwdField = new PasswordField();
		pane.add(pwdField, 1, 2);
		
		Button btnConnecter = new Button("Connecter");
		
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.BOTTOM_RIGHT);
		hBox.getChildren().add(btnConnecter);
		pane.add(hBox, 1, 4);
		
		final Text textTarget = new Text();
		textTarget.setId("textTarget");
		pane.add(textTarget, 1, 6);
		
		btnConnecter.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			
				textTarget.setText("Connecte avec le bouton presse");
			}
		});
		Scene scene = new Scene(pane, 300, 275);
		scene.getStylesheets().add(getClass().getResource("Formulaire.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String [] args){
		launch(args);
	}

}
