module com.mycompany.assignment02.carrace {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.media;

    opens com.mycompany.assignment02.carrace to javafx.fxml;
    exports com.mycompany.assignment02.carrace;
}
