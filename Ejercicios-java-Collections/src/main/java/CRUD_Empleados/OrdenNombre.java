/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

import java.util.Comparator;

/**
 *
 * @author dairo
 */
public class OrdenNombre implements Comparator<Empleado>{

    @Override
    public int compare(Empleado uno, Empleado dos) {
        return uno.getNombre().compareTo(dos.getNombre());
    }
    
}
