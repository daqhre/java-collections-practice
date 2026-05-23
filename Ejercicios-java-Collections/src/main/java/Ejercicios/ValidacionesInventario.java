/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author dairo
 */
public class ValidacionesInventario extends LogicaInventario {
   
    public void ValidacionAgregar(String codigo, String nombre, String precio, String cantidad){
        boolean valido = false;
        if(codigo.isEmpty() || nombre.isEmpty() || precio.isEmpty() || cantidad.isEmpty()){
            System.out.println("Alguno de los datos del producto no es valido");
            System.out.println("Por favor llenar todos los datos");
        } else {
        int codi = Integer.parseInt(codigo);
        double preci = Double.parseDouble(precio);
        int canti = Integer.parseInt(cantidad);
        if(codi > 0 && preci > 0 && canti > 0){
        Producto producto = new Producto(codi,nombre,preci,canti);
        AgregarProducto(codi, producto);
        valido = true;
         }else {System.out.println("El codigo, el precio y la cantidad obligatoriamente debe ser mayor a 0");}
       }
        if(!valido){
            System.out.println("No se agrego el produco por problemas en la validacion");
        }
    }
    public void ValidacionBuscar(String codigo){
        boolean valido = false;
        if(codigo.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int codi = Integer.parseInt(codigo);
          if(codi > 0){
              BuscarProducto(codi);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la busqueda del producto");}
    }
    public void ValidacionEliminar(String codigo){
    boolean valido = false;
        if(codigo.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int codi = Integer.parseInt(codigo);
          if(codi > 0){
              EliminarProducto(codi);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la eliminacion del producto");}
    }
    public void ValidacionCompra(String codigo, String cantidad){
        boolean valido = false;
        if(codigo.isEmpty() || cantidad.isEmpty()){
            System.out.println("Alguno de los datos que ingreso no son validos");
            System.out.println("Por favor llenar todos los datos");
        } else {
        int codi = Integer.parseInt(codigo);
        int canti = Integer.parseInt(cantidad);
        if(codi > 0 && canti > 0){
            if(canti <= lista.get(codi).getCantidad()){
        ComprarProducto(codi, canti);
        valido = true;
            } else {System.out.println("La cantidad pedida es mayor a la cantidad disponible");}
         }else {System.out.println("El codigo y la cantidad obligatoriamente debe ser mayor a 0");}
       }
        if(!valido){
            System.out.println("No se realizo la compra del produco por problemas en la validacion");
         }
        }
    }

    

