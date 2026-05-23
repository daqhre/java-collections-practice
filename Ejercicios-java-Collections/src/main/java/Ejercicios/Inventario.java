/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class Inventario {
    ValidacionesInventario validar = new ValidacionesInventario();
    Scanner sc = new Scanner(System.in);
    public void iniciar(){
        boolean salir = false;
        do{
            System.out.println("""
                               ¿Que desea hacer?
                               1. Agregar un Producto
                               2. Mostrar Productos
                               3. Buscar producto
                               4. Eliminar producto
                               5. Mostrar cantidad de productos
                               6. Salir
                               """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println("Ingrese el codigo del producto");
                    String codigo = sc.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    String precio = sc.nextLine();
                    System.out.println("Ingrese la cantidad");
                    String cantidad = sc.nextLine();
                    validar.ValidacionAgregar(codigo, nombre, precio, cantidad);
                }
                case 2 -> {
                    validar.MostrarProducto();
                }
                case 3 -> {
                    boolean salir2 = false;
                    System.out.println("Ingrese el codigo del producto");
                    String codigo = sc.nextLine();
                    validar.ValidacionBuscar(codigo);
                    while(!salir2){
                        System.out.println("""
                                           ¿Que desea hacer?
                                           1. Comprar producto
                                           2. Eliminar producto
                                           3. Salir
                                           """);
                        int opcion2 = sc.nextInt();
                        sc.nextLine();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese la cantidad de productos que desea comprar");
                                String canti = sc.nextLine();
                                validar.ValidacionCompra(codigo, canti);
                                break;
                            case 2:
                                validar.ValidacionEliminar(codigo);
                                salir2 = true;
                                break;
                            case 3:
                                salir2 = true;
                                break;
                            default:
                                System.out.println("La opcion que eligio no es valida");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el codigo del producto");
                    String codigo = sc.nextLine();
                    validar.ValidacionEliminar(codigo);
                }
                case 5 -> {
                    validar.MostrarCantidad();
                }
                case 6 -> {
                salir = true;
                }
                default -> {
                    System.out.println("La opcion que ingreso no es valida");
                }
            }
        }while(!salir);
        sc.close();
    }
}
