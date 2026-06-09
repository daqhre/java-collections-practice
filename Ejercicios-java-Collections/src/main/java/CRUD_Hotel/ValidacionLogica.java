/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;
import CRUD_Hotel.Habitacion.estado;
/**
 *
 * @author dairo
 */
public class ValidacionLogica {
    LogicaHotel logica = new LogicaHotel();

    ValidacionLogica(LogicaHotel logica) {
        this.logica = logica;
    }
    public boolean datoVacio(String dato){
        return dato.isEmpty();
    }
    public String mesanjes(){
      String men = """
                   El dato que ingreso no son validos 
                   Por favor ingresar datos validos""";
      return men;
  }
    //Validaciones para los clientes
    public void validarAgregarcliente(String identificacion, String nombre, String numero){
        try{
            if(datoVacio(numero) || datoVacio(nombre) || datoVacio(identificacion)){
                mesanjes();
            } else {
            int id = Integer.parseInt(identificacion);
            Cliente cliente = new Cliente(id, nombre, numero);
            logica.agregarCliente(cliente);
            }
        } catch(NumberFormatException e){System.out.println("Error al validar un nuevo cliente " + e);}
    }
    public void validarBuscarcliente(String identificacion){
        try{
            if(datoVacio(identificacion)){
                mesanjes();
            } else {
            int id = Integer.parseInt(identificacion);
                System.out.println(logica.buscarCliente(id));
            }
        } catch(NumberFormatException e){System.out.println("Error al validar buscar un cliente " + e);}
    }
    public void validarEliminarcliente(String identificacion){
        try{
            if(datoVacio(identificacion)){
                mesanjes();
            } else {
            int id = Integer.parseInt(identificacion);
                logica.eliminarCliente(id);
            }
        } catch(NumberFormatException e){System.out.println("Error al validar eliminar un cliente " + e);}
    }
    //Validaciones para las habitaciones
    public void validarAgregarhabitacion(String op, String numero){
        try{
            if(datoVacio(op) || datoVacio(numero)){
                mesanjes();
            } else {
            int opcion = Integer.parseInt(op);
            int num = Integer.parseInt(numero);
            switch (opcion){
                case 1 -> {
                    HambitacionSimple simple = new HambitacionSimple(num, Habitacion.estado.Disponible);
                    logica.agregarHabitacion(simple);
                }
                case 2 -> {
                    HabitacionDoble doble = new HabitacionDoble(num, Habitacion.estado.Disponible);
                    logica.agregarHabitacion(doble);
                }
                case 3 -> {
                    Suite suite = new Suite(num, Habitacion.estado.Disponible);
                    logica.agregarHabitacion(suite);
                }
                default -> {System.out.println("La opcion que eligio no es valida");}
             }
            }
        } catch(NumberFormatException e){System.out.println("Error al agregar una habitacion " + e);}
    }
    public void validarBuscarhabitacion(String numero){
        try{
            if(datoVacio(numero)){
                mesanjes();
            } else {
            int id = Integer.parseInt(numero);
                if(logica.buscarHabitacion(id) != null && logica.buscarHabitacion(id).getDispoible() == estado.Disponible){
                    System.out.println(logica.buscarHabitacion(id));
                } else {System.out.println("La habitacion que busca no esta disponible");}
            }
        } catch(NumberFormatException e){System.out.println("Error al validar buscar un habitacion " + e);}
    }
    public void validarEliminarhabitacion(String numero){
        try{
            if(datoVacio(numero)){
                mesanjes();
            } else {
            int id = Integer.parseInt(numero);
                logica.eliminarHabitacion(id);
            }
        } catch(NumberFormatException e){System.out.println("Error al validar eliminar un habitacion " + e);}
    }
    public void validarmostrarHabitacionesdisponibles(String numero){
        try{
            if(datoVacio(numero)){
                mesanjes();
            } else {
            int id = Integer.parseInt(numero);
                logica.mostrarHabitacionesdisponibles(id);
            }
        } catch(NumberFormatException e){System.out.println("Error al validar mostrar habitaciones disponibles " + e);}
    }
    public void validarMostrarhabitaciones(String numero){
        try{
            if(datoVacio(numero)){
                mesanjes();
            } else {
            int id = Integer.parseInt(numero);
                logica.mostrarHabitaciones(id);
            }
        } catch(NumberFormatException e){System.out.println("Error al validar mostrar habitaciones " + e);}
    }
}
