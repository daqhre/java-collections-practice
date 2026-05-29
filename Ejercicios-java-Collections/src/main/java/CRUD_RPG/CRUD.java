/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;




import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class CRUD {
    Logica_CRUD logica = new Logica_CRUD();
    Validacion_CRUD validar = new Validacion_CRUD();
    Batalla batalla = new Batalla();
Scanner sc = new Scanner(System.in);
    public void iniciar(){
        try {
        boolean salir = false;
        do{
            System.out.println("""
                               ¿Que desea hacer?
                               1. Agregar un persoanje
                               2. Mostrar personajes
                               3. Buscar persoanje
                               4. Eliminar personaje
                               5. Batalla
                               6. salir
                               """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println("Que desea hacer?");
                    System.out.println("""
                                       1. Agregar Mago
                                       2. Agregar Guerrrero
                                       3. Agregar Arquero
                                       """);
                    String op = sc.nextLine();
                    int p = Integer.parseInt(op);
                    if(p == 1){
                        System.out.println("Ingrese el numero del personaje");
                    String nom = sc.nextLine();
                    validar.validacionAgregar(op, nom);
                    } else {
                        System.out.println("La opcion que eligio no es valida");
                    }
                    
                }
                case 2 -> {
                    System.out.println("Que desea hacer?");
                    System.out.println("""
                                       1. Mostrar Magos
                                       2. Mostrar Guerrreros
                                       3. Mostrar Arqueros
                                       4. Mostrar todos
                                       """);
                    String op = sc.nextLine();
                    int p = Integer.parseInt(op);
                    logica.mostrarPersonajes(p);
                }
                case 3 -> {
                    boolean sa2 = false;
                    System.out.println("Ingrese el nombre del personaje");
                    String iden = sc.nextLine();
                    validar.validacionBuscar(iden);
                }
                case 4 -> {
                    System.out.println("Ingrese el nombre del personaje");
                    String iden = sc.nextLine();
                    validar.validacionEliminar(iden);
                }
                case 5 -> {
                    batalla.juego();
                }
                case 6 -> {
                   salir = true;
                }
                default -> {
                    System.out.println("La opcion que ingreso no es valida");
                }
            }
        }while(!salir);
        } catch(Exception e){
            System.out.println("Hubo un error en el menu");
            System.out.println(e);
        }
        sc.close();
        
    }
}
