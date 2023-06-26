package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane mainroot = new BorderPane();
			Pane root = new Pane();
			String style = "-Fx-border-width:2;-Fx-border-color:black";
			
			VBox vbox = new VBox(10);
			vbox.setAlignment(Pos.CENTER);
			vbox.setStyle(style);
			vbox.setLayoutX(150);
			vbox.setLayoutY(50);
			
			Circle c1red = new Circle(50, Color.WHITE);
			c1red.setStroke(Color.BLACK);
			
			Circle c2yellow = new Circle(50, Color.WHITE);
			c2yellow.setStroke(Color.BLACK);
			
			Circle c3green = new Circle(50, Color.WHITE);
			c3green.setStroke(Color.BLACK);
			
			vbox.getChildren().addAll(c1red,c2yellow,c3green);

			HBox hbox = new HBox(10);
			RadioButton redradio = new RadioButton("Red");
			RadioButton yellowradio = new RadioButton("Yellow");
			RadioButton greenradio = new RadioButton("Green");
			
			ToggleGroup tg = new ToggleGroup();
			redradio.setToggleGroup(tg);
			yellowradio.setToggleGroup(tg);
			greenradio.setToggleGroup(tg);
			
			hbox.getChildren().addAll(redradio,yellowradio,greenradio);
			hbox.setLayoutX(120);
			hbox.setLayoutY(380);
			hbox.setScaleX(1.5);
			hbox.setScaleY(1.5);
			
			redradio.setOnAction( new EventHandler<ActionEvent> (){
				@Override
				public void handle(ActionEvent arg0){
					c1red.setFill(Color.DARKRED);
					c2yellow.setFill(Color.WHITE);
					c3green.setFill(Color.WHITE);
				}
			});
			
			yellowradio.setOnAction( new EventHandler<ActionEvent> (){
				@Override
				public void handle(ActionEvent arg0){
					c1red.setFill(Color.WHITE);
					c2yellow.setFill(Color.YELLOW);
					c3green.setFill(Color.WHITE);
				}
			});
			
			greenradio.setOnAction( new EventHandler<ActionEvent> (){
				@Override
				public void handle(ActionEvent arg0){
					c1red.setFill(Color.WHITE);
					c3green.setFill(Color.DARKGREEN);
					c2yellow.setFill(Color.WHITE);
				}
			});
			
			mainroot.setCenter(root);
			root.getChildren().addAll(vbox, hbox);
			Scene scene = new Scene(mainroot,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
