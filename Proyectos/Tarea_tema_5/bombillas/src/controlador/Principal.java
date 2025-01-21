package controlador;

import estructuraDatos.Bombilla;

public class Principal {
    public static Bombilla[] bombillas = new Bombilla[5];
    public static void main(String[] args) throws Exception {
        bombillas[0] = new Bombilla(false, 20);
    }
}
