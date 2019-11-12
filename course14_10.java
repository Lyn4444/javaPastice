import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class course14_10 extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Ellipse ellipse1 = new Ellipse(150 , 100 , 100 , 50);
        ellipse1.setStroke(Color.BLACK);
        ellipse1.setFill(Color.WHITE);
        pane.getChildren().add(ellipse1);

        Arc arc = new Arc(150 , 300 , 100 , 50 , 0 + 180 , 180);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        arc.setType(ArcType.OPEN);
        pane.getChildren().add(arc);

        Arc arc2 = new Arc(150 , 300 , 100 , 50 , -180 + 180 , 180);
        arc2.getStrokeDashArray().addAll(6.0 , 21.0);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);
        arc2.setType(ArcType.OPEN);
        pane.getChildren().add(arc2);

        Line line1 = new Line(50 , 100 , 50 , 300);
        line1.setStroke(Color.BLACK);
        pane.getChildren().add(line1);

        Line line2 = new Line(250 , 100 , 250 , 300);
        line2.setStroke(Color.BLACK);
        pane.getChildren().add(line2);

        Scene scene = new Scene(pane , 660 , 660);
        primaryStage.setTitle("course14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
