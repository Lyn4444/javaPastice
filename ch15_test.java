import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class ch15_test extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button buttonOk = new Button("Ok");
        Button buttonCancel = new Button("Cancel");
        OKHandlerClass handlerOk = new OKHandlerClass();
        buttonOk.setOnAction(handlerOk);
        CancelHandlerClass handlerCancel = new CancelHandlerClass();
        buttonCancel.setOnAction(handlerCancel);
        pane.getChildren().addAll(buttonOk , buttonCancel);

        Scene scene = new Scene(pane , 400 , 300);
        primaryStage.setTitle("ch15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


class OKHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}


class CancelHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Cancel button clicked");
    }
}
