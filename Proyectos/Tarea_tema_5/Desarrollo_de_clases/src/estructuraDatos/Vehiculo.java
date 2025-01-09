package estructuraDatos;
public class Vehiculo {
    private final double capacidadDeposito;
    private final String matricula;
    private final String fechaMatriculacion;
    private boolean estadoMotor;
    private double kilometrosTotales;
    private double kilometrosParciales;
    private int vehiculosTotales;
    private final double mediaConsumo;
    private double kilometrosTodos;
    private int vehiculosEncendidos;
    private double nivelCombustible;
    public final double capacidadDepositoMin = 10.0;
    public final double capacidadDepositoMax = 150.0;
    public final double mediaConsumoMin = 1.0;
    public final double mediaConsumoMax = 18.0;
    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }
    public boolean getEstadoMotor() {
        return estadoMotor;
    }
    public double getKilometrosTotales() {
        return kilometrosTotales;
    }
    public double getKilometrosParciales() {
        return kilometrosParciales;
    }
    public int getVehiculosTotales() {
        return vehiculosTotales;
    }
    public double getMediaConsumo() {
        return mediaConsumo;
    }
    public double getKilometrosTodos() {
        return kilometrosTodos;
    }
    public int getVehiculosEncendidos() {
        return vehiculosEncendidos;
    }
    public double getNivelCombustible() {
        return nivelCombustible;
    }
}
