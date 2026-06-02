/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Universidad;

import java.util.ArrayList;

/**
 *
 * @author dairo
 */
public class LogicaMenu {
    
    ArrayList<Persona> lista;
    

    
     public void agregarPersona(Persona persona){
         lista.add(persona);
     }
     public void eliminarPerosnas(int id){
         Persona eliminado = null;
         for (Persona persona : lista) {
             if(persona.getId() == id){
             eliminado = persona;
             }
         }
         if(eliminado != null){
             lista.remove(eliminado);
         } else {System.out.println("No se pudo eliminar a la persona");}
     }
     public void buscarPersona(int id){
         for (Persona persona : lista) {
             if(persona.getId() == id){
                 System.out.println(persona);
             }
         }
     }
     public void mostrarPersonas(int op){
         for (Persona persona : lista) {
             switch (op) {
                 case 1:
                     System.out.println("Profesores:");
                     if(persona instanceof Profesor){
                     System.out.println(persona);
                     }
                     break;
                 case 2:
                     if(persona instanceof Alumno){
                     System.out.println(persona);
                     }
                     break;
                 case 3:
                     System.out.println("Personas");
                     System.out.println(persona);
                     break;
                 default:
                     System.out.println("La opcion que eligio no es valida");
             }
         }
     }
     public void mostrarOrden(int op){
         lista.sort(new OrdenNombre());
         mostrarPersonas(op);
     }
     public void universidad(){
         for (Persona persona : lista) {
             
         }
     }
}
