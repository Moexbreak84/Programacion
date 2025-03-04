package estructuraDatos;

import enumerados.Categoria;

public class Parafarmacia extends Producto {
    private Categoria categoria;
    private int dosisUnidades;
    private float descuento;

    public Parafarmacia(String codigo, String nombre, String descripcion, int unidades, float precioCompra,
            Categoria categoria, int dosisUnidades, float descuento) {
        super(codigo, nombre, descripcion, unidades, precioCompra);
        this.categoria = categoria;
        if(dosisUnidades <= 0){
            this.dosisUnidades = 1;
        }else{
            this.dosisUnidades = dosisUnidades;
        }
        if(descuento <= 0){
            this.descuento = 0;
        }else{
        this.descuento = descuento;
        }
    }

    @Override
    public float CalcularPrecio() {
        float p = super.CalcularPrecio();
        return p*(1-descuento/100)*1.40f * 1.21f;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getDosisUnidades() {
        return dosisUnidades;
    }

    public void setDosisUnidades(int dosisUnidades) {
        if(dosisUnidades > 0){
            this.dosisUnidades = dosisUnidades;
        }
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        if(descuento > 0){
            this.descuento = descuento;
        }
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
