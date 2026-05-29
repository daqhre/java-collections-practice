/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class Batalla {
    public void juego(){
        Scanner sc = new Scanner(System.in);
    LogicaBatalla batala = new LogicaBatalla();
    try {
        System.out.println("Personajes disponibles");
    batala.vali.validacionMostrar("4");
        System.out.println("Por favor Ingrese el numero del personaje que desea elegir");
       int opcion = sc.nextInt();
       sc.nextLine();
       batala.elegirPersonaje(opcion);
        System.out.println("Elige contra quien te vas a enfrentar");
        System.out.println("Personajes disponibles");
    batala.vali.validacionMostrar("4");
        System.out.println("Por favor Ingrese el numero del personaje que desea elegir");
       int opcio = sc.nextInt();
       sc.nextLine();
       batala.elegirPersonaje(opcio);
        System.out.println("------------------------");
        System.out.println("Eres");
        int per = 1;
        System.out.println(batala.sala[0]);
        System.out.println("------------------------");
        System.out.println("TE ENFRENTAS CONTRA");
        int pe = 2;
        System.out.println(batala.sala[1]);
        System.out.println("------------------------");
        System.out.println("Que deseas hacer?");
        System.out.println("""
                           1. atacar
                           2. habilidad especial
                           """);
       
    } catch(Exception e){System.out.println("Error en el juego"); System.out.println(e);}
    }
    
    
}
