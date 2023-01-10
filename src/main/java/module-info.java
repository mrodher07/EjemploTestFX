module com.example.ejemplotestfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplotestfx to javafx.fxml;
    exports com.example.ejemplotestfx;
}