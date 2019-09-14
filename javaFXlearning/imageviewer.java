package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.image.*;
public class imageviewer extends Application {
	Label response;
	public static void main(String[] args) {
		
		System.out.println("Launching javafx application");
	    launch(args);
	}
	public void start(Stage mystage) {
		mystage.setTitle("use image with buttons");
	  FlowPane rootnode=new FlowPane(10,10);
	  rootnode.setAlignment(Pos.CENTER);
	  Scene myscene=new Scene(rootnode,500,400);
	  mystage.setScene(myscene);
	  response=new Label("Push a Button");
	  Button alp=new Button("cartoon pic",new ImageView("harshit.jpg"));
	  Button bet=new Button("messi pic",new ImageView("messi.jpg"));
	  
	  // position the text under the image
	  alp.setContentDisplay(ContentDisplay.TOP);
	  bet.setContentDisplay(ContentDisplay.TOP);
	  
	  //handle the action events for alpha button
	  alp.setOnAction(new EventHandler<ActionEvent>(){
	  public void handle(ActionEvent ae) {
		  response.setText("Alpha was pressed");}
	  });
	  
	  bet.setOnAction(new EventHandler<ActionEvent>(){
		  public void handle(ActionEvent ae) {
			  response.setText("Beta was pressed");}
		  });
	  //add the labels and buttons to the scene graph
	  rootnode.getChildren().addAll(alp,bet,response);
	  mystage.show();
	}
	public void stop() {
		System.out.println("inside stop() method");}
	}
