module com.example.sliderdemofx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.sliderdemofx to javafx.fxml;
    exports com.example.sliderdemofx;
}