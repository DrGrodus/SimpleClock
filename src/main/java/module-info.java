module org.example.simple_clock {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires java.desktop;


    opens org.example.simple_clock to javafx.fxml;
    exports org.example.simple_clock;
}
