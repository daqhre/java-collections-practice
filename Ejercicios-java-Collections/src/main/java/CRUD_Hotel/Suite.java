/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

/**
 *
 * @author dairo
 */
public class Suite extends Habitacion{
    private int precioNoche = 140;
    private String tipo = "Doble";

    public Suite(int numero, estado dispoible) {
        super(numero, dispoible);
    }
    
    public int getPrecioNoche() {
        return precioNoche;
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public double calcularcosto(int noches) {
        double costo = noches * getPrecioNoche();
        return costo;
    }

    @Override
    public String toString() {
        return "Hambitacion Doble: " + 
                super.toString() + " "
                + "Precio por noche = " + precioNoche + ""
                + "tipo = " + tipo;
    }

}
