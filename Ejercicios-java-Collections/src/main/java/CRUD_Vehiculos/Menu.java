/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class Menu {
    public void iniciar(){
        LogicaMenu logica = new LogicaMenu();
        ValidarMenu validar = new ValidarMenu(logica);
        boolean salir = false ;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("""
                           ¿Que desea hacer?
                           1. Agregar Vehiculo
                           2. Eliminar Vehiculo
                           3. Buscar Vehiculo
                           4. Mostrar Vehiculos
                           5. salir
                           """);
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion){
            case 1 -> {
                System.out.println("""
                                   ¿Que desea hacer?
                                   1. Agregar Carro
                                   2. Agregar Moto
                                   3. Agregar Camion
                                   """);
                String ve = sc.nextLine();
                 int vehiculo = Integer.parseInt(ve);
                 
                 switch (vehiculo) {
                    case 1: 
                        System.out.println("---------------------");
                 System.out.println("Agregar la placa del carro");
                 String numero = sc.nextLine();
                 System.out.println("Agregar la marcar del carro");
                 String nombre = sc.nextLine();
                 System.out.println("Agregar modelo del carro");
                 String materia = sc.nextLine();
                 System.out.println("Agregar la cantidad de puertas del carro");
                 String puertas = sc.nextLine();
                 System.out.println("---------------------");
                        validar.validarAgregar(ve, numero, nombre, materia, puertas);
                        break;
                    case 2: 
                        System.out.println("---------------------");
                 System.out.println("Agregar la placa de la moto");
                 String numer = sc.nextLine();
                 System.out.println("Agregar la marcar de la moto");
                 String nombr = sc.nextLine();
                 System.out.println("Agregar modelo de moto");
                 String materi = sc.nextLine();
                 System.out.println("Agregar el cilindraje de la moto");
                 String puerta = sc.nextLine();
                 System.out.println("---------------------");
                        validar.validarAgregar(ve, numer, nombr, materi, puerta);
                        break;
                    case 3: 
                        System.out.println("---------------------");
                 System.out.println("Agregar la placa del camion");
                 String nume = sc.nextLine();
                 System.out.println("Agregar la marcar del camion");
                 String nomb = sc.nextLine();
                 System.out.println("Agregar modelo del camion");
                 String mater = sc.nextLine();
                 System.out.println("Agregar la cantidad de peso del camion");
                 String puert = sc.nextLine();
                 System.out.println("---------------------");
                        validar.validarAgregar(ve, nume, nomb, mater, puert);
                        break;
                    default:
                        System.out.println("La opcion que eligio no es valida");
                }
                 
            }
            case 2 -> {
                System.out.println("Ingrese la placa del vehiculo");
                String placa = sc.nextLine();
                System.out.println("El vehiculo eliminado es:");
                validar.validarBuscar(placa);
                validar.validarEliminar(placa);
            }
            case 3 -> {
                System.out.println("Ingrese la placa del vehiculo");
                String placa = sc.nextLine();
                System.out.println("el vehiculo que busca es:");
                validar.validarBuscar(placa);
                System.out.println("""
                                   ¿Desea saber el costo de seguro y mantenimiento?
                                   1. si
                                   2. no
                                   """);
                String op = sc.nextLine();                
                if(op.equalsIgnoreCase("si")){
                    validar.validarseguroymantenimiento(placa);
                }
            }
            case 4 -> {
            System.out.println("""
                                   ¿Que desea hacer?
                                   1. Mostrar carros
                                   2. Mostrar motos
                                   3. Mostrar camiones
                                   4. Mostrar Todos
                                   5. Mostrar ordenado por  marca
                                   6. Mostrar ordenado por  mantenimiento
                                   """);
                 String mos = sc.nextLine();
                 validar.validarMostrar(mos);
            }
            case 5 -> {
            salir = true;
            }
        }
                } while(!salir);
    }
}
