module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.driver.core;
    requires org.mongodb.bson;
    requires java.desktop;
    requires twilio;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
}