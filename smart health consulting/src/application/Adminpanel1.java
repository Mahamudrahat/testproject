package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import application.Desisepre.five;
import application.Desisepre.four;
import application.Desisepre.six;
import application.Desisepre.three;
import application.Desisepre.two;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Adminpanel1 extends Button {
	Label l=new Label("Disease ");
	Label l1=new Label("Syptoms");
	Button b=new Button("Next");
	Button b2=new Button("Next");
	Button b3=new Button("Next");
	Button b4=new Button("Next");
	Button b5=new Button("Next");
	Button b6=new Button("Next");
	Button b7=new Button("Next");
	Button b8=new Button("Next");
	Button b9=new Button("Next");
	Button b10=new Button("Next");
	Button b11=new Button("Next");
	TextField t=new TextField();
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
	Connection connection;
	Statement statement;
	String JDBC_DRIVER="com.mysql.jdbc.Driver";
	 String DB_URL="jdbc:mysql://localhost/desease1";
	public void Adminpanel1(){
			//public void start(Stage stage) {
				initializeDB();
				Pane pane=new Pane();
				Scene scene=new Scene(pane,550,600);
				//pane.setPrefSize(300, 500);
				pane.getChildren().addAll(l,t,b,l1);
				l.relocate(20,50);
				t.relocate(80, 50);
				b.relocate(250, 50);
				l1.relocate(20,100);
				t2.relocate(80, 100);
				b2.relocate(250, 100);
				t3.relocate(80, 150);
				b3.relocate(250, 150);
				t4.relocate(80, 200);
				b4.relocate(250, 200);
				t5.relocate(80, 250);
				b5.relocate(250, 250);
				t6.relocate(80, 300);
				b6.relocate(250, 300);
				t7.relocate(80, 350);
				b7.relocate(250, 350);
				t8.relocate(80, 400);
				b8.relocate(250, 400);
				t9.relocate(80, 450);
				b9.relocate(250, 450);
				t10.relocate(80, 500);
				b10.relocate(250, 500);
				t11.relocate(80, 550);
				b11.relocate(250, 550);
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
										//two t=new two();
										//t.two();
										//System.out.print("go to two");
										System.exit(0);
									}else{
										b3.setDisable(true);
										pane.getChildren().addAll(t4,b4);
										b4.setOnAction(ez ->{
											if(t4.getText().equals("no")){
												
												two t1=new two();
												t1.two();

												//System.exit(0);
											}
											else{
												b4.setDisable(true);
												pane.getChildren().addAll(t5,b5);
												b5.setOnAction(ez1 ->{
													if(t5.getText().equals("no")){
														
														three t2=new three();
														t2.three();

														//System.exit(0);
													}
													else{
														b5.setDisable(true);
														pane.getChildren().addAll(t6,b6);
														b6.setOnAction(ez2->{
															if(t6.getText().equals("no")){
																
																four t3=new four();
																t3.four();

																//System.exit(0);
															}
															else{
																b6.setDisable(true);
																pane.getChildren().addAll(t7,b7);
																b7.setOnAction(ez3->{
																	if(t7.getText().equals("no")){
																		
																		five t4=new five();
																		t4.five();

																		//System.exit(0);
																	}
																	else{
																		b7.setDisable(true);
																		pane.getChildren().addAll(t8,b8);
																		b8.setOnAction(ez4 ->{
																			if(t8.getText().equals("no")){
																				
																				six t5=new six();
																				t5.six();

																				//System.exit(0);
																			}
																			else{
																			b8.setDisable(true);
																			pane.getChildren().addAll(t9,b9);
																			b9.setOnAction(ez5->{
																				if(t9.getText().equals("no")){
																					
																					seven t6=new seven();
																					t6.seven();

																					//System.exit(0);
																				}
																				else{
																					b9.setDisable(true);
																		pane.getChildren().addAll(t10,b10);
																		b10.setOnAction(ez6->{
																			if(t10.getText().equals("no")){
																				
																				eight t7=new eight();
																				t7.eight();

																				//System.exit(0);
																			}
																			else{
																				b10.setDisable(true);
																	pane.getChildren().addAll(t11,b11);
																	b11.setOnAction(ez7->{
																		if(t11.getText().equals("no")){
																			
																			nine t7=new nine();
																			t7.nine();

																			//System.exit(0);
																		}
																		else{
																			b11.setDisable(true);
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
			public class two extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void two(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						String query="insert into tab1 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}
			public class three extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void three(){
					try{
						
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						String query="insert into tab2 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}

			public class four extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void four(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						String query="insert into tab3 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"' )";
					//	String query="insert into firsttb(Desease,symptom1,symptom1,symptom1,symptom3) values(?,?,?,?,?)";
						 
						statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}

			public class five extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void five(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						String query="insert into tab4 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"' ,'"+t6.getText()+"','"+t7.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}

			public class six extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void six(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						String query="insert into tab5 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"' )";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}


			public class seven extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void seven(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						
						String query="insert into tab6 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}
			public class eight extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void eight(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						
						String query="insert into tab7 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}
			public class nine extends Button{
				Label l=new Label("Suceesfully Insert ");
				public void nine(){
					try{
						initializeDB();

						Pane pane=new Pane();
						pane.setPrefSize(200, 300);
						pane.getChildren().add(l);
						Stage stage=new Stage();
						Scene scene=new Scene(pane);
						stage.setScene(scene);
						stage.show();
						
						String query="insert into tab8 values('"+t.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+t11.getText()+"')";
						 statement.executeUpdate(query);
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}



}