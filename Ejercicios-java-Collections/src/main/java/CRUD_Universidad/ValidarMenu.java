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
public class ValidarMenu {
   
    LogicaMenu logica = new LogicaMenu();
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
    public void validarAgregar(int opcion, String id, String nombre, String carrera, String semestre){
        try {
        if(datoVacio(id) && datoVacio(nombre) && datoVacio(carrera)&& datoVacio(semestre ) ){
            System.out.println(mesanjes());
        } else {
            int iden = Integer.parseInt(id);
            double semes = Double.parseDouble(semestre);
            switch (opcion) {
                case 1:
                     Persona persona = new Alumno(iden, nombre, carrera, semes);
            logica.agregarPersona(persona);
                    break;
                case 2: 
                     Persona person = new Profesor(iden, nombre, carrera);
            logica.agregarPersona(person);
                default:
                    System.out.println("La opcion que eligio no es valida");
            }
           }
        } catch(Exception e){System.out.println("Error:" + e);}
    
    }
    public void validarEliminar(String id){
        
        try {
            if(datoVacio(id)){
            mesanjes();
            }else {
                int iden = Integer.parseInt(id);
            logica.eliminarPerosnas(iden);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
    public void validarBuscar(String id){
        
        try {
            if(datoVacio(id)){
            mesanjes();
            }else {
                int iden = Integer.parseInt(id);
            logica.buscarPersona(iden);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
    public void validarMostrar(String id){
        
        try {
            if(datoVacio(id)){
            mesanjes();
            }else {
                int iden = Integer.parseInt(id);
            logica.mostrarPersonas(iden);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
   public void validarMostrarorden(String id){
        
        try {
            if(datoVacio(id)){
            mesanjes();
            }else {
                int iden = Integer.parseInt(id);
            logica.mostrarOrden(iden);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }        
}
