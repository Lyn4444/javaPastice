import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class course14_6 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        int standard = 40;
        for (int i = 0 ; i < 8 ; i ++ ) {
            for (int j = 0 ; j < 8 ; j ++ ) {
                Rectangle rectangle = new Rectangle(i * standard , j *standard , 40 , 40);
                if ((i + j) % 2 == 0) {
                    rectangle.setStroke(Color.BLACK);
                    rectangle.setFill(Color.WHITE);
                }else {
                    rectangle.setStroke(Color.BLACK);
                    rectangle.setFill(Color.BLACK);
                }
                pane.getChildren().add(rectangle);
            }
        }

        Scene scene = new Scene(pane , 320 , 320);
        primaryStage.setTitle("course14_6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
