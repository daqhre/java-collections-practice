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
public class Biblioteca {
    LogicaBiblioteca biblio = new LogicaBiblioteca();
    ValidacionesBiblioteca validar = new ValidacionesBiblioteca();
    Scanner sc = new Scanner(System.in);
    public void iniciar(){
        boolean salir = false;
        do{
            System.out.println("""
                               ¿Que desea hacer?
                               1. Agregar un Libro
                               2. Mostrar Libros
                               3. Buscar Libro
                               4. Eliminar Libro
                               5. Mostrar Libros disponibles
                               6. Salir
                               """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println("Ingrese el isbn del libro");
                    String codiisbn = sc.nextLine();
                    System.out.println("Ingrese el titulo del libro");
                    String titu = sc.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese el año de publicacion del libro");
                    String año = sc.nextLine();
                    validar.ValidacionAgregar(codiisbn, titu, autor, año);
                }
                case 2 -> {
                    biblio.mostrarLibros();
                    boolean sa1 = false;
                    while(!sa1){
                        System.out.println("""
                                           ¿Que desea hacer?
                                           1. Mostrar ordenado por titulo
                                           2. Mostrar ordenado por autor
                                           3. Salir
                                           """);
                        int op1 = sc.nextInt();
                        sc.nextLine();
                        switch (op1) {
                            case 1: 
                                biblio.ordenNombre();
                                break;
                            case 2: 
                                biblio.ordenAutor();
                                break; 
                            case 3: 
                                 sa1 = true;
                                break;
                            default:
                                System.out.println("La opcion que eligio no es valida");
                        }
                    }
                }
                case 3 -> {
                    boolean sa2 = false;
                    System.out.println("Ingrese el isbn del libro");
                    String isbn = sc.nextLine();
                    validar.ValidacionBuscar(isbn);
                    while(!sa2){
                        System.out.println("""
                                           ¿Que desea hacer con el libro?
                                           1. prestar libro
                                           2. devolver libro
                                           3. Salir
                                           """);
                        int opcion2 = sc.nextInt();
                        sc.nextLine();
                        switch (opcion2) {
                            case 1:
                                validar.validacionPrestar(isbn);
                                break;
                            case 2:
                                validar.validacionDevolver(isbn);
                                break;
                            case 3:
                                sa2 = true;
                                break;
                            default:
                                System.out.println("La opcion que eligio no es valida");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el isbn del libro");
                    String isbn = sc.nextLine();
                    validar.ValidacionEliminar(isbn);
                }
                case 5 -> {
                   biblio.ordenDisponibles();
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
