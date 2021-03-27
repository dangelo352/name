import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeListenerSample extends Application {

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Group root = new Group();
        primaryStage.setResizable(false);
        final Scene scene = new Scene(root, 400,80);
        primaryStage.setScene(scene);

        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

            @Override public void handle(final MouseEvent event)
            {
                if (!event.isAltDown())
                    return;

                final Circle circle = new Circle(event.getSceneX(), event.getSceneY(),30);
                circle.setFill(Color.YELLOW);
                root.getChildren().add(circle);

                circle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                    @Override public void handle(final MouseEvent arg0)
                    {
                        root.getChildren().remove(circle);
                    }
                });
            }
        });

        primaryStage.show();
    }

}