package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
public class javafxlaunch extends Application {
	public static void main(String[] args) {
		
		System.out.println("Launching javafx application");
	    launch(args);
	}
	public void init()
	{
		System.out.println("inside the init() method");
	}
	public void start(Stage mystage) {
		System.out.println("inside the start() method");
		mystage.setTitle("JavaFX skeleton");
	  FlowPane rootnode=new FlowPane();
	  Scene myscene=new Scene(rootnode,500,300);
	  mystage.setScene(myscene);
	  mystage.show();
	}
	public void stop() {
		System.out.println("inside stop() method");}
	}
	

