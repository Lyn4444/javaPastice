import javafx.application.Application;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class course14_9 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        for (int i = 1 ; i <= 2 ; i ++ ) {
            for (int j = 1 ; j <= 2 ; j ++ ) {
                Circle circle = new Circle(200 * i , 200 * j , 80);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                pane.getChildren().add(circle);

                Arc arc = new Arc(200 * i , 200 * j , 70 , 70 , 70 + 45 , 45);
                arc.setFill(Color.BLACK);
                arc.setStroke(Color.BLACK);
                arc.setType(ArcType.ROUND);
                pane.getChildren().add(arc);

                Arc arc1 = new Arc(200 * i , 200 * j , 70 , 70 , 160 + 45 , 45);
                arc1.setFill(Color.BLACK);
                arc1.setStroke(Color.BLACK);
                arc1.setType(ArcType.ROUND);
                pane.getChildren().add(arc1);

                Arc arc2 = new Arc(200 * i , 200 * j , 70 , 70 ,  250 + 45 , 45);
                arc2.setFill(Color.BLACK);
                arc2.setStroke(Color.BLACK);
                arc2.setType(ArcType.ROUND);
                pane.getChildren().add(arc2);

                Arc arc3 = new Arc(200 * i , 200 * j , 70 , 70 , 340 + 45 , 45);
                arc3.setFill(Color.BLACK);
                arc3.setStroke(Color.BLACK);
                arc3.setType(ArcType.ROUND);
                pane.getChildren().add(arc3);
            }
        }

        Scene scene = new Scene(pane , 660 , 660);
        primaryStage.setTitle("course14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
