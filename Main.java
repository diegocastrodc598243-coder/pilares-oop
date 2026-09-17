package clases;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista de vehiculos: gracias al polimorfismo, podemos guardar
        // Autos y Motos en una misma lista de tipo Vehiculo.
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Mazda", "3", 40.0));
        vehiculos.add(new Moto("Yamaha", "FZ", 20.0));

        int dias = 5;

        // Recorremos la lista y calculamos el costo de alquiler
        // de cada vehiculo para 5 dias.
        for (Vehiculo v : vehiculos) {
            double costo = v.calcularCostoAlquiler(dias);

            System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());
            System.out.println("Tipo: " + v.getClass().getSimpleName());
            System.out.println("Tarifa base por dia: $" + v.getTarifaBase());
            System.out.println("Dias de alquiler: " + dias);
            System.out.println("Costo total del alquiler: $" + costo);
            System.out.println("------------------------------------");
        }
    }
}
