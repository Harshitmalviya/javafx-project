package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class radiobutton extends Application {
	Label response;
	public static void main(String[] args) {
		
		System.out.println("Launching javaFx Application");
	    launch(args);
	}
	public void start(Stage mystage) {
		mystage.setTitle("Demonstrate radio buttons");
	    FlowPane rootnode=new FlowPane(10,10);
	  rootnode.setAlignment(Pos.CENTER);
	  Scene myscene=new Scene(rootnode,500,400);
	  mystage.setScene(myscene);
	  Label ch=new Label("  Select a Transport type  ");
	  response=new Label("No transport selected");
	  // button to confirm transport selection
	  Button btn=new Button(" Confirm Transport Selection");
	  RadioButton train=new RadioButton("Train");
	  RadioButton Car=new RadioButton("Car");
	  RadioButton Plane=new RadioButton("AirPlane");
	  // create a toggle group
	  ToggleGroup tg=new ToggleGroup();
	  train.setToggleGroup(tg);
	  Car.setToggleGroup(tg);
	  Plane.setToggleGroup(tg);
	  
	  btn.setOnAction(new EventHandler<ActionEvent>(){
		  public void handle(ActionEvent ae) {
			  RadioButton rb=(RadioButton)tg.getSelectedToggle();
			  //display the selection
			  response.setText(rb.getText()+" is confirmed");
		  }
		  });
	  //add the separator  to better organize the graph
	 Separator separtor=new Separator();
	  separtor.setPrefWidth(1000);
	  //add the labels and buttons to the scene graph
	  rootnode.getChildren().addAll(ch,train,Car,Plane,separtor,btn,response);
	  mystage.show();
	}
	public void stop() {
		System.out.println("inside stop() method");}
	}
    
