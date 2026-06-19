package org.example.simple_clock;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloController {

    @FXML
    private Label timeLabel;

    SimpleDateFormat timeFormat;
    String time;

    public HelloController() {
        timeFormat = new SimpleDateFormat("HH:mm:ss a");

        timeLabel = new Label();
        timeLabel.setFont(new Font("Verdana", 150));
        timeLabel.setBackground(Background.fill(Color.BLACK));
        startClock();
    }

    // Adapted from code of Kensoft PH https://kensoftph.com/how-to-get-current-time-in-java/
    public void startClock() {
        Thread thread = new Thread(() -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LocalTime currentTime = LocalTime.now();
                time = currentTime.format(formatter);
                Platform.runLater(() -> timeLabel.setText(time));
            }
        });
        thread.start();
    }
}
