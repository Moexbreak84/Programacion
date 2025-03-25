package estructuraDatos;

import enumerados.TipoMedicamento;

public class Medicamento extends Producto {
    private TipoMedicamento tipoMedicamento;
    private String comoTomar;
    private String efectosAdversos;
    private int precioUnidad;

    /**
     * Constructor de la clase Medicamento.
     * Inicializa un nuevo objeto Medicamento con los atributos proporcionados.
     *
     * @param codigo          Código del medicamento, debe ser único.
     * @param nombre          Nombre del medicamento.
     * @param descripcion     Descripción del medicamento.
     * @param precio          Precio de venta del medicamento.
     * @param precioCompra    Precio de compra del medicamento.
     * @param tipoMedicamento Tipo de medicamento (analgésico, antibiótico, etc.).
     * @param comoTomar       Instrucciones sobre cómo tomar el medicamento.
     * @param efectosAdversos Posibles efectos adversos del medicamento.
     */
    public Medicamento(String codigo, String nombre, String descripcion, double precio, float precioCompra,
            TipoMedicamento tipoMedicamento, String comoTomar, String efectosAdversos) {
        super(codigo, nombre, descripcion, precio, precioCompra);
        this.tipoMedicamento = tipoMedicamento;
        this.comoTomar = comoTomar;
        this.tipoMedicamento = tipoMedicamento;
    }

    /**
     * Calcula el precio de compra del medicamento.
     * El precio de compra se establece en función del precio unitario,
     * aplicando un margen de ganancia del 27.9% y un IVA del 4%.
     *
     * @return El precio de compra calculado del medicamento.
     */
    @Override
    public float CalcularPrecio() {
        setPrecioCompra(precioUnidad / 100 * (4 + 27.9f));
        return (float) getPrecioCompra();
    }

    /**
     * Devuelve una representación en forma de cadena del medicamento.
     * La cadena incluye el código, nombre, descripción, tipo de medicamento,
     * instrucciones sobre cómo tomarlo y los efectos adversos.
     *
     * @return Una cadena que representa el medicamento, incluyendo sus atributos.
     */
    @Override
    public String toString() {
        return String.format("%-14s Tipo Medicamento: %s Como tomar: %s efectos Adversos: %s",
                super.toString(),
                this.getTipoMedicamento(),
                this.getComoTomar(),
                this.getEfectosAdversos());
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

    /**
     * Establece los efectos adversos del medicamento.
     *
     * @param efectosAdversos La cadena que describe los efectos adversos del
     *                        medicamento.
     */
    public void setEfectosAdversos(String efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
