package application;



import java.io.File;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
public class Welcome extends Application {
	File file=new File("rahat7.jpg");
	Image i=new Image(file.toURI().toString());
	ImageView ii=new ImageView(i);
	
	Button b=new Button("Admin Panel");
	Button b2=new Button("User");
	Button b3=new Button("Exit");
 public void  start(Stage stage){
	 
	 Pane pane=new Pane();
	  Text text=new Text("Smart Health Consulting");
	  text.setFont(Font.font("o",FontWeight.NORMAL,50));
	  text.setFill(Color.WHITE);
	  text.relocate(200, 100);
	 pane.setPrefSize(850, 550);
	 pane.getChildren().addAll(ii,b,b2,b3,text);
	 b.relocate(500, 200);
		b.setPrefSize(200, 50);
		b2.relocate(500, 260);
		b2.setPrefSize(200, 50);
		b3.relocate(500, 320);
		b3.setPrefSize(200, 50);
	 
	
	// Scene scene=new Scene(grid,800,550);
	 //primaryStage.setScene(scene);
	 //Text scenetitle=new Text("Welcome");
	// scenetitle.setFont(Font.font("o",FontWeight.BOLD,50));
	// grid.add(scenetitle,0,0,2,1);
	// Label userName=new Label("User Name : ");
	// grid.add(userName,0, 1);
	// userName.setFont(Font.font("o",FontWeight.NORMAL,20));
	// TextField userText=new TextField();
	// grid.add(userText,1, 1);
	// Label password=new Label("  Password  : ");
	// grid.add(password,0, 2);
	// password.setFont(Font.font("o",FontWeight.NORMAL,20));
	// PasswordField passw=new PasswordField();
	// grid.add(passw,1, 2);
	// Button btn=new Button("Sign In");
	 //HBox hbtn=new HBox(30);
	 //hbtn.getChildren().add(btn);
	//hbtn.relocate(500, 200);
		//hbtn.setPrefSize(200, 50);
	 
	

	 
	 
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
			
				User u=new User();
				u.User();
			}
		});

		b.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
			
				Adminpanel a=new Adminpanel();
				a.Adminpanel();
			}
		});

		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				Platform.exit();
			}
		});
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.show();
	 
 }
	public static void main(String[] args) {
		launch(args);
		// TODO Auto-generated method stub

	}

}

