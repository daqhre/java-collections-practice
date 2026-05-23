/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dairo
 */
public class LogicaInventario {
    HashMap<Integer, Producto> lista = new HashMap<>();
    
    public void AgregarProducto(int codigo, Producto producto){
    if(lista.containsKey(codigo)){
        System.out.println("El codigo ingresado ya lo tiene un producto especifico");
        System.out.println("Por favor ingrese otro codigo");
      } else {
        lista.put(codigo, producto);
        System.out.println("Producto agregado con exito");
     }
    }
    public void MostrarProducto(){
    if(lista.isEmpty()){
        System.out.println("La lista esta vacia, no hay ningun producto registrado");
      } else {
        System.out.println("Los productos son:");
        for (Map.Entry<Integer, Producto> entry : lista.entrySet()) {
            System.out.println(entry.getValue());
        }
     }
    }
    public void BuscarProducto(int codigo){
        if(lista.containsKey(codigo)){
            System.out.println("El Producto es: " + lista.get(codigo));
        } else {
            System.out.println("El producto buscado no esta en la lista");
        }
    }
    public void EliminarProducto(int codigo){
        if(lista.containsKey(codigo)){
            lista.remove(codigo);
            System.out.println("El producto a sido eliminado con exito");
        } else {
            System.out.println("El producto no esta registrado en la lista");
        }
    }
    //este es el metodo para actualizar el stock o cantidad hecho asi para que se equivalente a un proceso
    public void ComprarProducto(int codigo, int cantidad){
        boolean compra = false;
        int nuevacantidad = lista.get(codigo).getCantidad() - cantidad;
        lista.get(codigo).setCantidad(nuevacantidad);
            if(nuevacantidad == lista.get(codigo).getCantidad()){
                compra = true;
            }
            if(compra){
                System.out.println("Compra realizada con exito");
            } else {
                System.out.println("La compra no se pudo realizar");
            }
        
    }
    public void MostrarCantidad(){
        System.out.println("La cantidad de productos registrados son: " + lista.size());
    }
    
}
