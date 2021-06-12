module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.all;

    opens ru.gb to javafx.fxml;
    exports ru.gb;
}
