/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

import java.util.ArrayList;

/**
 *
 * @author dairo
 */
public class Logica_CRUD {
    ArrayList<Personaje> lista = new ArrayList<>();

    public ArrayList<Personaje> getLista() {
        return lista;
    }
    
    public void agregarPersonaje(Personaje personaje){
        if(lista.contains(personaje)){
            System.out.println("El personaje elejido ya esta registrado");
            System.out.println("Por favor cambie el nombre");
        } else {lista.add(personaje); System.out.println("Personaje registrado con exito");}
    }
    public void mostrarPersonajes(int p){
        for (Personaje personaje : lista) {
            switch(p){
                case 1 -> {
                if (personaje instanceof Mago){
                    int pos = lista.indexOf(personaje);
                    System.out.println("Posicion = " + pos);
                    System.out.println(personaje);
                 }
                }
                case 2 -> {
                if (personaje instanceof Guerrero){
                    int pos = lista.indexOf(personaje);
                    System.out.println("Posicion = " + pos);
                    System.out.println(personaje);
                 }
                }
                case 3 -> {
                if (personaje instanceof Arquero){
                    int pos = lista.indexOf(personaje);
                    System.out.println("Posicion = " + pos);
                    System.out.println(personaje);
                 }
                }
                case 4 -> {
                    int pos = lista.indexOf(personaje);
                    System.out.println("Posicion = " + pos);
                    System.out.println(personaje);
                }
                
            }
        
        }
    }

    public void buscarPersonaje(Personaje personaje){
           if(lista.contains(personaje)){
               System.out.println(personaje);
           }
    }
    
    public void elimanarPersonaje(Personaje personaje){
    if(lista.contains(personaje)){
        lista.remove(personaje);
     }
    }
    
    
}
