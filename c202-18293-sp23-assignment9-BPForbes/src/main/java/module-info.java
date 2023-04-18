module com.example.moveball {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.moveball to javafx.fxml;
    exports com.example.moveball;
}