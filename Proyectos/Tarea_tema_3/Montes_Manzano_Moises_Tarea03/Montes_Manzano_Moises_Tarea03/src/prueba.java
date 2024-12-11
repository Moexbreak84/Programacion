import aguadulce.Bombo;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBolas = 0;
        int[] opciones = { 30, 50, 70, 90 };

        // Solicitar al usuario el número de bolas para el bombo
        while (true) {
            try {
                mostrarMenu();
                numBolas = sc.nextInt();
                if (numBolas == 0) {
                    System.out.println("Saliendo del programa.");
                    return;
                } else if (numBolas == 30 || numBolas == 50 || numBolas == 70 || numBolas == 90) {
                    break;
                } else {
                    System.out.println("Número de bolas no válido. Por favor, elige entre 30, 50, 70 o 90.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.next(); // Limpiar la entrada no válida
            }
        }

        Bombo miBombo = new Bombo(numBolas);
        Set<Integer> valoresDefinidos = new HashSet<>();

        // Solicitar al usuario los 5 valores definidos
        while (valoresDefinidos.size() < 5) {
            try {
                System.out.print("Introduce un valor definido (entre 1 y " + numBolas + "): ");
                int valor = sc.nextInt();
                if (valor < 1 || valor > numBolas) {
                    System.out.println("Valor fuera de rango. Debe estar entre 1 y " + numBolas + ".");
                } else if (!valoresDefinidos.add(valor)) {
                    System.out.println("El valor ya ha sido introducido.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.next(); // Limpiar la entrada no válida
            }
        }

        // Sacar bolas del bombo hasta obtener los 5 valores definidos
        Set<Integer> valoresObtenidos = new HashSet<>();
        int intentos = 0;
        StringBuilder resultados = new StringBuilder();

        while (!valoresObtenidos.containsAll(valoresDefinidos)) {
            try {
                int bola = miBombo.extraerBola();
                resultados.append(bola).append(" ");
                valoresObtenidos.add(bola);
                intentos++;
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        // Mostrar resultados
        System.out.println("Resultados de los lanzamientos: " + resultados.toString().trim());
        System.out.println("Número de intentos necesarios: " + intentos);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("BOMBO\n" +
                "-----------\n" +
                "Elige una opción\n1.- 30 Bolas\n2.- 50 Bolas\n3.- 70 Bolas\n4.- 90 Bolas\n0.- Salir");
    }
}
