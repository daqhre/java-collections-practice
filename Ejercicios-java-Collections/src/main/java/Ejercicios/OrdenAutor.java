/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Comparator;

/**
 *
 * @author dairo
 */
public class OrdenAutor implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
    
}
