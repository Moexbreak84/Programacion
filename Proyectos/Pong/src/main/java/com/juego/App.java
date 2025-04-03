package com.juego;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // To do
        FXMLLoader loader = new FXMLLoader(App.class.getResource("ventanaJuego.fxml"));
        AnchorPane root = loader.load();

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PING PONG");
        primaryStage.show();
        root.requestFocus();
    }

    public static void main(String[] args) {
        // To do
        launch();
    }

}