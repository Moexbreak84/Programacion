package controlador;

import estructuraDatos.Bombilla;

public class Principal {
    public static void main(String[] args) throws Exception {
        Bombilla b1 = new Bombilla(false);
        System.out.println(b1.toString());
    }
}
