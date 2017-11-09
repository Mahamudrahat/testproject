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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.sql.*;

import application.Deseaseprediction.Deseaseprediction1;
import application.Deseaseprediction.Deseaseprediction4;

public class DeitChart extends Button  {
	File file=new File("rahat4.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
      Pane pane=new Pane();
      Scene scene=new Scene(pane,850,550);
      Button b=new Button("BMR");
		Button b1=new Button("Diet chart");
		//Button b2=new Button("submit");
		//Label l=new Label("To give BMR");
		//TextField t=new TextField();
		Text text=new Text("First You Find Your BMR TO get Diet Chart");
		
		public void DeitChart(){
			b.relocate(500,200);
			b.setPrefSize(100, 30);
			b1.relocate(500,250);
			b1.setPrefSize(100, 30);
			text.relocate(200,150);
			 text.setFont(Font.font("o",FontWeight.NORMAL,20));
			 pane.getChildren().addAll(ii,b,b1,text);
		
			Stage stage=new Stage();
			stage.setScene(scene);
			stage.show();
			b.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				
					BMR a=new BMR();
					a.BMR();
				}
			});

			b1.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
				
					DeitChart1 a=new DeitChart1();
					a.DeitChart1();
				}
			});
		}
	/*	
		public class DeitChart1 extends Button{
			public void DeitChart1(){
				l.relocate(350,350);
				l.setPrefSize(200, 30);
				 l.setFont(Font.font("o",FontWeight.NORMAL,20));
				t.relocate(500,350);
				t.setPrefSize(200, 30);
				b2.relocate(600,400);
				b2.setPrefSize(100, 30);
				 pane.getChildren().addAll(b2,l,t);
			}
		}
		*/
	
}
