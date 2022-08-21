package qaBoxApp.frontend;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MainFrontend{

	public MainFrontend(Stage stage) throws Exception{
		
        Label taskTitle = new Label("Compare requests");
        
        Button startButton = new Button();
        startButton.setPrefHeight(100.0);
        startButton.setPrefWidth(100.0);
        

        
        TextArea request1 = new TextArea();
        TextArea request2 = new TextArea();
        TextArea result1 = new TextArea();
        TextArea result2 = new TextArea();
	
		HBox requests = new HBox();
		requests.setSpacing(50);
		requests.setPadding(new Insets(20, 50, 20, 50));
		requests.getChildren().addAll(request1, request2);

		HBox results = new HBox();
		results.setSpacing(50);
		results.setPadding(new Insets(20, 50, 20, 50));
		results.getChildren().addAll(result1, result2);
		
        VBox body = new VBox(30);
        body.getChildren().addAll(taskTitle, requests, startButton, results);            
        body.setAlignment(Pos.CENTER);
        
        startButton.setOnAction(event -> {
			result1.setText(request1.getText());
			result2.setText(request2.getText());
			});
        
        Scene scene = new Scene(body, 800, 600);
		stage.setTitle("QABox");
        stage.setScene(scene);
        stage.show();
	}
}
