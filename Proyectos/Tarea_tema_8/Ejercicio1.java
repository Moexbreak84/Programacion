package Proyectos.Tarea_tema_8;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Data/listadoAlumnos.txt");
        FileInputStream fi = new FileInputStream(f);
        DataInputStream fil = new DataInputStream(fi);
    }
    
}
