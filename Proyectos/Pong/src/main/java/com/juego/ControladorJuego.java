package com.juego;

import javafx.animation.AnimationTimer;
import javafx.animation.PauseTransition;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

public class ControladorJuego {
    // To do
    private AnimationTimer gameLoop;

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
    }

    private void comprobarColisiones() {
        // To do
    }

    private void reiniciarBola() {
        // To do
        // Pausa antes de reiniciar el movimiento
        gameLoop.stop();
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> gameLoop.start());
        pause.play();
    }


    private void mover(KeyEvent event) {
        // To do
    }

    private void teclaPresionada(KeyCode tecla) {
        // To do
    }
}
