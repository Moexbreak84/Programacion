
package com.juego;

import java.util.HashSet;
import java.util.Set;

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
    int puntoJ1 = 0;
    int puntoJ2 = 0;

    public void initialize() {
        // bola.setLayoutX(100);
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
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
        bola.setCenterX(bola.getCenterX() + bolaVelocidadX);
        bola.setCenterY(bola.getCenterY() + bolaVelocidadY);
    }

    private void comprobarColisiones() {
        // Revote contra las paredes arriba y abajo
        if (bola.getCenterY() <= -300 || bola.getCenterY() >= 300) {
            bolaVelocidadY *= -1;
        }

        if (bola.getBoundsInParent().intersects(jugadorA.getBoundsInParent())
                || bola.getBoundsInParent().intersects(jugadorB.getBoundsInParent())) {
            bolaVelocidadX *= -1;
        }

        // Puntuacion
        if (bola.getCenterX() <= 0) {

            puntoJ2++;
            reiniciarBola();
        } else if (bola.getCenterY() >= 600) {

            puntoJ1++;
            reiniciarBola();
        }
    }

    private void reiniciarBola() {
        // Pausa antes de reiniciar el movimiento
        gameLoop.stop();
        PauseTransition pause = new PauseTransition(Duration.seconds(6));
        pause.setOnFinished(event -> gameLoop.start());
        pause.play();
    }

    @FXML
    private void mover(KeyEvent event) {
        teclaPresionada(event.getCode());
    }

    private void teclaPresionada(KeyCode tecla) {
        // declaracion limites para jugadores
        int limiteSuperior = 1;
        int limiteInferior = 501;
        // movimiento con limites pero falta que funcionen simultaneos
        if (tecla == KeyCode.W) {
            if (jugadorA.getLayoutY() > limiteSuperior) {
                jugadorA.setLayoutY(jugadorA.getLayoutY() - 30);
            }
        } else if (tecla == KeyCode.S) {
            if (jugadorA.getLayoutY() < limiteInferior) {
                jugadorA.setLayoutY(jugadorA.getLayoutY() + 30);
            }
        }
        if (tecla == KeyCode.UP) {
            if (jugadorB.getLayoutY() > limiteSuperior) {
                jugadorB.setLayoutY(jugadorB.getLayoutY() - 30);
            }
        } else if (tecla == KeyCode.DOWN) {
            if (jugadorB.getLayoutY() < limiteInferior) {
                jugadorB.setLayoutY(jugadorB.getLayoutY() + 30);
            }
        }
    }

}
