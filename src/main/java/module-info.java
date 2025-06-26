module com.mycompany.calendarprueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calendarprueba to javafx.fxml;
    exports com.mycompany.calendarprueba;
}
