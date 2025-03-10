import java.util.ArrayList;
import java.util.Arrays;

public class Dispositivo {
    private String id = ([a-z][0-9]){2,3};
    private String nombre;
    private int[] tamano;
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        
    }
    public Dispositivo(String id, String nombre, int alto, int ancho, int profundo){
        this.id = id;
        this.nombre = nombre;
        this.tamano = new int[]{alto, ancho, profundo};
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int[] getTamano() {
        return tamano;
    }
    public void setTamano(int[] tamano) {
        this.tamano = tamano;
    }
    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", nombre=" + nombre + ", tamano=" + Arrays.toString(tamano) + "]";
    }
}
