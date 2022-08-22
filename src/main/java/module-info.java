module com.example.dbautomation {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires java.sql;


    opens com.example.dbautomation to javafx.fxml;
    exports com.example.dbautomation;
}