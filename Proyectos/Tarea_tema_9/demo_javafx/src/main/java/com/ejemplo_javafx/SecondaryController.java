package com.ejemplo_javafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToTertiary() throws IOException {
        App.setRoot("tertiary");
    }
}