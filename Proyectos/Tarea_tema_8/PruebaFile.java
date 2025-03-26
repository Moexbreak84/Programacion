package Proyectos.Tarea_tema_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaFile {
    
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de uso de FileWriter en JAVA";
        String fichero1 = "fichero1.txt";
        String fichero2 = "fichero2.txt";
        String fichero3 = "fichero3.txt";

        // Escribir en fichero1.txt
        try (FileWriter fileWriter = new FileWriter(fichero1)) {
            fileWriter.write(texto);
            System.out.println("Se ha escrito en el fichero1 correctamente");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero1");
            e.printStackTrace();
        }

        // Leer de fichero2.txt
        try (FileReader fileReader = new FileReader(fichero2)) {
            int caracter;
            System.out.println("Contenido del archivo " + fichero2 + ":");
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero2 no fue encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero2");
            e.printStackTrace();
        }

        // Escribir en fichero3.txt
        try (PrintWriter pw = new PrintWriter(new FileWriter(fichero3))) {
            pw.print("Esto es un texto sin salto de línea");
            pw.println(" NUEVO PALABRA");
            pw.println("Esto es un texto con salto de línea");
            pw.println(4.5455);
            Arrays.stream(new int[] { 1, 2, 3, 4, 10 })
                    .filter(n -> n > 2)
                    .map(n -> n * 2)
                    .forEach(n -> pw.println(n));
        } catch (FileNotFoundException e) {
            System.out.println("Fichero3 no encontrado");
        } catch (IOException e) {
            System.out.println("Problemas al escribir en el fichero3");
        }

        // Leer de archivo.txt
        File archivo = new File("archivo.txt");
        try (Scanner scn = new Scanner(archivo)) {
            while (scn.hasNextLine()) {
                String linea = scn.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo");
        }

        try {
            String nombreFichero = "ficheroEnteros.txt";
            String mostrar = "cuenta";
            String t = "r";
            PrintWriter pwr = new PrintWriter(nombreFichero);
            for (int i = 1; i <= 10000000; i++) {
                pwr.print(i + " ");
                if (i % 100 == 0)
                    pwr.println();
            }
            pwr.close();
            Scanner scn = new Scanner(new FileReader(nombreFichero));
            /**
             * while (scn.hasNext())
             * System.out.println("Valor leído: " + scn.nextInt(1000));
             * scn.close();
             **/
            System.out.println("Guardado");

            while (scn.hasNext()) {
                if (mostrar.length() < 100000) {
                    mostrar = mostrar + t + scn.nextInt() + "\n";
                } else {
                    System.out.println(mostrar + t + scn.nextInt());
                    mostrar = "";
                }
            }
            System.out.println(mostrar);
            scn.close();

        } catch (IOException e) {
            System.out.println("Problemas en el fichero");
        }
    }

    public static void contarPalabras(String fichero1) {

        try {
            int palabras = 0;
            FileReader fr = new FileReader(fichero1);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasLinea = linea.split("\\s+");
                palabras += palabrasLinea.length;
            }
            // al cerrar el BufferedReader se cierra también el FileReader
            br.close();
            System.out.println(fichero1 + " contiene " + palabras + " palabras");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void crearLineas(String fichero2, int numLineas) {
        try {
            FileWriter fw = new FileWriter(fichero2);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= numLineas; i++) {
                bw.write("esta es la linea: " + numLineas);
                bw.newLine();
            }
            // al cerrar el BufferedWriter se cierra tambien el FileWriter
            bw.close();
            System.out.println(fichero2 + " creado con " + numLineas + " lineas");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    Grupo dam = null;
    try
    {
        FileInputStream fis = new FileInputStream("archivo.dat");
        ObjectInputStream in = new ObjectInputStream(fis);
        dam = (Grupo) in.readObject();
        in.close();
        fis.close();
    }catch(
    IOException e)
    {
        System.out.println(e);
    }
}
}