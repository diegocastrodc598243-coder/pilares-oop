package clases;

/**
 * Clase abstracta que representa un Vehiculo genérico.
 * Nunca se instancia directamente: siempre será un Auto o una Moto.
 * (Mismo patrón que la clase Figura del ejemplo de abstracción visto en clase).
 */
public abstract class Vehiculo {

    // Atributos encapsulados: private para que no se puedan
    // modificar directamente desde fuera de la clase.
    private String marca;
    private String modelo;
    private double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    // Método abstracto: cada subclase (Auto, Moto) debe implementar
    // su propia forma de calcular el costo. Esto habilita el
    // polimorfismo dinámico.
    public abstract double calcularCostoAlquiler(int dias);

    // Solo getters (sin setters), tal como pide el requerimiento:
    // los atributos no se pueden modificar directamente desde fuera.
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }
}
