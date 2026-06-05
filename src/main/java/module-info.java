module org.example.simple_clock {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.simple_clock to javafx.fxml;
    exports org.example.simple_clock;
}