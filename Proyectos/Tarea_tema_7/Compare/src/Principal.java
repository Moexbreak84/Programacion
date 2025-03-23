import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {
        public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo("As123456", "Moises", 50, 40, 40);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivo.dat"));
            out.writeObject(dispositivo);
            out.close();
        } catch (IOException e) {
            System.out.println("no ha funcionado");
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivo.dat"));
            System.out.println(in.readObject());
            in.close();
        } catch (Exception e) {
            System.out.println("no se ha leido");
        }
    }
}
