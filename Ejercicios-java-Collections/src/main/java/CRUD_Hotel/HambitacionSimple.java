/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

/**
 *
 * @author dairo
 */
public class HambitacionSimple extends Habitacion{
    
    private int precioNoche = 50;
    private String tipo = "Simple";

    public HambitacionSimple(int numero, estado dispoible) {
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
        return "Hambitacion Simple: " + 
                super.toString() + " "
                + "Precio por noche = " + precioNoche + ""
                + "tipo = " + tipo;
    }
    
}
