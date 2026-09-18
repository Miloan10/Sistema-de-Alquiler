
package Clases;


public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoDeAlquiler(int dias){
        return (getTarifaBase() * dias) + 5;
    }

}