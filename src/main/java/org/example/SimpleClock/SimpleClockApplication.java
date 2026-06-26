package org.example.SimpleClock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SimpleClockApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SimpleClockApplication.class.getResource("SimpleClockView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 100);

        String css = Objects.requireNonNull(getClass().getResource("SimpleClockStyles.css")).toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("SimpleClock");
        stage.setScene(scene);
        stage.show();
    }
}
