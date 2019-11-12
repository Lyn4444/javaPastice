import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercise14_2 extends Application{
    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(2);
        pane.setVgap(2);
        Image[] images = new Image[2];
        images[1] = new Image("file:image/x.gif");
        images[0] = new Image("file:image/o.gif");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int index = (int) (Math.random() * 3);
                if(index == 2)
                    continue;
                pane.add(new ImageView(images[index]), i, j);
            }
        }

        Scene scene = new Scene(pane, 120, 120);
        primaryStage.setTitle("14_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
