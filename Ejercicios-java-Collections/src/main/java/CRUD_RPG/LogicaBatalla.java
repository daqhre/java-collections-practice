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
public class LogicaBatalla {
    Validacion_CRUD vali = new Validacion_CRUD();
    Logica_CRUD logica = new Logica_CRUD();
    ArrayList<Personaje> listabatalla = new ArrayList<>(logica.lista);
    Personaje [] sala = new Personaje[2];
    public void elegirPersonaje(int opcion){
        Personaje per = null;
         for (Personaje personaje : listabatalla) {
             int pos = listabatalla.indexOf(personaje);
             if(opcion == pos){
                 per = personaje;
             }
            
        }
         agregarSala(per);
    }
    public void agregarSala(Personaje per){
        if(per != null){
      if(sala[0] == null){
          sala[0] = per;
          System.out.println("Personaje elegido con exito");
      } else if(sala[1] == null){
      sala[1] = per;
      System.out.println("Personaje elegido con exito");
      } else{System.out.println("Sala llena no se pueden agregar mas personajes");}
     } else {
            System.out.println("NO se pudo elegir el personaje");
        }
    }
    
    public void ataque(int per, int ataque){
        if(per == 1){
         if(sala[0].getDefensa() > 0){
             int defen = (int) (sala[0].getDefensa() - ataque);
             sala[0].setDefensa(defen);
         } if(sala[0].getVida() > 0){
             int vida = (int) (sala[0].getVida() - ataque);
             sala[0].setDefensa(vida);
         } else {System.out.println("El personaje ya no tiene vida"); vida(1);}
        } else if(per == 2){
         if(sala[1].getDefensa() > 0){
             int defen = (int) (sala[1].getDefensa() - ataque);
             sala[1].setDefensa(defen);
         } if(sala[1].getVida() > 0){
             int vida = (int) (sala[1].getVida() - ataque);
             sala[1].setDefensa(vida);
         } else {System.out.println("El personaje ya no tiene vida"); vida(2);}
        }
    }
    public void vida(int vida){
        if(vida == 1){
            System.out.println("Has ganado");
        } else if (vida == 2){System.out.println("Has perdido");}
    }
    
}
