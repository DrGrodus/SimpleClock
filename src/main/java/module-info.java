module org.simple_clock.simple_clock {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.simple_clock.simple_clock to javafx.fxml;
    exports org.simple_clock.simple_clock;
}
