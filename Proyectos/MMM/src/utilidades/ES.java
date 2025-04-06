package utilidades;

import java.io.*;
import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static String leerArchivo(String ruta) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }

    public static void escribirArchivo(String ruta, String contenido, boolean sobreEscribir) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, !sobreEscribir))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}