package org.simple_clock.simple_clock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600,600, Color.LIGHTBLUE);

        Text text = new Text();
        text.setText("Hola, hola interfaz");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(200);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStroke(Color.BLACK);
        rectangle.setRotate(90);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0,300.0,
                400.0,400.0,
                300.0,400.0
                );
        triangle.setFill(Color.PURPLE);

        Circle circle = new Circle();
        circle.setCenterX(450);
        circle.setCenterY(450);
        circle.setRadius(50);
        circle.setFill(Color.GOLD);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        stage.setScene(scene);
        stage.show();
    }
}
