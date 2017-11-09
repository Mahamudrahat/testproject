package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

	public class Bmi1 extends Button {
		Button btn=new Button("submit");
		public String Name;
		public  int Age;
		public float Weight;
		public float Hight;
		public float bmi;
		public String m;
		public float n;
		
		public Bmi1(){
			Name=new String();
			Age=0;
			Weight=0;
			Hight=0;
			
		}
		 public Bmi1(String name,int age,float weight,float hight){
			 Name=name;
			 Age=age;
			 Weight=weight;
			 Hight=hight;
			  
			  
		  }
		 
		 TextField weightText=new TextField();
		 TextField hightText=new TextField();
		 Label l=new Label();
			 public void Bmi1(){
				   GridPane grid=new GridPane();
				   Scene scene=new Scene(grid,850,550);
				   grid.setAlignment(Pos.CENTER);
				   grid.setHgap(10);
					grid.setVgap(10);
					grid.setPadding(new Insets(25,25,25,25));
					Label weight=new Label("Weight : ");
					grid.add(weight,0, 1);
					 weight.setFont(Font.font("o",FontWeight.NORMAL,20));
					
					 grid.add(weightText,1, 1);
					 Label hight=new Label("Hight    : ");
					grid.add(hight,0, 2);
					hight.setFont(Font.font("o",FontWeight.NORMAL,20));
			
					 grid.add(hightText,1, 2);
					
							// Button btn=new Button("Submit");
							 HBox hbtn=new HBox(50);
							 hbtn.setAlignment(Pos.BOTTOM_RIGHT);
							 hbtn.getChildren().addAll(btn);
							grid.add(hbtn,1,5);
							btn.setOnAction(new EventHandler<ActionEvent>(){
								public void handle(ActionEvent e){
								
								
								
									bmi1 i=new bmi1();
									i.bmi1();
								}
							});
							
							
						Stage stage=new Stage();
						//Scene scene=new Scene(grid,800,550);
						
						stage.setScene(scene);
						stage.show();


			
		 }
		
		/* public void  setmessage(){
			 if(bmi<18.5){
				 System.out.println("low weight\n");
				 System.out.println("need to ear proper food\n");
				 System.out.println("need to increase weight");
				 
			 }
			 else if((bmi==18.5 )|| (bmi<=24.9)){
				 System.out.println("Perfect health indication\n");
				 
			 }
			 else if((bmi==25 )|| (bmi<=29.9)){
				 System.out.println(" Fat\n");
				 System.out.println("need to exersize\n");
				 System.out.println("need to decrease weight");
				 
			 }
			 else if((bmi==30)||(bmi<=34.9)){
				 System.out.println(" 1st stage of Fat\n");
				 System.out.println("sparing to eat\n");
				 System.out.println("need to exercise");
			 }
			 else if((bmi==35)||(bmi<=39.9)){
				 System.out.println(" 2nd stage of Fat\n");
				 System.out.println("sparing to eat\n");
				 System.out.println("need to exercise");
			 }
			 else if(bmi>=40){
				 System.out.println(" Too much Fat\n");
				 System.out.println("risk to death\n");
				 System.out.println("need to consult doctor");
			 
			 }
		 }*/
			 public class bmi1 extends Button{
				 Label l=new Label("BMI :");
				 Text t=new Text();
				 
				 public void bmi1(){
					    float i =
					    	      Float.parseFloat(weightText.getText());
						float p=Float.parseFloat(hightText.getText());
						float bmi=i/(p*p);
						
						t.setText(String.valueOf(bmi));
						 
						//bmi=Float.parseFloat((Float) new DataFormat("##.##")).format(bmi));
						//l.setText(""+bmi);
						// l.setText(String.valueOf(bmi));
						// pane.getChildren().add(l);
					 Stage stage=new Stage();
					 GridPane grid=new GridPane();
					 grid.setAlignment(Pos.CENTER);
					
					 grid.add(l,0,1);
					 l.setFont(Font.font("o",FontWeight.NORMAL,20));
					 grid.add(t,1,1);
					 //l.relocate(200, 150);
					 
					// bmi.setText(String.valueOf(k));
					 
					 
					 Scene scene=new Scene(grid,300,400);
					 stage.setScene(scene);
					 stage.show();
					 if(bmi<18.5){
						 Text t1=new Text("low weight");
						 Text t2=new Text("need to eat proper food");
						 Text t3=new Text("need to increase weight");
						 
						 grid.add(t1,1,2);
						 grid.add(t2,1,3);
						 grid.add(t3,1,4);
						// System.out.println("low weight\n");
						// System.out.println("need to ear proper food\n");
						// System.out.println("need to increase weight");
						 
					 }
					 else if((bmi==18.5 )|| (bmi<=24.9)){
						 Text t4=new Text("perfect health indication");
						 grid.add(t4,1,2);
						// System.out.println("Perfect health indication\n");
						 
					 }
					 else if((bmi==25 )|| (bmi<=29.9)){
						 Text t5=new Text("FAT");
						 Text t6=new Text("Need to exersize");
						 Text t7=new Text("Need to Decrease weight");
						 
						 grid.add(t5,1,2);
						 grid.add(t6,1,3);
						 grid.add(t7,1,4);
						// System.out.println(" Fat\n");
						 //System.out.println("need to exersize\n");
						 //System.out.println("need to decrease weight");
						 
					 }
					 else if((bmi==30)||(bmi<=34.9)){
						 Text t8=new Text("1st stage of fat");
						 Text t9=new Text("Sparing to Eat");
						 Text t10=new Text("Need to exersize");
						 
						 grid.add(t8,1,2);
						 grid.add(t9,1,3);
						 grid.add(t10,1,4);
						// System.out.println(" 1st stage of Fat\n");
						 //System.out.println("sparing to eat\n");
						 //System.out.println("need to exercise");
					 }
					 else if((bmi==35)||(bmi<=39.9)){
						 Text t11=new Text(" 2nd stage of Fat\n");
						 Text t12=new Text("sparing to eat\n");
						 Text t13=new Text("need to exercise");
						 grid.add(t11,1,2);
						 grid.add(t12,1,3);
						 grid.add(t13,1,4);
					 }
					 else if(bmi>=40){
						 Text t14=new Text(" Too much Fat\n");
						 Text t15=new Text("risk to death\n");
						 Text t16=new Text("need to consult doctor");
					 
						 grid.add(t14,1,2);
						 grid.add(t15,1,3);
						 grid.add(t16,1,4);
					 }
					 }
				 }
			 }
		
	

