/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

/**
 *
 * @author dairo
 */
public class Validacion_CRUD {
   Logica_CRUD logica = new Logica_CRUD();

    
    // metodo para validar dato vacio
   public boolean datoVacio(String dato){
    return dato.isEmpty();
  }
   //mensaje para cuando un dato este vacio
  public String mesanjes(){
      String men = """
                   El dato que ingreso no son validos 
                   Por favor ingresar datos validos""";
      return men;
  }
   
   public void validacionAgregar(String opcion, String nombre){
       try {
           if(datoVacio(opcion) && datoVacio(nombre)){
               mesanjes();
           } else {
               int op = Integer.parseInt(opcion);
               switch(op){
                   case 1 -> {
                       Personaje player = new Mago(nombre,1000,1,660,300);
                       logica.agregarPersonaje(player);
                   }
                   case 2 -> {
                       Personaje player = new Guerrero(nombre,1000,1,300,900);
                       logica.agregarPersonaje(player);
                   }
                   case 3 -> {
                       Personaje player = new Arquero(nombre,1000,1,550,500);
                       logica.agregarPersonaje(player);
                   }
                   default -> {System.out.println("La opcion que eligio no es valida");}
               }
           }
       } catch(NumberFormatException e){System.out.println("Error en validacion agregar"); System.out.println(e);}
   }
   public void validacionMostrar(String opcion){
   try {
           if(datoVacio(opcion)){
               mesanjes();
           } else {
               int op = Integer.parseInt(opcion);
               logica.mostrarPersonajes(op);
           }
       } catch(NumberFormatException e){System.out.println("Error en validacion mostrar"); System.out.println(e);}
   }
   public void validacionBuscar(String nombre){
       if(datoVacio(nombre)){
          mesanjes();
       } else {
        Personaje perbuscar = new Mago(nombre,0,0,0,0);
            logica.buscarPersonaje(perbuscar);
        
       }
   }
   public void validacionEliminar(String nombre){
       if(datoVacio(nombre)){
          mesanjes();
       } else {
        Personaje pereliminar = new Mago(nombre,0,0,0,0);
            logica.elimanarPersonaje(pereliminar);
        
       }
   }
}
