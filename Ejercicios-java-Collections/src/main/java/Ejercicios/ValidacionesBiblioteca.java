/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Ejercicios.Libro.estado;

/**
 *
 * @author dairo
 */
public class ValidacionesBiblioteca {
    LogicaBiblioteca logica = new LogicaBiblioteca();
    public void ValidacionAgregar(String isbn, String titulo, String autor, String año){
        boolean valido = false;
        if(isbn.isEmpty() || titulo.isEmpty() || autor.isEmpty() || año.isEmpty()){
            System.out.println("Alguno de los datos del libro no es valido");
            System.out.println("Por favor llenar todos los datos");
        } else {
        int isb = Integer.parseInt(isbn);
        int años = Integer.parseInt(año);
        estado esta = Libro.estado.Disponible;
        if(isb > 0 && años > 0){
        Libro libro = new Libro(isb,titulo,autor,años,esta);
        logica.agregarLibro(libro);
        valido = true;
         }else {System.out.println("el isb o el año del libro no son validos");}
       }
        if(!valido){
            System.out.println("No se agrego el libro por problemas en la validacion");
        }
    }
    public void ValidacionBuscar(String isbn){
        boolean valido = false;
        if(isbn.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int isb = Integer.parseInt(isbn);
          if(isb > 0){
              logica.buscarLibro(isb);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la busqueda del libro");}
    }
    public void ValidacionEliminar(String isbn){
    boolean valido = false;
        if(isbn.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int isb = Integer.parseInt(isbn);
          if(isb > 0){
              logica.eliminarLibro(isb);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la eliminacion del producto");}
    }
    public void validacionPrestar(String isbn){
        boolean valido = false;
        if(isbn.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int isb = Integer.parseInt(isbn);
          if(isb > 0){
              logica.prestarLibro(isb);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar el prestado del producto");}
    }
    public void validacionDevolver(String isbn){
         boolean valido = false;
        if(isbn.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int isb = Integer.parseInt(isbn);
          if(isb > 0){
              logica.devolverLibro(isb);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la devolucion del producto");}
    }
}
