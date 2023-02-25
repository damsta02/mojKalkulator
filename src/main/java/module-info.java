module com.example.kalkulator23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kalkulator23 to javafx.fxml;
    exports com.example.kalkulator23;
}