package clases;

/**
 * Una Moto ES-UN Vehiculo (Herencia).
 * Su costo incluye un recargo fijo unico de $5 por casco,
 * sin importar la cantidad de dias.
 */
public class Moto extends Vehiculo {

    private static final double RECARGO_CASCO = 5.0;

    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase); // llama al constructor de Vehiculo
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costoBase = getTarifaBase() * dias;
        return costoBase + RECARGO_CASCO; // el recargo NO depende de los dias
    }
}
