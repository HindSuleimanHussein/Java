package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			HBox hbox = new HBox(10);
			hbox.setPadding(new Insets(20, 10, 10, 10));
			hbox.setAlignment(Pos.CENTER);
			
			Label lbl= new Label("Text Field");
			TextField txtf= new TextField();
			txtf.setPrefHeight(30);
			txtf.setPrefWidth(250);
			
			HBox bottombox = new HBox(10);
			bottombox.setPadding(new Insets(10, 10, 40, 10));
			bottombox.setAlignment(Pos.CENTER);
			
			Label lb2 = new Label("Column Size");
			TextField txtf2 = new TextField();
			
			RadioButton left = new RadioButton("Left");
			RadioButton right = new RadioButton("Right");
			RadioButton center = new RadioButton("Center");
			bottombox.getChildren().addAll(left, center, right, lb2, txtf2);
			bottombox.setScaleX(1.15);
			bottombox.setScaleY(1.15);
			
			ToggleGroup tg = new ToggleGroup();
			left.setToggleGroup(tg);
			right.setToggleGroup(tg);
			center.setToggleGroup(tg);
			hbox.getChildren().addAll(lbl, txtf);
			
			left.setOnAction(e->{
				txtf.setAlignment(Pos.CENTER_LEFT);
			});
			
			right.setOnAction(e->{
				txtf.setAlignment(Pos.CENTER_RIGHT);
			});
			
			center.setOnAction(e->{
				txtf.setAlignment(Pos.CENTER);
			});
			
			txtf2.setOnAction(e->{
				txtf.setPrefWidth(Integer.parseInt(txtf2.getText()));
			}); 
			
	
			
			root.setTop(hbox);
			root.setBottom(bottombox);
			Scene scene = new Scene(root,500,200);
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
