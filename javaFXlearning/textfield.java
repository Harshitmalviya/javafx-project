package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class textfield extends Application {
	Label response;TextField tf;
	public static void main(String[] args) {
		
		System.out.println("Launching javaFx Application");
	    launch(args);
	}
	public void start(Stage mystage) {
		mystage.setTitle("Demonstrate radio buttons");
	    FlowPane rootnode=new FlowPane(10,10);
	  rootnode.setAlignment(Pos.CENTER);
	  Scene myscene=new Scene(rootnode,400,200);
	  mystage.setScene(myscene);
	  //create the textfield that will report the contents of the textField
	  response=new Label("Search String : ");
	  // button to confirm transport selection
	  Button btn=new Button("Get Search String");
	  //create a textfield
	  tf= new TextField();
	  //set the prompt
	  tf.setPromptText("enter the search string");
	  tf.setPrefColumnCount(15);
	  //,handle the events for the textField
	  tf.setOnAction(new EventHandler<ActionEvent>()
	  {
		  public void handle(ActionEvent ae) {
			  response.setText("Search String: "+tf.getText());
		  }
		  });
	  // get the text from the textfield and display it when the button is pressed
	  btn.setOnAction(new EventHandler<ActionEvent>(){
		  public void handle(ActionEvent ae) {
			  response.setText("Search String: "+tf.getText());
		  }
		  });
	  //add the separator  to better organize the graph
	 Separator separtor=new Separator();
	  separtor.setPrefWidth(180);
	  //add the labels and buttons to the scene graph
	  rootnode.getChildren().addAll(tf,separtor,btn,response);
	  mystage.show();
	}
}