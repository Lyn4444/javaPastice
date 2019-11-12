import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercise14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane =new FlowPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image1 = new Image("file:image/uk.gif");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:image/ca.gif");
        ImageView imageView2 = new ImageView(image2);

        pane.getChildren().addAll(imageView1, imageView2);

        Image image3 = new Image("file:image/china.gif");
        ImageView imageView3 = new ImageView(image3);

        Image image4 = new Image("file:image/us.gif");
        ImageView imageView4 = new ImageView(image4);

        pane.getChildren().addAll(imageView3, imageView4);

        Scene scene = new Scene(pane, 350, 250);
        primaryStage.setTitle("14_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
