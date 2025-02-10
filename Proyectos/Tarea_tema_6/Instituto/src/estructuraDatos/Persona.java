package estructuraDatos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
    }

    public Persona() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = formatoFecha.format(this.fechaNacimiento.getTime());

        return String.format("Nombre: %s\nApellidos: %s\nFecha de nacimiento: %s",
                this.nombre, this.apellidos, this.fechaNacimiento);

    }

}
