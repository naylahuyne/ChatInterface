module com.example.chatinterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatinterface to javafx.fxml;
    exports com.example.chatinterface;
}