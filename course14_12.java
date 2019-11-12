import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class course14_12 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Rectangle rectangle1 = new Rectangle(50 , 200 , 100, 40);
        rectangle1.setFill(Color.RED);
        pane.getChildren().add(new Text(50 , 180 , "项目 -- 20%"));
        pane.getChildren().add(rectangle1);

        Rectangle rectangle2 = new Rectangle(200 , 220 , 100, 20);
        rectangle2.setFill(Color.BLUE);
        pane.getChildren().add(new Text(200 , 200 , "测试 -- 10%"));
        pane.getChildren().add(rectangle2);

        Rectangle rectangle3 = new Rectangle(350 , 180 , 100, 60);
        rectangle3.setFill(Color.GREEN);
        pane.getChildren().add(new Text(350 , 160 , "期中考试 -- 30%"));
        pane.getChildren().add(rectangle3);

        Rectangle rectangle4 = new Rectangle(500 , 160 , 100, 80);
        rectangle4.setFill(Color.ORANGE);
        pane.getChildren().add(new Text(500 , 140 , "期末考试 -- 40%"));
        pane.getChildren().add(rectangle4);


        Scene scene = new Scene(pane , 650 , 250);
        primaryStage.setTitle("course14_12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
