/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

import java.util.Comparator;

/**
 *
 * @author dairo
 */
public class OrdenMarca implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
    
}
