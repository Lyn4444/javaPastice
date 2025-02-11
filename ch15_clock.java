import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ch15_clock extends Application {
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();

        EventHandler<ActionEvent> eventHandler = e -> {
            clock.setCurrentTime();
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000) , eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clock , 400 , 400);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


class ClockPane extends Pane {
    private int hour , minute , second;
    private double w = 250 , h = 250;

    public ClockPane() {
        setCurrentTime();
    }

    public ClockPane(int hour , int minute , int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        paintClock();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;

        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;

        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

        paintClock();
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;

        paintClock();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;

        paintClock();
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();
    }

    protected void paintClock() {
        double clockRadius = Math.min(w , h) * 0.5 * 0.8;
        double centerX = w / 2;
        double centerY = h / 2;

        Circle circle = new Circle(centerX , centerY , clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Text text12 = new Text(centerX - 5 , centerY - clockRadius + 12 , "12");
        Text text9 = new Text(centerX - clockRadius + 3 , centerY + 5 , "9");
        Text text3 = new Text(centerX + clockRadius - 10 , centerY + 3 , "3");
        Text text6 = new Text(centerX - 3 , centerY + clockRadius - 3 , "6");

//        Text text1 = new Text(centerX + clockRadius , centerY - clockRadius , "1");

        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line line = new Line(centerX , centerY , secondX , secondY);
        line.setStroke(Color.RED);

        double mLength = clockRadius * 0.65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX , centerY , minuteX , minuteY);
        mLine.setStroke(Color.BLUE);

        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX , centerY , hourX , hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle , text9 , text12 , text3 , text6 , line , mLine , hLine);

    }
}
