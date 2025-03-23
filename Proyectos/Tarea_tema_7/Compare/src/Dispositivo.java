import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;

public class Dispositivo implements Serializable {
    private String id;
    private String nombre;
    private int[] tamano;

    public Dispositivo(String id, String nombre, int alto, int ancho, int profundo) {
        Pattern idPatron = Pattern.compile("^[a-zA-Z]{2}[0-9]{6}$"); // PG932467
        Matcher idVerificar = idPatron.matcher(id); // PG932467 COINCIDE?
        if (idVerificar.matches()) { // ¿Ha coincidido? SÍ: TRUE, NO: FALSE
            this.id = id;
        } else { this.id = "x"; }
        this.nombre = nombre;
        this.tamano = new int[] { alto, ancho, profundo };
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
        return String.format("El id es: %s\nNombre: %s \nAlto %d \nAncho %d \nProfundo %d",id, nombre, tamano[0], tamano[1], tamano[2]);
    }

}
