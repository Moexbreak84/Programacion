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
    int puntoJ1 = 0;
    int puntoJ2 = 0;

    public void initialize() {
        bola.setLayoutX(100);
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
        bola.setCenterX(bola.getCenterX() + bolaVelocidadX);
        bola.setCenterY(bola.getCenterY() + bolaVelocidadY);
    }

    private void comprobarColisiones() {
        // Revote contra las paredes arriba y abajo
        if (bola.getCenterY() <=-300 || bola.getCenterY() >=300){
            bolaVelocidadY *= -1;
        }

        if(bola.getBoundsInParent().intersects(jugadorA.getBoundsInParent()) || bola.getBoundsInParent().intersects(jugadorB.getBoundsInParent())){
            bolaVelocidadX *= -1;
        }

        // Puntuacion
        if(bola.getCenterX() <=0){
            
            puntoJ2++;
            reiniciarBola();
        }else if(bola.getCenterY() >= 600){
            
            puntoJ1++;
            reiniciarBola();

            
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
            teclaPresionada(event.getCode()); 
    }

    private void teclaPresionada(KeyCode tecla) {
        // To do
        if(tecla == KeyCode.W){
            jugadorA.setLayoutY(jugadorA.getLayoutY()-10 );
        }else if(tecla == KeyCode.S){
            jugadorA.setLayoutY(jugadorA.getLayoutY()+10 );
            
        }
        if(tecla == KeyCode.W){
            jugadorB.setLayoutY(jugadorA.getLayoutY()-10 );
        }else if(tecla == KeyCode.S){
            jugadorB.setLayoutY(jugadorA.getLayoutY()+10 );
            
        }

    }

}
