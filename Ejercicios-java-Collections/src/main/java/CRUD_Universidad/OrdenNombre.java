/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Universidad;

import java.util.Comparator;

/**
 *
 * @author dairo
 */
public class OrdenNombre implements Comparator<Persona>{

    @Override
    public int compare(Persona uno, Persona dos) {
        return uno.getNombre().compareTo(dos.getNombre());
    }

    
    
}
