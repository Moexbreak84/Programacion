package com.juego;

import javafx.animation.AnimationTimer;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class ControladorJuego {
    // To do
    @FXML
    private Circle bola;
    @FXML
    private AnchorPane contenedor;
    @FXML
    private Rectangle jugadorA;
    @FXML
    private Rectangle jugadorB;
    @FXML
    private Label marcadorLabel;
    private AnimationTimer gameLoop;
    private int bolaVelocidadY = 3;
    private int bolaVelocidadX = 3;

    public void initialize() {
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> startGame());
        pause.play();
    }

    private void startGame() {
        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                movimientoBola();
                comprobarColisiones();
            }
        };
        gameLoop.start();
    }

    private void movimientoBola() {
        // To do
        bola.setCenterX(bola.getCenterX() + bolaVelocidadX);
        bola.setCenterY(bola.getCenterY() + bolaVelocidadY);
    }

    private void comprobarColisiones() {
        // To do
        if ()

        // Puntuacion
        if(bola.getCenterX() <=0){
            puntoJ2*++;
            resetBola();
        }else if(bola.getCenterY() >= 600){
            puntoJ1*++;
            resetBola();
        }
    }

    private void reiniciarBola() {
        // To do
        // Pausa antes de reiniciar el movimiento
        gameLoop.stop();
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> gameLoop.start());
        pause.play();
    }

    @FXML
    private void mover(KeyEvent event) {
        // To do
    }

    private void teclaPresionada(KeyCode tecla) {
        // To do
    }
}
