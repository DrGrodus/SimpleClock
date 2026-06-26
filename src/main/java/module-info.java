module org.example.SimpleClock {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.logging;


    opens org.example.SimpleClock to javafx.fxml;
    exports org.example.SimpleClock;
}
