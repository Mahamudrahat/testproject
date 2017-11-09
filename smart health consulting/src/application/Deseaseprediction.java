package application;
import java.io.File;
import java.sql.*;
import java.util.List;
import java.util.Scanner;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Deseaseprediction extends Button {
	File file=new File("rahat8.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	 Pane pane=new Pane();
	 Scene scene=new Scene(pane,850,650);
		Button b=new Button("submit");
		Button b1=new Button("submit");
		Button b2=new Button("submit");
		Button b3=new Button("submit");
		 Label l=new Label("symptom ");
		 Label l1=new Label("Please give another symptom ");
		 Label l2=new Label("please give me one more symptom ");
		 Label l3=new Label("please also need one symptom ");
		 Label l4=new Label();
		 Label l6=new Label();
		 Label l7=new Label();

	 TextField t=new TextField();
	 TextField t1=new TextField();
	 TextField t2=new TextField();
	 TextField t3=new TextField();
	


	// Text t1=new Text();
	//Button b=new Button("submit");
	// Label l=new Label("symptom :");
	// Text t=new Text();
	
	      //jdbc  driver name and database url
		//static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		//static final String DB_URL="jdbc:mysql://localhost/ practice1";
		//static final String USER="root";
		//static final String PASS="";
		
			// TODO Auto-generated method stub
	 
	 String JDBC_DRIVER="com.mysql.jdbc.Driver";
	 String DB_URL="jdbc:mysql://localhost/desease1";	
			Connection conn=null;
			Statement stmt=null;
			public void JDBC(){
			
				//Button b=new Button("submit");
				// Label l=new Label("symptom :");
				 l.setFont(Font.font("o",FontWeight.NORMAL,22));
				 l.setTextFill(Color.RED);
				 t.relocate(500, 100);
					t.setPrefSize(200, 30);
				 
				
				 pane.getChildren().addAll(ii,b,l,t);
				 l.relocate(400, 100);
					l.setPrefSize(100, 30);
					// t.relocate(500, 210);
						//t.setPrefSize(200, 30);
						 b.relocate(600, 150);
							b.setPrefSize(100, 30);
							b.setOnAction(new EventHandler<ActionEvent>(){
								public void handle(ActionEvent e){
								
									Deseaseprediction1 a=new Deseaseprediction1();
									a.Deseaseprediction1();
								}
							});
							Stage stage=new Stage();
							stage.setScene(scene);
							stage.show();
					/*b.setOnAction(new EventHandler<ActionEvent>(){
						public void handle(ActionEvent e){
						
							Deseaseprediction a=new Deseaseprediction();
							a.Deseaseprediction();
						}
					});*/

}
			public class Deseaseprediction1 extends Button{
			         public void Deseaseprediction1(){
			        	 
			        	 l1.setFont(Font.font("o",FontWeight.NORMAL,21));
			        	 l1.setTextFill(Color.RED);
						 t1.relocate(500, 200);
							t1.setPrefSize(200, 30);
						 
						
						 pane.getChildren().addAll(b1,l1,t1);
						 l1.relocate(210, 200);
							l1.setPrefSize(300, 30);
							// l5.relocate(300, 200);
								//l5.setPrefSize(200, 30);
							 b1.relocate(600, 250);
								b1.setPrefSize(100, 30);
								b1.setOnAction(new EventHandler<ActionEvent>(){
									public void handle(ActionEvent e){
									
										Deseaseprediction2 a=new Deseaseprediction2();
										a.Deseaseprediction2();
									}
								});
								
			        	 
			}
			
	}
			public class Deseaseprediction2 extends Button{
				public void Deseaseprediction2(){
					 l2.setFont(Font.font("o",FontWeight.NORMAL,21));
					 l2.setTextFill(Color.RED);
					 t2.relocate(500, 300);
						t2.setPrefSize(200, 30);
					 
					
					 pane.getChildren().addAll(b2,l2,t2);
					 l2.relocate(150, 300);
						l2.setPrefSize(400, 30);
						 b2.relocate(600, 350);
							b2.setPrefSize(100, 30);
							
								
							b2.setOnAction(new EventHandler<ActionEvent>(){
								public void handle(ActionEvent e){
								
									Deseaseprediction3 a=new Deseaseprediction3();
									a.Deseaseprediction3();
								}
							});
							
				}
			}
			public class Deseaseprediction3 extends Button{
				public void Deseaseprediction3(){
					 l3.setFont(Font.font("o",FontWeight.NORMAL,21));
					 l3.setTextFill(Color.RED);
					 t3.relocate(500, 400);
						t3.setPrefSize(200, 30);
					 
					
					 pane.getChildren().addAll(b3,l3,t3);
					 l3.relocate(200, 400);
						l3.setPrefSize(300, 30);
						 b3.relocate(600, 450);
							b3.setPrefSize(100, 30);
							b3.setOnAction(new EventHandler<ActionEvent>(){
								public void handle(ActionEvent e){
								
									Deseaseprediction4 a=new Deseaseprediction4();
									a.Deseaseprediction4();
								}
							});
							
				}
			}
				
public class Deseaseprediction4 extends Button{
	public  void Deseaseprediction4(){
		String p=t.getText();
		
		String q=t1.getText();
		String r=t2.getText();
		String s=t3.getText();
		Text text=new Text("I think ur disease is : ");
		Text text1=new Text("Sorry I Can't Detect Ur Disease ");
		try{
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,"root","");
			System.out.println("Successfully connected");
			stmt=conn.createStatement();}
		catch(SQLException se){
			//Handle error for jdbc
			se.printStackTrace();
		}catch(Exception e){
			//handle error for class.forName
			e.printStackTrace();
		}
		try{
		String sql1="SELECT firsttb.Desease FROM firsttb WHERE (symptom1='"+p+"' OR symptom1='"+q+"'OR symptom1='"+r+"' OR symptom1='"+s+"') AND (symptom2='"+p+"' OR symptom2='"+q+"' OR symptom2='"+r+"' OR symptom2='"+s+"') AND (symptom3='"+p+"' OR symptom3='"+q+"' OR symptom3='"+r+"' OR symptom3='"+s+"') AND (symptom4='"+p+"' OR symptom4='"+q+"'OR symptom4='"+r+"'OR symptom4='"+s+"') ";
			//String sql1="SELECT * FROM firsttb";
			ResultSet rs=stmt.executeQuery(sql1);
			if(rs.next()){
				String Desease=rs.getString(1);
				 text.relocate(300, 560);
				 text.setFont(Font.font("o",FontWeight.NORMAL,21));
				 text.setFill(Color.RED);
				l4.setText(rs.getString(1));
				 l4.setFont(Font.font("o",FontWeight.NORMAL,21));
				 l4.setTextFill(Color.RED);
				 l4.relocate(500, 550);
				//	l4.setPrefSize(400, 50);
					   pane.getChildren().addAll(l4,text);
						//String Desease=rs.getString("Desease");
						
						//System.out.println(" your desease :   "+ Desease);
			}
			else{
				 text1.relocate(300, 560);
				 text1.setFont(Font.font("o",FontWeight.NORMAL,21));
				 text1.setFill(Color.RED);
				   pane.getChildren().addAll(text1);
			}
			rs.close();
		}catch(SQLException se){
			//Handle error for jdbc
			se.printStackTrace();
		}
	}
}
				
			/*
			
		public class Deseaseprediction1 extends Button{
			public void Deseaseprediction1(){
				String p=t.getText();
				Text text=new Text("Have U feel following symptoms: ");
				 
			//	Label l1=new Label();
				Label l2=new Label();
				Label l3=new Label();
				Label l4=new Label();
				Label l5=new Label();
				Label l6=new Label();
				// l1.relocate(400, 350);
					//l1.setPrefSize(150, 200);
					 //l1.setFont(Font.font("o",FontWeight.NORMAL,20));
				 text.relocate(200, 350);
				 text.setFont(Font.font("o",FontWeight.NORMAL,20));
					 l2.relocate(400, 300);
						l2.setPrefSize(150, 200);
						 l2.setFont(Font.font("o",FontWeight.NORMAL,20));
						 l3.relocate(400, 330);
							l3.setPrefSize(150, 200);
							 l3.setFont(Font.font("o",FontWeight.NORMAL,20));
							 l4.relocate(400, 360);
								l4.setPrefSize(150, 200);
								 l4.setFont(Font.font("o",FontWeight.NORMAL,20));
								 l5.relocate(400, 390);
									l5.setPrefSize(150, 200);
									 l5.setFont(Font.font("o",FontWeight.NORMAL,20));
									 l6.relocate(400, 420);
										l6.setPrefSize(150, 200);
										 l6.setFont(Font.font("o",FontWeight.NORMAL,20));
				//TextField t=new TextField();
				try{
					Class.forName(JDBC_DRIVER);
					conn=DriverManager.getConnection(DB_URL,"root","");
					System.out.println("Successfully connected");
					stmt=conn.createStatement();}
				catch(SQLException se){
					//Handle error for jdbc
					se.printStackTrace();
				}catch(Exception e){
					//handle error for class.forName
					e.printStackTrace();
				}
				try{
				
					String sql1="SELECT symptom1,symptom2,symptom3,symptom4,symptom5,symptom6 FROM join_expression WHERE join_expression.symptom1='"+p+"'";
					ResultSet rs=stmt.executeQuery(sql1);
					//String symptom1=rs.getString(1);
					//System.out.println(symptom1);
					//System.out.println("its work");
					if(rs.next()){
						//retrive by column name
						//int s_id=rs.getInt("s_id");
						String symptom1=rs.getString(1);
						String symptom2=rs.getString(2);
						String symptom3=rs.getString(3);
						String symptom4=rs.getString(4);
						String symptom5=rs.getString(5);
						String symptom6=rs.getString(6);
					//	l1.setText(rs.getString(1));
						l2.setText(rs.getString(2));
						l3.setText(rs.getString(3));
						l4.setText(rs.getString(4));
						l5.setText(rs.getString(5));
						l6.setText(rs.getString(6));
				    pane.getChildren().addAll(text,l2,l3,l4,l5,l6);
				
				   
			
					}
					
					rs.close();
				}catch(SQLException se){
					//Handle error for jdbc
					se.printStackTrace();
				}/*finally{
					//finally block to user resource
					try{
						if(stmt!=null)
							conn.close();
					}catch(SQLException se){
						
					}
					try{
						if(conn!=null)
							conn.close();
					}catch(SQLException se){
						se.printStackTrace();
					}//end finally try
				}*/
			//}
		
			//}*/
		

	
}

