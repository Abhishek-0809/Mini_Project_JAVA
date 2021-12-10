module com.example.number_converter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.number_converter to javafx.fxml;
    exports com.example.number_converter;
}