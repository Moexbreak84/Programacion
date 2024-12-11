import aguadulce.Bombo;
import java.util.Scanner;

public class ejercicio1 {
    public static void Bombo1() {
        Scanner sc = new Scanner(System.in);
        Bombo miBombo = new Bombo(30);
        int numero1, numero2, numero3, numero4, numero5, bola_fuera, eleccion = 0, bombos;
        boolean leido = false;
        while (true) {
            try {
                mostrarMenu();
                eleccion = sc.nextInt();
                System.out.println("elige el tipo de bombo");
                if (eleccion == 0) {
                    System.out.println("Empieza el juego");
                } else if (eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4) {
                    System.out.println();
                    leido = true;
                } else {
                }
            } catch (Exception e) {
                System.out.println("Error");
                sc.next();
            }
            while (eleccion != 0) {
                System.out.println("");
            }
4
            for (int i = 30; i <= 90;) {
                if (eleccion = bola_fuera) {

                }
                switch (eleccion) {
                    case 1:
                        System.out.println("introduce el primer numero");
                        numero1 = sc.nextInt();
                        try {
                            numero1 = eleccion;
                            bola_fuera = numero1;
                        } catch (Exception e) {
                            System.out.println("el numero no esta en las bolas del bombo seleccionado");
                        }
                    case 2:
                        System.out.println("introduce el segundo numero");
                        numero2 = sc.nextInt();
                        try {
                            numero1 = eleccion;
                            bola_fuera = numero2;
                        } catch (Exception e) {
                            System.out.println("el numero no esta en las bolas del bombo seleccionado");
                        }
                    case 3:
                        System.out.println("introduce el tercer numero");
                        numero3 = sc.nextInt();
                        try {
                            numero1 = eleccion;
                            bola_fuera = numero3;
                        } catch (Exception e) {
                            System.out.println("el numero no esta en las bolas del bombo seleccionado");
                        }
                    case 4:
                        System.out.println("introduce el cuarto numero");
                        numero4 = sc.nextInt();
                        try {
                            numero1 = eleccion;
                            bola_fuera = numero4;
                        } catch (Exception e) {
                            System.out.println("el numero no esta en las bolas del bombo seleccionado");
                        }
                    case 5:
                        System.out.println("introduce el quinto numero");
                        numero5 = sc.nextInt();
                        try {
                            numero1 = eleccion;
                            bola_fuera = numero5;
                        } catch (Exception e) {
                            System.out.println("el numero no esta en las bolas del bombo seleccionado");
                        }
                    default:
                        System.out.println("los numeros elejidos son " + numero1 + " " + numero2 + " " + numero3 + " "
                                + numero4 + " " + numero5);
                        sc.close();
                        break;

                }
                bola_fuera = miBombo.extraerBola();
                System.out.println("la bola que ha salido es " + bola_fuera);
            }
        }

    }

    public static void mostrarMenu() {
        System.out.println("BOMBO\n" +
                "-----------\n" +
                "Elije una opcion\n1.-30 - Bolas\n2.-50 - Bolas\n3.-70 - Bolas\n4.-90 - Bolas\n0.Salir");
                switch(eleccion){
                    case 1:
                    System.out.println("has escogido el bombo vamos al juego ");
                    Bombo miBombo = new Bombo(30);
                    eleccion == miBombo;
                        break;
                    case 2:
                        System.out.println("has escogido el bombo vamos al juego ");
                        Bombo miBombo = new Bombo();
                        eleccion == miBombo;
                            break;
                            break;
                            case 1:
                            System.out.println("has escogido el bombo vamos al juego ");
                            Bombo miBombo = new Bombo(30);
                            eleccion == miBombo;
                                break;
                                case 1:
                                System.out.println("has escogido el bombo vamos al juego ");
                                Bombo miBombo = new Bombo(30);
                                eleccion == miBombo;
                                    break;

                }   default
                        break;

    }
}
