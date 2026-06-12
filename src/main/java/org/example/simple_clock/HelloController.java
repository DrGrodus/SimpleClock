package org.example.simple_clock;

import javafx.fxml.FXML;

import java.awt.*;
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
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(Color.cyan);
        timeLabel.setBackground(Color.black);
        startClock();
    }

    public void startClock() {
        do {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
            String timeNow = currentTime.format(formatter);
            time = timeNow;
            timeLabel.setText(timeNow);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
