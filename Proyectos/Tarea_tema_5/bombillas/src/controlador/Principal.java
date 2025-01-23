package controlador;

import estructuraDatos.Bombilla;
import utilidades.ES;

public class Principal {
    private static Bombilla[] bombillas = new Bombilla[5];
    public static void main(String[] args) throws Exception {
        /*int opcion;
        bombillas[0] = new Bombilla(false, 20);
        do{
            mostrarMenu();
            opcion = ES.leerEntero(null, opcion, opcion);
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    if(!agregar()){
                        System.out.println();
                    }
                    System.out.println("Agregando");
                    break;
                case 2:
                    System.out.println("Saliendo");
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
            
                default:
                    break;
            }
        }while(opcion != 0);
    }

    private static void mostrarMenu(){
        System.out.println();
    }
    
    private boolean eliminarBombilla(int){
        for(int i = 0; i < led.length-1; i++){
            if(objeto[i]==null){
                led[i] = led[i+1];
                led[i+1] = null;
            }
        }
    }

    private Boolean mostrarBombilla() {
        for(int i = 0; i < led.length; i++){
            if(led[i] != null){
                System.out.println(i + " " +led[i].toString());
            }
        }*/

        ES.leerEntero("hola soy pedro", 0, 20);
    }

}
