package edu.djc.simpleswitch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App with Scene switching without FXML
 */
public class App extends Application {
	
	// window dimensions
    private int WIDTH = 300;
	private int HEIGHT = 150;
	
	@Override
    public void start(Stage stage) {
    	// 1st scene graph
    	var layout1 = new VBox();
    	var text1 = new Label("^^^^^^Scene 1^^^^^^");
    	var btn1 = new Button("Change scene");
    	
    	layout1.getChildren().addAll(btn1, text1);

    	/* graphe de scène 1
    	 * 
    	 * VBox layout1
    	 * |
    	 * |---Button btn1
    	 * |
    	 * `---Label text1 
    	 */
    	
    	// 2nd scene graph
    	var layout2 = new HBox();
    	var text2 = new Label("Scene 2-------->");
    	var btn2 = new Button("Change scene");
    	
    	layout2.getChildren().addAll(text2, btn2);
    	
    	/* graphe de scène 2
    	 * 
    	 * HBox layout2
    	 * |
    	 * |---Label text2
    	 * |
    	 * `---Button btn2
    	 */
    	
    	// initial scene
    	var displaying = new Scene(layout1, WIDTH, HEIGHT);
    	
    	// scene changing logic
    	btn1.setOnAction(e -> displaying.setRoot(layout2));
    	btn2.setOnAction(e -> displaying.setRoot(layout1));
    	
    	// show window
        stage.setScene(displaying);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}