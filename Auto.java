package clases;

/**
 * Un Auto ES-UN Vehiculo (Herencia).
 * Su costo incluye un recargo adicional de $10 por dia (seguro).
 */
public class Auto extends Vehiculo {

    private static final double RECARGO_SEGURO_POR_DIA = 10.0;

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase); // llama al constructor de Vehiculo
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costoBase = getTarifaBase() * dias;
        double costoSeguro = RECARGO_SEGURO_POR_DIA * dias;
        return costoBase + costoSeguro;
    }
}
