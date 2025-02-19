package estructuraDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int unidades;
    private float precioCompra;

    public Producto(String codigo, String nombre, String descripcion, double precio, int unidades) {
        this.codigo = validarCodigo(codigo) ? codigo : "X";
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = (float) Math.max(precio, 0);
        this.unidades = Math.max(unidades, 0);
    }

    private boolean validarCodigo(String codigo) {
        Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{6}$");
        Matcher m = p.matcher(codigo);
        return m.matches();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getUnidades() {
        return this.unidades;
    }

    public float getPrecioCompra() {
        return this.precioCompra;
    }

    public String toString() {
        return String.format("Producto\n--------\nCodigo: %s\nNombre: %s\nDescripcion: %s\nUnidades: %d\nPrecio: %.2f",
                this.codigo, this.nombre, this.descripcion, this.unidades, this.precioCompra);
    }

    public void agregarUnidades(int cantidad) {
        if (cantidad > 0) {
            this.unidades += cantidad;
        }
    }

    public boolean quitarUnidades(int cantidad) {
        if (this.unidades - cantidad >= 0) {
            this.unidades -= cantidad;
            return true;
        }
        return false;
    }
}