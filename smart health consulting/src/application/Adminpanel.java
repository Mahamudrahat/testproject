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
import javafx.stage.Stage;

import java.io.File;
import java.sql.*;

import application.Deseaseprediction.Deseaseprediction1;
public class Adminpanel extends Button {
	File file=new File("rahat7.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	 TextField userText=new TextField();
		PasswordField passw=new PasswordField();
		 TextField t=new TextField();
		 TextField t1=new TextField();
		 TextField t2=new TextField();
		 TextField t3=new TextField();
		 TextField t4=new TextField();
		 TextField t5=new TextField();
		 TextField t6=new TextField();
		 TextField t7=new TextField();
		 TextField t8=new TextField();
		 TextField t9=new TextField();
		 TextField t10=new TextField();
		 TextField t11=new TextField();
		 TextField t12=new TextField();
		 TextField t13=new TextField();
		 TextField t14=new TextField();
		 TextField t15=new TextField();
		 TextField t16=new TextField();
		 TextField t17=new TextField();
		 TextField t18=new TextField();
		 TextField t19=new TextField();
		GridPane grid=new GridPane();
		 String JDBC_DRIVER="com.mysql.jdbc.Driver";
		 String DB_URL="jdbc:mysql://localhost/desease1";	
				Connection conn=null;
				Statement stmt=null;
	public void Adminpanel(){
		
		Stage stage=new Stage();
	//GridPane grid=new GridPane();
	Scene scene=new Scene(grid,850,550);
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setPadding(new Insets(25,25,25,25));
		 //primaryStage.setScene(scene);
		 //Text scenetitle=new Text("Welcome");
		// scenetitle.setFont(Font.font("o",FontWeight.BOLD,50));
		// grid.add(scenetitle,0,0,2,1);
		Label userName=new Label("User Name : ");
		grid.add(userName,0, 1);
		 userName.setFont(Font.font("o",FontWeight.NORMAL,20));
		// TextField userText=new TextField();
		 grid.add(userText,1, 1);
		 Label password=new Label("  Password  : ");
		grid.add(password,0, 2);
		password.setFont(Font.font("o",FontWeight.NORMAL,20));
		//PasswordField passw=new PasswordField();
		grid.add(passw,1, 2);
		Button btn=new Button("Sign In");
		 HBox hbtn=new HBox(50);
		 hbtn.setAlignment(Pos.BOTTOM_RIGHT);
		 hbtn.getChildren().add(btn);
		grid.add(hbtn,1,4);
	
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
			
				adminlogin1 a=new adminlogin1();
				a.adminlogin1();
			//stage.hide();
			}
		});
	//Stage stage=new Stage();
	//Scene scene=new Scene(grid,800,550);
	
	stage.setScene(scene);
	stage.show();
	
	}
	public class adminlogin1 extends Button{
		Label l5=new Label("Please enter your correct ");
		Label l6=new Label("username OR password ");
		 
		public void adminlogin1(){
			
			try{
				Class.forName(JDBC_DRIVER);
				conn=DriverManager.getConnection(DB_URL,"root","");
				System.out.println("Successfully connected");
				stmt=conn.createStatement();
			
				String query="select Name,Password from adminpanel where Name='"+userText.getText()+"'and Password='"+passw.getText()+"'";
				ResultSet rset = stmt.executeQuery(query);
				if(rset.next()){
					
					adminlogin2 s=new adminlogin2();
					s.adminlogin2();
					//Adminpanel1 s=new Adminpanel1();
					//s.Adminpanel1();
				} else{
					 l5.setFont(Font.font("o",FontWeight.NORMAL,20));
					 l6.setFont(Font.font("o",FontWeight.NORMAL,20));
					grid.add(l5,1,6);
					grid.add(l6,1,7);
					//System.out.println("please enter correct username and password");
				}
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
		}
	public class adminlogin2 extends Button{
		Button b=new Button("Disease insertion");
		Button b1=new Button("Food's calories insertion");
		public void adminlogin2(){
			 Pane pane=new Pane();
			 pane.setPrefSize(450, 380);
			 b.relocate(250, 150);
			 b.setPrefSize(150, 30);
			 b1.relocate(250, 200);
			 b1.setPrefSize(150, 30);
			 pane.getChildren().addAll(b,b1);
			 b.setOnAction(e->{
				 //adminlogin3 s=new adminlogin3();
					//s.adminlogin3();
				 Adminpanel1 s=new Adminpanel1();
				 s.Adminpanel1();
			 });
			 b1.setOnAction(e->{
				 adminlogin5 s=new adminlogin5();
					s.adminlogin5();
			 });
			 Stage stage=new Stage();
				Scene scene=new Scene(pane);
				stage.setScene(scene);
				stage.show();
		}
	}

	public class adminlogin3 extends Button{

		public void adminlogin3(){
			 Pane pane=new Pane();
			 //Scene scene=new Scene(pane,850,650);
			 pane.setPrefSize(850, 550);
			// TextField t=new TextField();
			// TextField t1=new TextField();
			// TextField t2=new TextField();
			// TextField t3=new TextField();
			// TextField t4=new TextField();
			 
			Button b=new Button("submit");
			 Label l=new Label("Disease :");
			 Label l1=new Label("Symptom1 :");
			 Label l2=new Label("Symptom2 :");
			 Label l3=new Label("Symptom3 :");
			 Label l4=new Label("Symptom4 :");
			 Label l5=new Label("Symptom5 :");
			 Label l6=new Label("Symptom6 :");
			 Label l7=new Label("Symptom7 :");


			 l.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l1.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l2.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l3.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l4.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l5.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l6.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l7.setFont(Font.font("o",FontWeight.NORMAL,20));
			 t.relocate(500, 100);
				t.setPrefSize(200, 30);
				 t1.relocate(500, 150);
					t1.setPrefSize(200, 30);
					 t2.relocate(500, 200);
						t2.setPrefSize(200, 30);
						 t3.relocate(500, 250);
							t3.setPrefSize(200, 30);
							 t4.relocate(500, 300);
								t4.setPrefSize(200, 30);
								 t5.relocate(500, 350);
									t5.setPrefSize(200, 30);
									 t6.relocate(500, 400);
										t6.setPrefSize(200, 30);
										 t7.relocate(500, 450);
											t7.setPrefSize(200, 30);
		
											

						 
			
			 pane.getChildren().addAll(b,l,l1,l2,l3,l4,l5,l6,l7,t,t1,t2,t3,t4,t5,t6,t7);
			 l.relocate(400, 100);
				l.setPrefSize(100, 50);
				 l1.relocate(390, 150);
					l1.setPrefSize(250, 50);
					 l2.relocate(390, 200);
						l2.setPrefSize(250, 50);
						 l3.relocate(390, 250);
							l3.setPrefSize(250, 50);
							 l4.relocate(390, 300);
								l4.setPrefSize(250, 50);
								 l5.relocate(390, 350);
									l5.setPrefSize(250, 50);
									 l6.relocate(390, 400);
										l6.setPrefSize(250, 50);
										 l7.relocate(390, 450);
											l7.setPrefSize(250, 50);
											 
										
												
												
				// t.relocate(500, 210);
					//t.setPrefSize(200, 30);
					 b.relocate(600, 500);
						b.setPrefSize(80, 20);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						b.setOnAction(new EventHandler<ActionEvent>(){
							public void handle(ActionEvent e){
								
							
								adminlogin4 a=new adminlogin4();
								a.adminlogin4();
								if((t1.getText().equals("no")) ||(t2.getText().equals("no")) || (t3.getText().equals("no")) || (t4.getText().equals("no")) ||(t5.getText().equals("no")) || (t6.getText().equals("no")) || (t7.getText().equals("no"))){
									//System.exit(0);
									stage.hide();
								}
								}
							//stage.hide();
							
						});
						
		}
	
		
	}
	
	public class adminlogin4 extends Button{
		String de=t.getText();
    	String s1=t1.getText();
    	String s2=t2.getText();
    	String s3=t3.getText();
    	String s4=t4.getText();
    	String s5=t5.getText();
    	String s6=t6.getText();
    	String s7=t7.getText();
    
		public void adminlogin4(){
			
			try{
				Class.forName(JDBC_DRIVER);
				conn=DriverManager.getConnection(DB_URL,"root","");
				System.out.println("Successfully connected");
				stmt=conn.createStatement();
			
				String query="insert into firsttb values('"+de+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
				 stmt.executeUpdate(query);
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
		}
	public class adminlogin5 extends Button{

		public void adminlogin5(){
			 Pane pane=new Pane();
			 //Scene scene=new Scene(pane,850,650);
			 pane.setPrefSize(850, 650);
			// TextField t=new TextField();
			// TextField t1=new TextField();
			// TextField t2=new TextField();
			// TextField t3=new TextField();
			// TextField t4=new TextField();
			 
			Button b=new Button("submit");
			 Label l=new Label("calories :");
			 Label l1=new Label("Pat :");
			 Label l2=new Label("protein :");
			 Label l3=new Label("Carbrohyrades :");
			 Label l4=new Label("Sodium :");
			 Label l5=new Label("Calcium :");
			 Label l6=new Label("VitaminA :");
			 Label l7=new Label("VitaminC :");
			 Label l8=new Label("Fiber :");
			 Label l9=new Label("Iron  :");
			 


			 l.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l1.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l2.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l3.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l4.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l5.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l6.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l7.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l8.setFont(Font.font("o",FontWeight.NORMAL,20));
			 l9.setFont(Font.font("o",FontWeight.NORMAL,20));
			 
			 t8.relocate(500, 100);
				t8.setPrefSize(200, 30);
				 t9.relocate(500, 150);
					t9.setPrefSize(200, 30);
					 t10.relocate(500, 200);
						t10.setPrefSize(200, 30);
						 t11.relocate(500, 250);
							t11.setPrefSize(200, 30);
							 t12.relocate(500, 300);
								t12.setPrefSize(200, 30);
								 t13.relocate(500, 350);
									t13.setPrefSize(200, 30);
									 t14.relocate(500, 400);
										t14.setPrefSize(200, 30);
										 t15.relocate(500, 450);
											t15.setPrefSize(200, 30);
		
											t16.relocate(500, 500);
											t16.setPrefSize(200, 30);
											t17.relocate(500, 550);
											t17.setPrefSize(200, 30);

						 
			
			 pane.getChildren().addAll(b,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17);
			 l.relocate(400, 100);
				l.setPrefSize(100, 50);
				 l1.relocate(410, 150);
					l1.setPrefSize(250, 50);
					 l2.relocate(390, 200);
						l2.setPrefSize(250, 50);
						 l3.relocate(350, 250);
							l3.setPrefSize(250, 50);
							 l4.relocate(390, 300);
								l4.setPrefSize(250, 50);
								 l5.relocate(390, 350);
									l5.setPrefSize(250, 50);
									 l6.relocate(390, 400);
										l6.setPrefSize(250, 50);
										 l7.relocate(390, 450);
											l7.setPrefSize(250, 50);
											l8.relocate(390, 500);
											l8.setPrefSize(200, 30);
											l9.relocate(390, 550);
											l9.setPrefSize(200, 30);
				// t.relocate(500, 210);
					//t.setPrefSize(200, 30);
					 b.relocate(600, 600);
						b.setPrefSize(80, 20);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						b.setOnAction(new EventHandler<ActionEvent>(){
							public void handle(ActionEvent e){
								
							
								adminlogin6 a=new adminlogin6();
								a.adminlogin6();
								//if((t1.getText().equals("no")) ||(t2.getText().equals("no")) || (t3.getText().equals("no")) || (t4.getText().equals("no")) ||(t5.getText().equals("no")) || (t6.getText().equals("no")) || (t7.getText().equals("no"))){
									//System.exit(0);
									//stage.hide();
								//}
								}
							//stage.hide();
							
						});
						
		}
	
		
	}
	public class adminlogin6 extends Button{
	//	String de=t8.getText();
    	String s1=t9.getText();
    	String s2=t10.getText();
    	String s3=t11.getText();
    	String s4=t12.getText();
    	String s5=t13.getText();
    	String s6=t14.getText();
    	String s7=t15.getText();
    	String s8=t16.getText();
    	String s9=t15.getText();

    	float p=Float.parseFloat(t8.getText());
		int q=(int)p/100;
    	
    
		public void adminlogin6(){
			
			try{
				Class.forName(JDBC_DRIVER);
				conn=DriverManager.getConnection(DB_URL,"root","");
				System.out.println("Successfully connected");
				stmt=conn.createStatement();
			
				String query="insert into dietchart values('"+q+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')";
				 stmt.executeUpdate(query);
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
		}
	
}
