package Clases;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoDeAlquiler(int dias) {
        return (getTarifaBase() * dias) + (10 * dias);
    }

}
