package estructuraDatos;

public class Parafarmacia extends Producto {
    private String categoria;
    private int dosisUnidades;
    private int descuento;

    public Parafarmacia(String codigo, String nombre, String descripcion, int unidades, float precioCompra,
            String caegoria, int dosisUnidades, int descuento) {
        super(codigo, nombre, descripcion, unidades, precioCompra);
        this.categoria = categoria;
        this.dosisUnidades = dosisUnidades;
        this.descuento = descuento;
    }

    @Override
    public float getCalcularPrecio() {
        setPrecioCompra(this.getPrecioCompra() / 100 * (40 + 21f));
        return (float) getPrecioCompra();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDosisUnidades() {
        return dosisUnidades;
    }

    public void setDosisUnidades(int dosisUnidades) {
        this.dosisUnidades = dosisUnidades;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return String.format("%-14s Categoria: %S Dosis Unidades: %d Descuento: %d",
                super.toString(),
                this.getCategoria(),
                this.getDosisUnidades(),
                this.getDescuento());

    }
}
