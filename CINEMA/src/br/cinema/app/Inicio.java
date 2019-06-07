package br.cinema.app;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicio extends Application {
	
	public static void main(String[] args) {
		
		
		launch(args);
	}

	Parent root;
	double posX, posY;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
		root = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
		
		Scene scene = new Scene(root);
		//stage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.show();
		//scene.setFill(Color.TRANSPARENT);
		
		root.setOnMousePressed(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				posX = event.getSceneX();
				posY = event.getSceneY();
			}
		});
		
		root.setOnMouseDragged(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				primaryStage.setX(event.getScreenX()-posX);
				primaryStage.setY(event.getScreenY()-posY);
				
			}
		});
		
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	

}
