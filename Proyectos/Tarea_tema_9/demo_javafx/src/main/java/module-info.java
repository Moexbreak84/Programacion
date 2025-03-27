module com.ejemplo_javafx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.ejemplo_javafx to javafx.fxml;
    exports com.ejemplo_javafx;
}
