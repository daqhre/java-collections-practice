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
public class OrdenNombre implements Comparator<Libro>{
    @Override
    public int compare(Libro uno, Libro dos){
        return uno.getTitulo().compareTo(dos.getTitulo());
    }
}
