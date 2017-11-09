package application;



import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class User extends Button {
	File file=new File("rahat6.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	Button b=new Button("Registration");
	Button b5=new Button("DESEASE PREDICTON");
	Button b2=new Button("BMR");
	Button b3=new Button("BMI");
	Button b4=new Button("DietChart");
   // Override the start method in the Application class
  public void User() {
    // Create a scene and place a button in the scene
	  Pane pane=new Pane();
	  Text text=new Text("Smart Health Consulting");
	  text.setFont(Font.font("o",FontWeight.NORMAL,50));
	  text.setFill(Color.WHITE);
	 
	  pane.setPrefSize(850, 550);
	  pane.getChildren().addAll(ii,b2,b3,b4,b5,text);
	  text.relocate(200, 100);
		
	  
		 b.relocate(500, 200);
			b.setPrefSize(200, 50);
			b2.relocate(500, 260);
			b2.setPrefSize(200, 50);
			b3.relocate(500, 320);
			b3.setPrefSize(200, 50);
			b4.relocate(500, 380);
			b4.setPrefSize(200, 50);
			
			b5.relocate(500, 440);
			b5.setPrefSize(200, 50);
		
			b2.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				
					BMR r=new BMR();
					r.BMR();
				}
			});
			b3.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				
					Bmi1 i=new Bmi1();
					i.Bmi1();
				}
			});
			b5.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				    Desisepre k=new Desisepre();
					//Deseaseprediction k=new Deseaseprediction();
					k.JDBC();
				}
			});
			b4.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				
					DeitChart l=new DeitChart();
					l.DeitChart();
				}
			});
	  Stage stage=new Stage();
		Scene scene=new Scene(pane);
		
		stage.setScene(scene);
		stage.show();
  }


  
}

