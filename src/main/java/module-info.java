module com.example.se327sonarqubelab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.se327sonarqubelab to javafx.fxml;
    exports com.example.se327sonarqubelab;
}