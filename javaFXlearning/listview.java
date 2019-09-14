 package javaFXlearning;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;
public class listview extends Application {
	Label response;
	public static void main(String[] args) {
		
		System.out.println("Launching javaFx Application");
	    launch(args);
	}
	public void start(Stage mystage) {
		mystage.setTitle("List view demo");
	    FlowPane rootnode=new FlowPane(10,10);
	  rootnode.setAlignment(Pos.CENTER);
	  Scene myscene=new Scene(rootnode,500,400);
	  mystage.setScene(myscene);
	  response=new Label("Select transport type");
	  // create an observablelist of entries for the list views
	  ObservableList<String> types=FXCollections.observableArrayList("train","car","motorcycle","plane");
	  // create list view
	  
	  ListView<String> lv=new ListView<>(types);	  
	  lv.setPrefSize(150,80);
	  
	  //get the listview selection model
	 MultipleSelectionModel<String> model=lv.getSelectionModel();
	  
	  model.selectedItemProperty().addListener(new ChangeListener<String>() {
		  public void changed(ObservableValue<? extends String> changed,String oldval,String newval)
		  {
			 //display the collection
			  response.setText("Transport selected is "+ newval);
		  }
	  });
	  rootnode.getChildren().addAll(lv,response);
	  mystage.show();
	}
	public void stop() {
		System.out.println("inside stop() method");}
	}
    

