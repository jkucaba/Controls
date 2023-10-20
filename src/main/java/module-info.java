module com.jakubku.controls.controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.controls.controls to javafx.fxml;
    exports com.jakubku.controls.controls;
}