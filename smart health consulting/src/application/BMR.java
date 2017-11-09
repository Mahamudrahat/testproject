package application;
import javafx.application.Application;

import java.io.File;

import application.Bmi1.bmi1;
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
public class BMR extends Button{
	
	
	TextField weightText=new TextField();
	 TextField hightText=new TextField();
	 TextField ageText=new TextField();
	 TextField sexText=new TextField();
	 TextField activitylevel=new TextField();
	// final public float r=9.6f;
   public void BMR(){
	   GridPane grid=new GridPane();
	   Scene scene=new Scene(grid,850,550);
	   grid.setAlignment(Pos.CENTER);
	   grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		Label weight=new Label("Weight  ");
		grid.add(weight,0, 1);
		 weight.setFont(Font.font("o",FontWeight.NORMAL,20));
		// TextField weightText=new TextField();
		 grid.add(weightText,1, 1);
		 Label hight=new Label("Hight            ");
		grid.add(hight,0, 2);
		hight.setFont(Font.font("o",FontWeight.NORMAL,20));
		// TextField hightText=new TextField();
		 grid.add(hightText,1, 2);
		 Label age=new Label("Age                ");
			grid.add(age,0, 3); 
			age.setFont(Font.font("o",FontWeight.NORMAL,20));
			// TextField ageText=new TextField();
			 grid.add(ageText,1, 3);
			 Label sex=new Label("gender             ");
				grid.add(sex,0, 4);
				sex.setFont(Font.font("o",FontWeight.NORMAL,20));
				// TextField sexText=new TextField();
				 grid.add(sexText,1, 4);
				 Label ac=new Label("activitydays/week  ");
					grid.add(ac,0, 5);
					ac.setFont(Font.font("o",FontWeight.NORMAL,20));
					// TextField sexText=new TextField();
					 grid.add(activitylevel,1, 5);
				 Button btn=new Button("Submit");
				 HBox hbtn=new HBox(50);
				 hbtn.setAlignment(Pos.BOTTOM_RIGHT);
				 hbtn.getChildren().add(btn);
				grid.add(hbtn,1,6);
				
			/*	Button btn1=new Button("Reset");
				 HBox hbtn1=new HBox(50);
				 hbtn1.setAlignment(Pos.BOTTOM_LEFT);
				 hbtn1.getChildren().add(btn1);
			     grid.add(hbtn1,0,6);
			     */
			 	btn.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent e){
					
					BMR1 i=new BMR1();
					i.BMR1();
					
					
					}
				});
				
			Stage stage=new Stage();
			//Scene scene=new Scene(grid,800,550);
			
			stage.setScene(scene);
			stage.show();


	   
	   
   }
   public class BMR1 extends Button{
	   Label l1=new Label("BMR: ");
	   Text t1=new Text();
	   Text t2=new Text();
	   public void BMR1(){
		   GridPane grid=new GridPane();
		   Scene scene=new Scene(grid,300,200);
		   grid.setAlignment(Pos.CENTER);
		   grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			 Stage stage=new Stage();
			 stage.setScene(scene);
			 stage.show();
			 String p=sexText.getText();
			 String c="female";
			 String d="male";
			 float q=Float.parseFloat(activitylevel.getText());
			  float w =
		    	      Float.parseFloat(weightText.getText());
			float h=Float.parseFloat(hightText.getText());
			float a=Float.parseFloat(ageText.getText());
			// String w=weightText.getText();
			 //String h=hightText.getText();
			 //String a=ageText.getText();
			
				if(p.equalsIgnoreCase(c)){
				float bmr1=655+(9.6f*w)+(1.8f*h)-(4.7f*a);
				if(q<1){
					float bmr3=bmr1*1.2f;
				t1.setText(String.valueOf(bmr3));
				grid.add(l1,1,1);
				l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				grid.add(t1,2,1);
				t1.setFont(Font.font("o",FontWeight.NORMAL,20));
				}
				
				else if((q==1)||(q<=3)){
					float bmr4=bmr1*1.375f;
				t1.setText(String.valueOf(bmr4));
				grid.add(l1,1,1);
				l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				grid.add(t1,2,1);
				t1.setFont(Font.font("o",FontWeight.NORMAL,20));
				}
				
				else if((q==4)||(q<=5)){
					float bmr5=bmr1*1.55f;
				t1.setText(String.valueOf(bmr5));
				grid.add(l1,1,1);
				l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				grid.add(t1,2,1);
				t1.setFont(Font.font("o",FontWeight.NORMAL,20));
				}
				
				else	if((q==6)||(q<=8)){
					float bmr6=bmr1*1.725f;
				t1.setText(String.valueOf(bmr6));
				grid.add(l1,1,1);
				l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				grid.add(t1,2,1);
				t1.setFont(Font.font("o",FontWeight.NORMAL,20));
				}
				else if(q>=9){
					float bmr7=bmr1*1.9f;
				t1.setText(String.valueOf(bmr7));
				grid.add(l1,1,1);
				l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				grid.add(t1,2,1);
				t1.setFont(Font.font("o",FontWeight.NORMAL,20));
				}
				
				}
				
				if(p.equalsIgnoreCase(d)){
					float bmr2=66+(13.7f*w)+(5f*h)-(6.8f*a);
					if(q<1){
						float bmr3=bmr2*1.2f;
					t1.setText(String.valueOf(bmr3));
					grid.add(l1,1,1);
					l1.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(t1,2,1);
					t1.setFont(Font.font("o",FontWeight.NORMAL,20));
					}
					
					else if((q==1)||(q<=3)){
						float bmr4=bmr2*1.375f;
					t1.setText(String.valueOf(bmr4));
					grid.add(l1,1,1);
					l1.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(t1,2,1);
					t1.setFont(Font.font("o",FontWeight.NORMAL,20));
					}
					
					else if((q==4)||(q<=5)){
						float bmr5=bmr2*1.55f;
					t1.setText(String.valueOf(bmr5));
					grid.add(l1,1,1);
					l1.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(t1,2,1);
					t1.setFont(Font.font("o",FontWeight.NORMAL,20));
					}
					
					else	if((q==6)||(q<=8)){
						float bmr6=bmr2*1.725f;
					t1.setText(String.valueOf(bmr6));
					grid.add(l1,1,1);
					l1.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(t1,2,1);
					t1.setFont(Font.font("o",FontWeight.NORMAL,20));
					}
					else if(q>=9){
						float bmr7=bmr2*1.9f;
					t1.setText(String.valueOf(bmr7));
					grid.add(l1,1,1);
					l1.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(t1,2,1);
					t1.setFont(Font.font("o",FontWeight.NORMAL,20));
					
				
				}
				}
			 
			 //t1.setText(p);
			// grid.add(t1,1,1);
	   }
   }
}
