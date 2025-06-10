import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase de utilidad para operaciones de Entrada/Salida (ES)
 * Facilita la lectura desde teclado (enteros, cadenas) y
 * la gestión de archivos (lectura y escritura), incluyendo
 * un robusto manejo de errores.
 */
public class ES {

    // Se utiliza una única instancia de Scanner para toda la aplicación
    // y se marca como estática para que pueda ser usada por los métodos estáticos.
    // Además, se cierra en un shutdown hook para asegurar que se libere el recurso.
    private static Scanner sc = new Scanner(System.in); // <-- ¡Cambiado a 'sc'!

    // Bloque estático para configurar el cierre del Scanner al finalizar la
    // aplicación
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (sc != null) { // <-- ¡Cambiado a 'sc'!
                sc.close(); // <-- ¡Cambiado a 'sc'!
                System.out.println("Scanner cerrado."); // Mensaje para depuración
            }
        }));
    }

    /**
     * Lee un número entero desde la consola.
     * Repite la solicitud hasta que se introduce un entero válido.
     *
     * @param mensaje El mensaje a mostrar al usuario para solicitar la entrada.
     * @return El número entero leído.
     */
    public static int leerEntero(String mensaje) {
        while (true) { // Bucle infinito hasta que se lea un entero válido
            System.out.print(mensaje);
            try {
                int numero = sc.nextInt(); // <-- ¡Cambiado a 'sc'!
                sc.nextLine(); // <-- ¡Cambiado a 'sc'! Consumir el salto de línea pendiente después de
                               // nextInt()
                return numero;
            } catch (InputMismatchException e) {
                System.err.println("Error: Entrada no válida. Por favor, introduce un número entero.");
                sc.nextLine(); // <-- ¡Cambiado a 'sc'! Limpiar el buffer del scanner para evitar bucles
                               // infinitos
            }
        }
    }

    /**
     * Lee una cadena de texto (línea completa) desde la consola.
     *
     * @param mensaje El mensaje a mostrar al usuario para solicitar la entrada.
     * @return La cadena de texto leída.
     */
    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine(); // <-- ¡Cambiado a 'sc'!
    }

    /**
     * Lee el contenido de un archivo de texto línea por línea.
     *
     * @param rutaArchivo La ruta completa o relativa del archivo a leer.
     * @return Un String que contiene todo el contenido del archivo,
     *         o null si ocurre un error (y se imprime el error).
     */
    public static String leerArchivo(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append(System.lineSeparator()); // Añade salto de línea
            }
            return contenido.toString();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo '" + rutaArchivo + "': " + e.getMessage());
            return null; // Retorna null para indicar que la lectura falló
        }
    }

    /**
     * Escribe una cadena de texto en un archivo.
     * Sobreescribe el archivo si ya existe por defecto, o lo añade si 'append' es
     * true.
     *
     * @param rutaArchivo La ruta completa o relativa del archivo a escribir.
     * @param contenido   La cadena de texto a escribir en el archivo.
     * @param append      Si es true, añade al final del archivo; si es false (o
     *                    omitido), sobrescribe.
     * @return true si la escritura fue exitosa, false en caso de error.
     */
    public static boolean escribirArchivo(String rutaArchivo, String contenido, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, append))) {
            bw.write(contenido);
            return true;
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo '" + rutaArchivo + "': " + e.getMessage());
            return false; // Retorna false para indicar que la escritura falló
        }
    }

    /**
     * Sobrecarga del método escribirArchivo para sobrescribir por defecto.
     *
     * @param rutaArchivo La ruta completa o relativa del archivo a escribir.
     * @param contenido   La cadena de texto a escribir en el archivo.
     * @return true si la escritura fue exitosa, false en caso de error.
     */
    public static boolean escribirArchivo(String rutaArchivo, String contenido) {
        return escribirArchivo(rutaArchivo, contenido, false); // Sobreescribe por defecto
    }

    // --- Ejemplo de Uso de la Clase ES ---
    public static void main(String[] args) {
        System.out.println("--- PRUEBAS DE LA CLASE ES ---");

        // --- Prueba de leerEntero ---
        int edad = ES.leerEntero("Por favor, introduce tu edad: ");
        System.out.println("Tu edad es: " + edad);

        // Prueba de entrada inválida para leerEntero (prueba esto manualmente)
        // Ejecuta el programa e introduce texto cuando pida la edad.

        // --- Prueba de leerCadena ---
        String nombre = ES.leerCadena("Por favor, introduce tu nombre completo: ");
        System.out.println("Tu nombre es: " + nombre);

        // --- Prueba de escribirArchivo ---
        String nombreArchivo = "mi_documento.txt";
        String textoInicial = "Este es el contenido inicial del archivo.\n";
        String textoAdicional = "Esta es una línea añadida posteriormente.\n";

        System.out.println("\n--- Prueba de escritura de archivo ---");
        if (ES.escribirArchivo(nombreArchivo, textoInicial)) {
            System.out.println("Archivo '" + nombreArchivo + "' creado y escrito con éxito.");
        } else {
            System.out.println("Fallo al escribir el archivo inicial.");
        }

        // Añadir contenido al mismo archivo
        if (ES.escribirArchivo(nombreArchivo, textoAdicional, true)) { // 'true' para añadir
            System.out.println("Contenido añadido al archivo '" + nombreArchivo + "'.");
        } else {
            System.out.println("Fallo al añadir contenido al archivo.");
        }

        // --- Prueba de leerArchivo ---
        System.out.println("\n--- Prueba de lectura de archivo ---");
        String contenidoLeido = ES.leerArchivo(nombreArchivo);
        if (contenidoLeido != null) {
            System.out.println("Contenido de '" + nombreArchivo + "':\n" + contenidoLeido);
        } else {
            System.out.println("No se pudo leer el archivo.");
        }

        // Prueba de archivo que no existe
        System.out.println("\n--- Prueba de lectura de archivo inexistente ---");
        String contenidoInexistente = ES.leerArchivo("archivo_que_no_existe.txt");
        if (contenidoInexistente == null) {
            System.out.println("Como se esperaba, no se pudo leer el archivo inexistente.");
        }
    }
}