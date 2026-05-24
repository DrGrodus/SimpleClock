package org.simple_clock.simple_clock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        stage.setTitle("¡Hello friend!");
//        System.out.println(getClass().getResource("main.fxml"));
//        System.out.println("Classpath: " + System.getProperty("java.class.path"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
