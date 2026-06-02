/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Universidad;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class MenuUniversitario {
    public void iniciar(){
        ValidarMenu menu = new ValidarMenu();
        boolean salir = false ;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("""
                           ¿Que desea hacer?
                           1. Agregar persona
                           2. Eliminar persona-
                           3. Buscar persona
                           4. Mostrar personas
                           5. salir
                           """);
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion){
            case 1 -> {
                System.out.println("""
                                   ¿Que desea hacer?
                                   1. Agregar Profesor
                                   2. Agregar Alumno
                                   """);
                 int persona = sc.nextInt();
                 
                 switch (persona) {
                    case 1: 
                        System.out.println("---------------------");
                 System.out.println("Agregar numero de Identificacion del Profesor");
                 String numero = sc.nextLine();
                 System.out.println("Agregar nombre del Profesor");
                 String nombre = sc.nextLine();
                 System.out.println("Agregar nombre de la materia que imparte el Profesor");
                 String materia = sc.nextLine();
                 System.out.println("---------------------");
                        menu.validarAgregar(persona, numero, nombre, materia, numero);
                        break;
                    case 2: 
                        System.out.println("---------------------");
                 System.out.println("Agregar numero de Identificacion del Alumno");
                 String nume = sc.nextLine();
                 System.out.println("Agregar nombre del Alumno");
                 String nom = sc.nextLine();
                 System.out.println("Agregar nombre de la materia que recibe el Alumno");
                 String mate = sc.nextLine();
                 System.out.println("Agregar el semestre que se encuentra el Alumno");
                 String semestre = sc.nextLine();
                        menu.validarAgregar(persona, nume, nom, mate, semestre);
                        break;
                    default:
                        System.out.println("La opcion que eligio no es valida");
                }
                 
            }
            case 2 -> {
                System.out.println("Ingrese el numero de Identificacion de la persona");
                String ide = sc.nextLine();
                System.out.println("La persona eliminada es:");
                menu.validarBuscar(ide);
                menu.validarEliminar(ide);
            }
            case 3 -> {
                System.out.println("Ingrese el numero de Identificacion de la persona");
                String ide = sc.nextLine();
                System.out.println("La persona que busca es:");
                menu.validarBuscar(ide);
            }
            case 4 -> {
            System.out.println("""
                                   ¿Que desea hacer?
                                   1. Mostrar Profesores
                                   2. Mostrar Alumnos
                                   3. Mostrar Todos
                                   4. Mostrar por orden
                                   """);
                 String mos = sc.nextLine();
                 if(mos.equals("4")){
                  System.out.println("""
                                   ¿Que desea hacer?
                                   1. Mostrar Profesores
                                   2. Mostrar Alumnos
                                   3. Mostrar Todos
                                   """);
                 String mo = sc.nextLine();
                 menu.validarMostrarorden(mo);
                 } else {
                     menu.validarMostrar(mos);
                 }
                 
            }
        }
                } while(!salir);
    }
}
