package org.example.SimpleClock;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class SimpleClockController {

    private final Logger logger = Logger.getLogger(SimpleClockController.class.getName());

    @FXML
    private Label dateTimeLabel;
    String dateTime;

    public SimpleClockController() {
        startClock();
    }

    // Adapted from code of Kensoft PH https://kensoftph.com/how-to-get-current-time-in-java/
    public void startClock() {
        Thread thread = new Thread(() -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss a");
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
                LocalDateTime currentDateTime = LocalDateTime.now();
                dateTime = currentDateTime.format(formatter);
                Platform.runLater(() -> dateTimeLabel.setText(dateTime));
            }
        });
        thread.start();
    }
}
