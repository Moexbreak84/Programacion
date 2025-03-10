package estructuraDatos;

import enumerados.Categoria;

public class Parafarmacia extends Producto {
    private Categoria categoria;
    private int dosisUnidades;
    private float descuento;

    /**
     * Constructor de la clase Parafarmacia.
     *
     * @param codigo        Código del producto, debe ser único.
     * @param nombre        Nombre del producto.
     * @param descripcion   Descripción del producto.
     * @param unidades      Cantidad de unidades disponibles.
     * @param precioCompraP Precio de compra del producto.
     * @param categoria     Categoría del producto.
     * @param dosisUnidades Número de dosis o unidades en el envase.
     * @param descuento2    Descuento aplicable al producto (0-100).
     */
    public Parafarmacia(String codigo, String nombre, String descripcion, int unidades, double precioCompraP,
            Categoria categoria, int dosisUnidades, double descuento2) {
        super(codigo, nombre, descripcion, unidades, precioCompra);
        this.categoria = categoria;
        if (dosisUnidades <= 0) {
            this.dosisUnidades = 1;
        } else {
            this.dosisUnidades = dosisUnidades;
        }
        if (descuento <= 0) {
            this.descuento = 0;
        } else {
            this.descuento = descuento;
        }
    }

    /**
     * Calcula el precio final del producto de parafarmacia.
     * El precio se calcula aplicando el descuento y sumando un margen de ganancia y
     * el IVA.
     *
     * @return Precio final del producto.
     */
    @Override
    public float CalcularPrecio() {
        float p = super.CalcularPrecio();
        return p * (1 - descuento / 100) * 1.40f * 1.21f;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return Categoría del producto.
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del producto.
     * 
     * @param categoria Nueva categoría del producto.
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene el número de dosis o unidades en el envase.
     * 
     * @return Número de dosis o unidades.
     */
    public int getDosisUnidades() {
        return dosisUnidades;
    }

    /**
     * Establece el número de dosis o unidades en el envase.
     * Si el valor es menor o igual a 0, no se actualiza.
     * 
     * @param dosisUnidades Nuevo número de dosis o unidades.
     */
    public void setDosisUnidades(int dosisUnidades) {
        if (dosisUnidades > 0) {
            this.dosisUnidades = dosisUnidades;
        }
    }

    /**
     * Obtiene el descuento aplicable al producto.
     * 
     * @return Descuento del producto.
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * Establece el descuento aplicable al producto.
     * Si el valor es menor o igual a 0, no se actualiza.
     * 
     * @param descuento Nuevo descuento del producto.
     */
    public void setDescuento(float descuento) {
        if (descuento > 0) {
            this.descuento = descuento;
        }
    }

    /**
     * Devuelve una representación en forma de cadena del producto de parafarmacia.
     * 
     * @return Cadena que representa el producto.
     */
    @Override
    public String toString() {
        return String.format("%-14s Categoria: %S Dosis Unidades: %d Descuento: %d",
                super.toString(),
                this.getCategoria(),
                this.getDosisUnidades(),
                this.getDescuento());

    }
}
