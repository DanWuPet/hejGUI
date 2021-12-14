module com.example.hejgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hejgui to javafx.fxml;
    exports com.example.hejgui;
}