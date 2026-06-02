/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

/**
 *
 * @author dairo
 */
public class Moto extends Vehiculo implements Asegurable{
    private int cilindrada;

    public Moto( String placa, String marca, String modelo, int cilindrada) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    

    @Override
    public double cacularCostomantenimiento() {
        double cilin = getCilindrada() * 3;
        return cilin;
    }

    @Override
    public double calcularSeguro() {
        double cilin = getCilindrada() * 7;
        return cilin;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() + ""
                + " cilindrada = " + cilindrada + '}';
    }
    
    
}
