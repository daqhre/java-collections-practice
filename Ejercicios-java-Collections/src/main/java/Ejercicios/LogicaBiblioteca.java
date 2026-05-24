/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Ejercicios.Libro.estado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author dairo
 */
public class LogicaBiblioteca {
    ArrayList<Libro> listalibros = new ArrayList<>();

    public void agregarLibro( Libro libro){
        if(listalibros.contains(libro)){
            System.out.println("El isbn del libro ya esta registrado ");
        } else{listalibros.add(libro);}
        
    }
     public void mostrarLibros(){
         if(listalibros.isEmpty()){
             System.out.println("No hay libros registrados");
         } else {
             Iterator<Libro> it = listalibros.iterator();
             while (it.hasNext()) {
                 System.out.println(it.next());
             }
             
         }
     }
     public void ordenDisponibles(){
         estado esta = Libro.estado.Disponible;
         for (Libro listalibro : listalibros) {
             if(listalibro.getDisponible().equals(esta)){
                 System.out.println(listalibro);
             }
         }
     }
     
     public void ordenNombre(){
         listalibros.sort(new OrdenNombre());
         for (Libro listalibro : listalibros) {
             System.out.println(listalibro);
         }
     }
     public void ordenAutor(){
     listalibros.sort(new OrdenAutor());
         for (Libro listalibro : listalibros) {
             System.out.println(listalibro);
         }
     }
     public void buscarLibro(int isbn){
         
            for (Libro listalibro : listalibros) {
                if(listalibro.getIsbn() == isbn){
                    System.out.println(listalibro);
                }
            }
           
     }
     public void prestarLibro(int isbn){
         
       for (Libro listalibro : listalibros) {
                if(listalibro.getIsbn() == isbn){
                    listalibro.setDisponible(Libro.estado.No_disponible);
                    System.out.println("Libro prestado");
                }
            }
     }
     public void devolverLibro(int isbn){
         
       for (Libro listalibro : listalibros) {
                if(listalibro.getIsbn() == isbn){
                    listalibro.setDisponible(Libro.estado.Disponible);
                    System.out.println("Libro devuelto");
                }
            }
     }
     public void eliminarLibro(int isbn){
         Iterator<Libro> it = listalibros.iterator();
        while (it.hasNext()) {
            Libro li = it.next();
            if (li.getIsbn() == isbn) {
                it.remove();
            }
        }
     }
     public void  ordeAño(){
      Collections.sort(listalibros);
     }
     
}
