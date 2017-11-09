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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import application.Deseaseprediction.Deseaseprediction1;
import application.Deseaseprediction.Deseaseprediction4;
public class DeitChart1 extends Button {
	  Pane pane=new Pane();

		 String JDBC_DRIVER="com.mysql.jdbc.Driver";
		 String DB_URL="jdbc:mysql://localhost/desease1";	
				Connection conn=null;
				Statement stmt=null;
      Scene scene=new Scene(pane,850,650);
      Button b2=new Button("submit");
		Label l=new Label("To give BMR");
		TextField t=new TextField();
		public void DeitChart1(){
			l.relocate(350,100);
			l.setPrefSize(200, 30);
			 l.setFont(Font.font("o",FontWeight.NORMAL,20));
			t.relocate(500,100);
			t.setPrefSize(200, 30);
			b2.relocate(600,150);
			b2.setPrefSize(100, 30);
			 pane.getChildren().addAll(b2,l,t);
			 //pane.relocate(10, 20);
			 b2.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent e){
					
						DeitChart2 a=new DeitChart2();
						a.DeitChart2();
						
					}
					
				});
				Stage stage=new Stage();
				stage.setScene(scene);
				stage.show();
		}
		public class DeitChart2 extends Button{
			//Text t1=new Text();
			Button b=new Button("PieChart");
			Label l1=new Label("Fat :");
			Label l2=new Label("Protein :");
			Label l3=new Label("Carbohydrates :");
			Label l4=new Label("Sodium :");
			Label l5=new Label("Calcium :");
			Label l6=new Label("VitaminA :");
			Label l7=new Label("vitaminB :");
			Label l8=new Label("Fiber :");
			Label l9=new Label("Iron :");
			Label l10=new Label("grams");
			Label l11=new Label("grams");
			Label l12=new Label("grams");
			Label l13=new Label("mgrams");
			Label l14=new Label("mgrams");
			Label l15=new Label("IU");
			Label l16=new Label("mgrams");
			Label l17=new Label("grams");
			Label l18=new Label("mgrams");
			Label l19=new Label();
			Label l20=new Label();
			Label l21=new Label();
			Label l22=new Label();
			Label l23=new Label();
			Label l24=new Label();
			Label l25=new Label();
			Label l26=new Label();
			Label l27=new Label();
			
			Text t1=new Text("YOUR DAILY DIET CHART");
			public void DeitChart2(){
				b.relocate(540,550 );
				b.setPrefSize(100, 30);
				 t1.relocate(170, 250);
					
					 t1.setFont(Font.font("o",FontWeight.NORMAL,40));
				 l1.relocate(170, 200);
					l1.setPrefSize(150, 200);
					 l1.setFont(Font.font("o",FontWeight.NORMAL,20));

				 l2.relocate(170, 230);
					l2.setPrefSize(150, 200);
					 l2.setFont(Font.font("o",FontWeight.NORMAL,20));
					 l3.relocate(130, 260);
						l3.setPrefSize(200, 200);
						 l3.setFont(Font.font("o",FontWeight.NORMAL,20));
						 l4.relocate(170, 290);
							l4.setPrefSize(150, 200);
							 l4.setFont(Font.font("o",FontWeight.NORMAL,20));
							 l5.relocate(170, 320);
								l5.setPrefSize(150, 200);
								 l5.setFont(Font.font("o",FontWeight.NORMAL,20));
								 l6.relocate(170, 350);
									l6.setPrefSize(150, 200);
									 l6.setFont(Font.font("o",FontWeight.NORMAL,20));
				 l7.relocate(170, 380);
					l7.setPrefSize(150, 200);
					 l7.setFont(Font.font("o",FontWeight.NORMAL,20));
					 l8.relocate(170, 410);
						l8.setPrefSize(150, 200);
						 l8.setFont(Font.font("o",FontWeight.NORMAL,20));
						 l9.relocate(170, 440);
							l9.setPrefSize(150, 200);
							 l9.setFont(Font.font("o",FontWeight.NORMAL,20));
							 l10.relocate(400, 200);
								l10.setPrefSize(150, 200);
								 l10.setFont(Font.font("o",FontWeight.NORMAL,20));
								 l11.relocate(400, 230);
									l11.setPrefSize(150, 200);
									 l11.setFont(Font.font("o",FontWeight.NORMAL,20));
				 l12.relocate(400, 260);
					l12.setPrefSize(150, 200);
					 l12.setFont(Font.font("o",FontWeight.NORMAL,20));
					 l13.relocate(400, 290);
						l13.setPrefSize(150, 200);
						 l13.setFont(Font.font("o",FontWeight.NORMAL,20));
						 l14.relocate(400, 320);
							l14.setPrefSize(150, 200);
							 l14.setFont(Font.font("o",FontWeight.NORMAL,20));
							 l15.relocate(400, 350);
								l15.setPrefSize(150, 200);
								 l15.setFont(Font.font("o",FontWeight.NORMAL,20));
								 l16.relocate(400, 380);
									l16.setPrefSize(150, 200);
									 l16.setFont(Font.font("o",FontWeight.NORMAL,20));
									 l17.relocate(400, 410);
										l17.setPrefSize(150, 200);
										 l17.setFont(Font.font("o",FontWeight.NORMAL,20));
										 l18.relocate(400, 440);
											l18.setPrefSize(150, 200);
											 l18.setFont(Font.font("o",FontWeight.NORMAL,20));
											 l19.relocate(300, 200);
												l19.setPrefSize(150, 200);
												 l19.setFont(Font.font("o",FontWeight.NORMAL,20));

											 l20.relocate(300, 230);
											l20.setPrefSize(150, 200);
										 l20.setFont(Font.font("o",FontWeight.NORMAL,20));
										 l21.relocate(300, 260);
											l21.setPrefSize(200, 200);
											 l21.setFont(Font.font("o",FontWeight.NORMAL,20));
													 l22.relocate(300, 290);
														l22.setPrefSize(150, 200);
														 l22.setFont(Font.font("o",FontWeight.NORMAL,20));
														 l23.relocate(300, 320);
															l23.setPrefSize(150, 200);
															 l23.setFont(Font.font("o",FontWeight.NORMAL,20));
															 l24.relocate(300, 350);
																l24.setPrefSize(150, 200);
																 l24.setFont(Font.font("o",FontWeight.NORMAL,20));
											 l25.relocate(300, 380);
												l25.setPrefSize(150, 200);
												 l25.setFont(Font.font("o",FontWeight.NORMAL,20));
												 l26.relocate(300, 410);
													l26.setPrefSize(150, 200);
													 l26.setFont(Font.font("o",FontWeight.NORMAL,20));
													 l27.relocate(300, 440);
														l27.setPrefSize(150, 200);
									 l27.setFont(Font.font("o",FontWeight.NORMAL,20));
				float p=Float.parseFloat(t.getText());
				int q=(int)p/100;
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
					String sql1="SELECT fat,protein,carbohydrates,sodium,calcium,vitaminA,vitaminC,fiber,iron FROM dietchart WHERE calories='"+q+"'";
					ResultSet rs=stmt.executeQuery(sql1);
					while(rs.next()){
						String fat=rs.getString(1);
						String protein=rs.getString(2);
						String carbohydrates=rs.getString(3);
						String sodium=rs.getString(4);
						String calcium=rs.getString(5);
						String vitaminA=rs.getString(6);
						String vitaminC=rs.getString(7);
						String fiber=rs.getString(8);
						String iron=rs.getString(9);
						l19.setText(rs.getString(1));
						l20.setText(rs.getString(2));
						l21.setText(rs.getString(3));
						l22.setText(rs.getString(4));
						l23.setText(rs.getString(5));
						l24.setText(rs.getString(6));
						l25.setText(rs.getString(7));
						l26.setText(rs.getString(8));
						l27.setText(rs.getString(9));
						pane.getChildren().addAll(t1,l1,l2,l3,l4,l5,l6,l7,l8,
								l9,l10,l11,l12,l13,
								l14,l15,l16,l17,l18,l19,l20,l21,
								l22,l23,l24,l25,l26,l27,b);
						 b.setOnAction(new EventHandler<ActionEvent>(){
								public void handle(ActionEvent e){
								
									pc a1=new pc();
									a1.dc();
									
								}
								
							});

						
					}
					rs.close();
				}catch(SQLException se){
					//Handle error for jdbc
					se.printStackTrace();
				}
			}
		}
		public class pc extends Button {
			//Button b=new Button("press");
			//TextField t=new TextField();
			Text t1=new Text("Fat");
			Text t2=new Text("Protein");
			Text t3=new Text("Carbohydrates");
			Text t4=new Text("Sodium");
			Text t5=new Text("Calcium");
			Text t6=new Text("VitaminA");
			Text t7=new Text("VitaminB");
			Text t8=new Text("Fiber");
			Text t9=new Text("Iron");
			Connection connection;
			Statement statement;
			String JDBC_DRIVER="com.mysql.jdbc.Driver";
			 String DB_URL="jdbc:mysql://localhost/desease1";
			 ObservableList<Data> answer = FXCollections.observableArrayList();
			public void dc(){
				initializeDB();
				Pane pane=new Pane();
				PieChart piechart=new PieChart();
				pane.setPrefSize(600,500);
				//t.relocate(40, 50);
			//	b.relocate(210, 50);
		        piechart.relocate(100, 80);
				//pane.getChildren().addAll(t,b);
		        Stage stage=new Stage();
				Scene scene=new Scene(pane);
				
				stage.setScene(scene);
				stage.show();
				float p=Float.parseFloat(t.getText());
				int q=(int)p/100;
				
					try{
						String sql="SELECT fat,protein,carbohydrates,sodium,calcium,vitaminA,vitaminC,fiber,iron FROM dietchart where calories='"+q+"'  ";
						ResultSet rs=statement.executeQuery(sql);
						while(rs.next()){
							answer.addAll(new PieChart.Data(t1.getText(),rs.getDouble(1)),
									new PieChart.Data(t2.getText(),rs.getDouble(2)),new PieChart.Data(t3.getText(),rs.getDouble(3)),
									new PieChart.Data(t4.getText(),rs.getDouble(4)),
									new PieChart.Data(t5.getText(),rs.getDouble(5)),new PieChart.Data("vitamanA",rs.getDouble(6)),
									new PieChart.Data(t7.getText(),rs.getDouble(7)),
									new PieChart.Data(t8.getText(),rs.getDouble(8)),new PieChart.Data(t9.getText(),rs.getDouble(9)));
							//System.out.println("Disease Name : "+s);
							piechart.getData().addAll(answer);
							pane.getChildren().add(piechart);
							System.out.println("Successfully ");
						}
					}catch(Exception e1){
						
					}
				
				
				
			}
			private void initializeDB() {
				try{
					Class.forName(JDBC_DRIVER);
					connection=DriverManager.getConnection(DB_URL,"root","");
					System.out.println("Successfully connected");
					statement=connection.createStatement();
					//Class.forName("com.mysql.jdbc.Driver");
					//connection=DriverManager.getConnection("jdbc:mysql://localhost/desease1"," ","");
				   //statement=connection.createStatement();		
			}catch(Exception ex){
				ex.printStackTrace();
				}
				
			}
		}
	}

