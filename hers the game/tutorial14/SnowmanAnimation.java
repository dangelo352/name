import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SnowmanAnimation extends Application {

	public static void main (String [] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Snowman Animation");
		Pane canvas = new Pane();
		Scene scene = new Scene(canvas, 900, 600);
		
		Circle cir2 = new Circle(450, 450, 100, Color.BLACK);
		Circle cir1 = new Circle(450, 450, 90, Color.WHITE);
		
		Circle cir3 = new Circle(450, 330, 70, Color.BLACK);
		Circle cir4 = new Circle(450, 330, 60, Color.WHITE);
		
		Circle cir5 = new Circle(450, 230, 50, Color.BLACK);
		Circle cir6 = new Circle(450, 230, 40, Color.WHITE);
		
		Circle leftEye = new Circle(440, 220, 5, Color.BLACK);
		Circle rightEye = new Circle(460, 220, 5, Color.BLACK);
		
		Polygon Nose =  new Polygon();
		Nose.getPoints().addAll(new Double[] {
				470.0, 250.0,
				455.0, 225.0,
				445.0, 235.0
		});
		Nose.setFill(Color.ORANGE);
		
		Rectangle ground1 = new Rectangle(0, 540, 900, 90);
		ground1.setFill(Color.BLACK);
		Rectangle ground2 = new Rectangle(0, 550, 900, 90);
		ground2.setFill(Color.WHITE);
		
		Rectangle hat1 = new Rectangle(400, 160, 100, 30);
		hat1.setFill(Color.BLACK);
		Rectangle hat2 = new Rectangle(420, 100, 60, 70);
		hat2.setFill(Color.BLACK);
		
		primaryStage.setScene(scene);
		canvas.getChildren().addAll(cir2, cir1, ground1, ground2, cir3, cir4, 
									cir5, cir6, leftEye, rightEye, Nose, hat1, 
									hat2);
		primaryStage.show();
	}
}