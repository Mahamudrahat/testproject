package application;

import java.sql.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Desisepre extends Button{
	Button b=new Button("Next");
	Button b2=new Button("Next");
	Button b3=new Button("Next");
	Button b4=new Button("Next");
	Button b5=new Button("Next");
	Button b6=new Button("Next");
	Button b7=new Button("Next");
	TextField t=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	TextField t7=new TextField();
	Connection connection;
	Statement statement;
	String JDBC_DRIVER="com.mysql.jdbc.Driver";
	 String DB_URL="jdbc:mysql://localhost/desease1";	
	 public void JDBC(){
	//public void start(Stage stage) {
		initializeDB();
		Pane pane=new Pane();
		Scene scene=new Scene(pane,450,550);
		//pane.setPrefSize(300, 500);
		pane.getChildren().addAll(t,b);
		t.relocate(40, 50);
		b.relocate(210, 50);
		t2.relocate(40, 100);
		b2.relocate(210, 100);
		t3.relocate(40, 150);
		b3.relocate(210, 150);
		t4.relocate(40, 200);
		b4.relocate(210, 200);
		t5.relocate(40, 250);
		b5.relocate(210, 250);
		t6.relocate(40, 300);
		b6.relocate(210, 300);
		t7.relocate(40, 350);
		b7.relocate(210, 350);
		//Scene scene=new Scene(pane);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.show();
		b.setOnAction(e ->{
			if(t.getText().equals("no")){
				System.exit(0);
			}else{
				b.setDisable(true);
				pane.getChildren().addAll(t2,b2);
				b2.setOnAction(ex ->{
					if(t2.getText().equals("no")){
						System.exit(0);
					}else{
						b2.setDisable(true);
						pane.getChildren().addAll(t3,b3);
						b3.setOnAction(ey ->{
							if(t3.getText().equals("no")){
								two t=new two();
								t.two();
								System.out.print("go to two");
							}else{
								b3.setDisable(true);
								pane.getChildren().addAll(t4,b4);
								b4.setOnAction(ez ->{
									if(t4.getText().equals("no")){
										
										three t1=new three();
										t1.three();

										//System.exit(0);
									}
									else{
										b4.setDisable(true);
										pane.getChildren().addAll(t5,b5);
										b5.setOnAction(ez1 ->{
											if(t5.getText().equals("no")){
												
												four t2=new four();
												t2.four();

												//System.exit(0);
											}
											else{
												b5.setDisable(true);
												pane.getChildren().addAll(t6,b6);
												b6.setOnAction(ez2->{
													if(t6.getText().equals("no")){
														
														five t2=new five();
														t2.five();

														//System.exit(0);
													}
													else{
														b6.setDisable(true);
														pane.getChildren().addAll(t7,b7);
														b7.setOnAction(ez3->{
															if(t7.getText().equals("no")){
																
																six t2=new six();
																t2.six();

																//System.exit(0);
															}
															else{
																b6.setDisable(true);
															}
														});
													}
												});
												//if(t6.getText().equals("no")){
													//System.exit(0);
												//}
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
		
	}

	public void initializeDB() {
		try{
			Class.forName(JDBC_DRIVER);
			connection=DriverManager.getConnection(DB_URL,"root","");
			System.out.println("Successfully connected");
			statement=connection.createStatement();
			//Class.forName("com.mysql.jdbc.Driver");
			//connection=DriverManager.getConnection("jdbc:mysql://localhost/desease1"," ","");
		   //statement=connection.createStatement();		
	}
	catch(Exception ex){
		ex.printStackTrace();
		}
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}*/
	public class two extends Button{
		Label l=new Label();
		Text text2=new Text(" Deases Name :");
		Text text3=new Text("Sorry I Can't Detect Ur Disease ");

		public void two(){
			initializeDB();
			Pane pane=new Pane();
			pane.setPrefSize(400, 400);
			//pane.getChildren().add(l);
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			try{
				String sql="SELECT firsttb.Desease FROM firsttb WHERE (symptom1='"+t.getText()+"' OR symptom1='"+t2.getText()+"' ) AND (symptom2='"+t.getText()+"' OR symptom2='"+t2.getText()+"' ) AND (symptom3='"+t3.getText()+"') ";
				ResultSet rset=statement.executeQuery(sql);
				if(rset.next()){

					//	l.setText(rset.getString(1));
						text2.relocate(100, 200);
						 l.relocate(220, 200);
						 text2.setFont(Font.font("o",FontWeight.NORMAL,15));
						 l.setText(rset.getString(1));
						 l.setFont(Font.font("o",FontWeight.NORMAL,15));
						 l.setTextFill(Color.RED);
						   pane.getChildren().addAll(l,text2);
						//System.out.println("Disease Name : "+s);
					
					l.setText(rset.getString(1)); 
					//System.out.println("Disease Name : "+s);
				}
				else{
					 text3.relocate(100, 200);
					 text3.setFont(Font.font("o",FontWeight.NORMAL,21));
					 text3.setFill(Color.RED);
					   pane.getChildren().addAll(text3);
				}
			}catch(Exception e){
				
			}
		}
	}

	public class three extends Button{
		Label l=new Label();
		Text text=new Text(" Deases Name :");
		Text text1=new Text("Sorry I Can't Detect Ur Disease ");
		public void three(){
			initializeDB();
			Pane pane=new Pane();
			
			pane.setPrefSize(400, 400);
			
			 //  pane.getChildren().addAll(text,l);
		//	pane.getChildren().add(l);
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			try{
				String sql="SELECT firsttb.Desease FROM firsttb WHERE (symptom1='"+t.getText()+"' OR symptom1='"+t2.getText()+"'OR symptom1='"+t3.getText()+"' ) AND (symptom2='"+t.getText()+"' OR symptom2='"+t2.getText()+"' OR symptom2='"+t3.getText()+"' ) AND (symptom3='"+t.getText()+"' OR symptom3='"+t2.getText()+"' OR symptom3='"+t3.getText()+"' ) AND (symptom4='"+t4.getText()+"') "; 
				ResultSet rset=statement.executeQuery(sql);
				if(rset.next()){
				//	l.setText(rset.getString(1));
					 text.relocate(100, 200);
					 l.relocate(220, 200);
					 text.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setText(rset.getString(1));
					 l.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setTextFill(Color.RED);
					   pane.getChildren().addAll(l,text);
					//System.out.println("Disease Name : "+s);
				}
				else{
					 text1.relocate(100, 200);
					 text1.setFont(Font.font("o",FontWeight.NORMAL,21));
					 text1.setFill(Color.RED);
					   pane.getChildren().addAll(text1);
				}

			}catch(Exception e){
				
			}
		}
	}
	public class four extends Button{
		Label l=new Label();
		Text text=new Text(" Deases Name :");
		Text text1=new Text("Sorry I Can't Detect Ur Disease ");

		public void four(){
			initializeDB();
			Pane pane=new Pane();
			pane.setPrefSize(400, 400);
			//pane.getChildren().add(l);
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			try{
				String sql="SELECT firsttb.Desease FROM firsttb WHERE (symptom1='"+t.getText()+"' OR symptom1='"+t2.getText()+"'OR symptom1='"+t3.getText()+"' OR symptom1='"+t4.getText()+"' ) AND (symptom2='"+t.getText()+"' OR symptom2='"+t2.getText()+"' OR symptom2='"+t3.getText()+"' OR symptom2='"+t4.getText()+"' ) AND (symptom3='"+t.getText()+"' OR symptom3='"+t2.getText()+"' OR symptom3='"+t3.getText()+"' OR symptom3='"+t4.getText()+"' ) AND (symptom4='"+t.getText()+"' OR symptom4='"+t2.getText()+"'OR symptom4='"+t3.getText()+"' OR symptom4='"+t4.getText()+"' ) AND (symptom5='"+t5.getText()+"') "; 
				ResultSet rset=statement.executeQuery(sql);
				if(rset.next()){
					text.relocate(100, 200);
					 l.relocate(220, 200);
					 text.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setText(rset.getString(1));
					 l.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setTextFill(Color.RED);
					   pane.getChildren().addAll(l,text);
					//System.out.println("Disease Name : "+s);
				
			//	l.setText(rset.getString(1));
					l.setText(rset.getString(1));
					//System.out.println("Disease Name : "+s);
				}
				else{
					 text1.relocate(100, 200);
					 text1.setFont(Font.font("o",FontWeight.NORMAL,21));
					 text1.setFill(Color.RED);
					   pane.getChildren().addAll(text1);
				}
			}catch(Exception e){
				
			}
		}
	}

	public class five extends Button{
		Label l=new Label();
		Text text=new Text(" Deases Name :");
		Text text1=new Text("Sorry I Can't Detect Ur Disease ");

		public void five(){
			initializeDB();
			Pane pane=new Pane();
			pane.setPrefSize(400, 400);
			//pane.getChildren().add(l);
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			try{
				String sql="SELECT firsttb.Desease FROM firsttb WHERE  (symptom1='"+t.getText()+"' OR symptom1='"+t2.getText()+"' OR symptom1='"+t3.getText()+"' OR symptom1='"+t4.getText()+"' OR symptom1='"+t5.getText()+"' ) AND (symptom2='"+t.getText()+"' OR symptom2='"+t2.getText()+"' OR symptom2='"+t3.getText()+"' OR symptom2='"+t4.getText()+"' OR symptom2='"+t5.getText()+"' ) AND (symptom3='"+t.getText()+"' OR symptom3='"+t2.getText()+"' OR symptom3='"+t3.getText()+"' OR symptom3='"+t4.getText()+"' OR symptom3='"+t5.getText()+"') AND (symptom4='"+t.getText()+"' OR symptom4='"+t2.getText()+"'OR symptom4='"+t3.getText()+"' OR symptom4='"+t4.getText()+"' OR symptom4='"+t5.getText()+"' ) AND (symptom5='"+t.getText()+"' OR symptom5='"+t2.getText()+"' OR symptom5='"+t3.getText()+"' OR symptom5='"+t4.getText()+"' OR symptom5='"+t5.getText()+"' ) AND (symptom6='"+t6.getText()+"') "; 
				ResultSet rset=statement.executeQuery(sql);
				if(rset.next()){
					text.relocate(100, 200);
					 l.relocate(220, 200);
					 text.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setText(rset.getString(1));
					 l.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setTextFill(Color.RED);
					   pane.getChildren().addAll(l,text);
					//System.out.println("Disease Name : "+s);
				
			//	l.setText(rset.getString(1));
					l.setText(rset.getString(1));
					//System.out.println("Disease Name : "+s);
				}
				else{
					 text1.relocate(100, 200);
					 text1.setFont(Font.font("o",FontWeight.NORMAL,21));
					 text1.setFill(Color.RED);
					   pane.getChildren().addAll(text1);
				}
			}catch(Exception e){
				
			}
		}
	}
	public class six extends Button{
		Label l=new Label();
		Text text=new Text(" Deases Name :");
		Text text1=new Text("Sorry I Can't Detect Ur Disease ");

		public void six(){
			initializeDB();
			Pane pane=new Pane();
			pane.setPrefSize(400, 400);
			//pane.getChildren().add(l);
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.show();
			
			try{
				String sql="SELECT firsttb.Desease FROM firsttb WHERE  (symptom1='"+t.getText()+"' OR symptom1='"+t2.getText()+"' OR symptom1='"+t3.getText()+"' OR symptom1='"+t4.getText()+"' OR symptom1='"+t5.getText()+"'  OR symptom1='"+t6.getText()+"'  ) AND (symptom2='"+t.getText()+"' OR symptom2='"+t2.getText()+"' OR symptom2='"+t3.getText()+"' OR symptom2='"+t4.getText()+"' OR symptom2='"+t5.getText()+"'   OR symptom2='"+t6.getText()+"' ) AND (symptom3='"+t.getText()+"' OR symptom3='"+t2.getText()+"' OR symptom3='"+t3.getText()+"' OR symptom3='"+t4.getText()+"' OR symptom3='"+t5.getText()+"' OR symptom3='"+t6.getText()+"') AND (symptom4='"+t.getText()+"' OR symptom4='"+t2.getText()+"'OR symptom4='"+t3.getText()+"' OR symptom4='"+t4.getText()+"' OR symptom4='"+t5.getText()+"' OR symptom4='"+t6.getText()+"' ) AND (symptom5='"+t.getText()+"' OR symptom5='"+t2.getText()+"' OR symptom5='"+t3.getText()+"' OR symptom5='"+t4.getText()+"' OR symptom5='"+t5.getText()+"'  OR symptom5='"+t6.getText()+"') AND (symptom6='"+t.getText()+"' OR symptom6='"+t2.getText()+"' OR symptom6='"+t3.getText()+"' OR symptom6='"+t4.getText()+"' OR symptom6='"+t5.getText()+"'  OR symptom6='"+t6.getText()+"'  ) AND (symptom7='"+t7.getText()+"') "; 
				ResultSet rset=statement.executeQuery(sql);
				if(rset.next()){
					text.relocate(100, 200);
					 l.relocate(220, 200);
					 text.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setText(rset.getString(1));
					 l.setFont(Font.font("o",FontWeight.NORMAL,15));
					 l.setTextFill(Color.RED);
					   pane.getChildren().addAll(l,text);
					//System.out.println("Disease Name : "+s);
				
			//	l.setText(rset.getString(1));
					l.setText(rset.getString(1));
					//System.out.println("Disease Name : "+s);
				}
				else{
					 text1.relocate(100, 200);
					 text1.setFont(Font.font("o",FontWeight.NORMAL,21));
					 text1.setFill(Color.RED);
					   pane.getChildren().addAll(text1);
				}
			}catch(Exception e){
				
			}
		}
	}
}

