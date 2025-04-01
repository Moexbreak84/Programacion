module com.juego {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.juego to javafx.fxml;
    exports com.juego;
}
