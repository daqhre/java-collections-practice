/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

/**
 *
 * @author dairo
 */
public class Carro extends Vehiculo implements Asegurable {
    private int puertas;

    public Carro(String placa, String marca, String modelo,int puertas) {
        super(placa, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    

    @Override
    public double cacularCostomantenimiento() {
        double calculo = getPuertas() * 5;
        return calculo;
    }

    @Override
    public double calcularSeguro() {
        double calculo = getPuertas() * 10;
        return calculo;
    }

    @Override
    public String toString() {
        return "Carro{" + super.toString() + ""
                + " puertas = " + puertas + '}';
    }
    

    
}
