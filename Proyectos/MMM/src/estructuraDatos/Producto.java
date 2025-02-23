package estructuraDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import interfaces.Calculable;

public class Producto implements Calculable {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int unidades;
    private float precioCompra;

    /**
     * Constructor crea un objeto para Producto.
     * 
     * @param codigo       El código del producto.
     * @param nombre       El nombre del producto.
     * @param descripcion  La descripción del producto.
     * @param precio       El precio del producto.
     * @param precioUnidad El precio por unidad del producto.
     */
    public Producto(String codigo, String nombre, String descripcion, double precio, float precioUnidad) {
        if (validarCodigo(codigo)) {
            this.codigo = codigo;
        } else {
            this.codigo = "X";
        }
        if (unidades >= 0) {
            this.unidades = 0;
        } else {
            this.precioCompra = 0;
            this.descripcion = descripcion;
            this.nombre = nombre;
        }
    }

    /**
     * validacion del codigo
     * 
     * @param codigo El código que queremos validar.
     * @return true si el código es válido, false si no.
     */
    private boolean validarCodigo(String codigo) {
        Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{6}$");
        Matcher m = p.matcher(codigo);
        return m.matches();
    }

    @Override
    public float CalcularPrecio() {
        if (precioCompra >= 1) {
            precioCompra = precioCompra / unidades;
            return (float) precioCompra;
        }
        return 0;
    }

    /**
     * el código del producto.
     * 
     * @return El código del producto.
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * pone el código del producto.
     * 
     * @param codigo El código que pone.
     */
    public void setCodigo(String codigo) {
        if (validarCodigo(codigo)) {
            this.codigo = codigo;
        }
    }

    /**
     * el nombre del producto.
     * 
     * @return El nombre del producto.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * pone el nombre del producto.
     * 
     * @param nombre El nombre que pone.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * la descripción del producto.
     * 
     * @return La descripción del producto.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * da la descripción del producto.
     * 
     * @param descripcion La descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * la cantidad de unidades del producto.
     * 
     * @return La cantidad de unidades.
     */
    public int getUnidades() {
        return this.unidades;
    }

    /**
     * la cantidad de unidades del producto.
     * 
     * @param unidades La cantidad de unidades que pone.
     */
    public void setUnidades(int unidades) {
        if (unidades > 0) {
            this.unidades = unidades;
        }
    }

    /**
     * el precio de compra del producto.
     * 
     * @return El precio de compra.
     */
    public float getPrecioCompra() {
        return this.precioCompra;
    }

    /**
     * pone el precio de compra del producto.
     * 
     * @param precioCompra El precio de compra que pone.
     */
    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        return String.format("Producto\n--------\nCodigo: %s\nNombre: %s\nDescripcion: %s\nUnidades: %d\nPrecio: %.2f",
                this.codigo, this.nombre, this.descripcion, this.unidades, this.precioCompra);
    }

    /**
     * Agrega unidades al producto.
     * 
     * @param cantidad La cantidad de unidades que se agregan.
     */
    public void agregarUnidades(int cantidad) {
        if (cantidad > 0) {
            this.unidades += cantidad;
        }
    }

    /**
     * Quita unidades del producto.
     * 
     * @param cantidad La cantidad de unidades que quitar.
     * @return true si quita las unidades, false si no las quita.
     */
    public boolean quitarUnidades(int cantidad) {
        if (this.unidades - cantidad >= 0) {
            this.unidades -= cantidad;
            return true;
        }
        return false;
    }
}