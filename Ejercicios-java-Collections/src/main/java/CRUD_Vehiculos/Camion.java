/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

/**
 *
 * @author dairo
 */
public class Camion extends Vehiculo implements Asegurable{
    private int carga;

    public Camion( String placa, String marca, String modelo, int carga) {
        super(placa, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double cacularCostomantenimiento() {
        double cos = getCarga() * 10;
        return cos;
    }

    @Override
    public double calcularSeguro() {
        double cos = getCarga() * 15;
        return cos;
    }

    @Override
    public String toString() {
        return "Camion{" + super.toString() + ""
                + " carga = " + carga + '}';
    }
    
    
    
}
