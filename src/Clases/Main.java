package Clases;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Ferrari", "SF90", 100));
        vehiculos.add(new Moto("BMW", "M1000RR", 50));

        int dias = 5;

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("Vehiculo: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Tarifa base: $" + vehiculo.getTarifaBase());
            System.out.println("Costo por " + dias + " dias: $"
                    + vehiculo.calcularCostoDeAlquiler(dias));

            System.out.println("-------------------------");
        }
    }
}
