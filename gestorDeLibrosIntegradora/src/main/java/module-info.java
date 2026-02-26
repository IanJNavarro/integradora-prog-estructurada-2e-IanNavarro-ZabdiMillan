module com.example.gestordelibrosintegradora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gestordelibrosintegradora to javafx.fxml;
    exports com.example.gestordelibrosintegradora;
}