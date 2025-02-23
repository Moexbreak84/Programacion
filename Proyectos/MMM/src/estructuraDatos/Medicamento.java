package estructuraDatos;

import enumerados.TipoMedicamento;

public class Medicamento extends Producto {
    private TipoMedicamento tipoMedicamento;
    private String comoTomar;
    private String efectosAdversos;
    private int precioUnidad;

    public Medicamento(String codigo, String nombre, String descripcion, int unidades, float precioCompra,
            TipoMedicamento tipoMedicamento, String comoTomar, String efectosAdversos) {
        super(codigo, nombre, descripcion, unidades, precioCompra);
        this.tipoMedicamento = tipoMedicamento;
        this.comoTomar = comoTomar;
        this.tipoMedicamento = tipoMedicamento;
    }

    @Override
    public float getCalcularPrecio() {
        setPrecioCompra(precioUnidad / 100 * (4 + 27.9f));
        return (float) getPrecioCompra();
    }

    /**
     * identifica el tipo de medicamento
     * 
     * @return
     */
    public TipoMedicamento getTipoMedicamento() {
        return tipoMedicamento;
    }

    /**
     * permite realizar cambios en el tipo de medicamento
     * 
     * @param tipoMedicamento
     */
    public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    /**
     * @return muestra como tomar el medicamento
     */
    public String getComoTomar() {
        return comoTomar;
    }

    /**
     * permite modificar como se toma el medicamento
     * 
     * @param comoTomar
     */
    public void setComoTomar(String comoTomar) {
        this.comoTomar = comoTomar;
    }

    /**
     * 
     * @return muestra los efectos adversos
     */
    public String getEfectosAdversos() {
        return efectosAdversos;
    }

    public void setEfectosAdversos(String efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    @Override
    public String toString() {
        return String.format("%-14s Tipo Medicamento: %s Como tomar: %s efectos Adversos: %s",
                super.toString(),
                this.getTipoMedicamento(),
                this.getComoTomar(),
                this.getEfectosAdversos());
    }
}
