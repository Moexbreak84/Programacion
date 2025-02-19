package estructuraDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int unidades;
    private float precioCompra;

    public Producto(String codigo, String nombre, String descripcion, int unidades, float precioCompra) {
        if (validarCodigo(codigo)) {
            this.codigo = codigo;
        } else {
            this.codigo = "X";
        }
        if (unidades >= 0) {
            this.unidades = 0;
        }
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else {
            this.precioCompra = 0;
            this.descripcion = descripcion;
            this.nombre = nombre;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (validarCodigo(codigo)) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUnidades(int unidades) {
        if (unidades > 0) {
            this.unidades = unidades;
        }
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
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

    private boolean validarCodigo(String codigo) {
        Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{6}$");
        Matcher m = p.matcher(codigo);
        return m.matches();
    }
}
