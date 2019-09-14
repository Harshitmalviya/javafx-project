package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class javafxtogglebutton extends Application {
	Label response;
	ToggleButton tb;
	public static void main(String[] args) {
		
	  	System.out.println("Launching javafx application");
	    launch(args);
	}
	public void start(Stage mystage) {
	  mystage.setTitle("JavaFX Buttons and Events");
	  FlowPane rootnode=new FlowPane(10,10);
	  rootnode.setAlignment(Pos.CENTER);
	  Scene myscene=new Scene(rootnode,500,400);
	  mystage.setScene(myscene);
	  response=new Label("Push a Button");
	  tb=new ToggleButton("On/Off");
	  //handle the action events for alpha button
	  tb.setOnAction(new EventHandler<ActionEvent>(){
	  public void handle(ActionEvent ae) { 
		  if(tb.isSelected())
		  response.setText("Button is On");
		  else response.setText("Button is Off");  
	  }
	  });
	  rootnode.getChildren().addAll(tb,response);
	  mystage.show();
	}
	public void stop() {
		System.out.println("inside stop() method");}
	}
