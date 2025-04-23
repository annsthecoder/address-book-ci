module com.example.address {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.address to javafx.fxml;
    exports com.example.address;
    exports com.example.address.Controller;
    opens com.example.address.Controller to javafx.fxml;
    exports com.example.address.Model;
    opens com.example.address.Model to javafx.fxml;
}