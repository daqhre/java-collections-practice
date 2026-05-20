/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class LogicaAgenda {
    ArrayList<Contacto> contactos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void AgregarContacto(Contacto contacto){
    contactos.add(contacto);
    }
    public void MostrarContactos(){
    if(contactos.isEmpty()){
        System.out.println("No hay ningun contacto registrado");
     } else {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
     }
    }
    public void BuscarContacto(String correo){
        boolean encontrado = false;
        if(!correo.isEmpty()){
        for (Contacto contacto : contactos) {
            if (contacto.getCorreo().equals(correo)) {
                System.out.println(contacto);
                encontrado = true;
            }
         }
        if(!encontrado){
            System.out.println("El usuario no fue encontrado");
        }
        } else {
            System.out.println("No ha ingresado Ningun correo");
            System.out.println("POR FAVOR INGRESAR EL CORREO");
            System.out.println("");
        }
    }
    
    public void EditarContacto(String correo){
        
        if(!correo.isEmpty()){
        for (Contacto contacto : contactos) {
            if (contacto.getCorreo().equals(correo)) {
                System.out.println("Ingrese el nuevo nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el nuevo numero");
                String numerotelefonico = sc.nextLine();
                int numero = Integer.parseInt(numerotelefonico);
                if(nombre.isEmpty() || numerotelefonico.isEmpty()){
                    System.out.println("No ingreso el Nombre, el Numero telefonico o el correo electronico");
                    System.out.println("POR FAVOR INTENTELO OTRA VEZ");
                } else{
                contacto.setNombre(nombre);
                contacto.setNumero(numero);
                    System.out.println("El contacto a sido editado con exito");
                }
                
            }
         }
        } else {
            System.out.println("No ha ingresado Ningun correo");
            System.out.println("POR FAVOR INGRESAR EL CORREO");
            System.out.println("");
        }
    }
    public void EliminarContacto(String correo){
        boolean encontrado = false;
        Contacto eliminar = null;
        if(!correo.isEmpty()){
        for (Contacto contacto : contactos) {
            if (contacto.getCorreo().equals(correo)) {
                encontrado = true;
                eliminar = contacto;
            }
         }
        if(encontrado){
        contactos.remove(eliminar);
            System.out.println("El contacto a sido eliminado con exito");
        }
        } else {
            System.out.println("No ha ingresado Ningun correo");
            System.out.println("POR FAVOR INGRESAR EL CORREO");
            System.out.println("");
        }
    }
    public void ContarContactos(){
        
        System.out.println("La cantidad de contactos que hay son: " + contactos.size());
    }
    public void Inicio(){
    boolean salir = false;
    do{
        
        System.out.println("""
                         ¿Que desea hacer?
                           1. Agregar contacto
                           2. Mostrar contactos
                           3. Buscar contacto por correo
                           4. Eliminar contacto
                           5. Editar contacto
                           6. Mostrar cantidad de contactos
                           7. Salir
                           """);
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1 -> {
                System.out.println("Ingrese el nombre:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el numero telefonico:");
                String numerotelefonico = sc.nextLine();
                int numero = Integer.parseInt(numerotelefonico);
                System.out.println("Ingrese el correo electronico");
                String correo = sc.nextLine();
                if(nombre.isEmpty() || numerotelefonico.isEmpty() || correo.isEmpty()){
                    System.out.println("No ingreso el Nombre, el Numero telefonico o el correo electronico");
                    System.out.println("POR FAVOR INTENTELO OTRA VEZ");
                } else {
                Contacto contacto = new Contacto(nombre,numero,correo);
                    AgregarContacto(contacto);
                }
            }
            case 2 -> {
            MostrarContactos();
            }
            case 3 -> {
                System.out.println("Ingrese el correo del contacto");
                String correo = sc.nextLine();
                if (correo.isEmpty()) {
                    System.out.println("No ingreso ningun correo");
                } else {
                    BuscarContacto(correo);
                }
            }
            case 4 -> {
            System.out.println("Ingrese el correo del contacto");
                String correo = sc.nextLine();
                if (correo.isEmpty()) {
                    System.out.println("No ingreso ningun correo");
                } else {
                    EliminarContacto(correo);
                }
            }
            case 5 -> {
            System.out.println("Ingrese el correo del contacto");
                String correo = sc.nextLine();
                if (correo.isEmpty()) {
                    System.out.println("No ingreso ningun correo");
                } else {
                    EditarContacto(correo);
                }
            }
            case 6 -> {
            ContarContactos();
            }
            case 7 -> {
            salir = true;
            }
        }
        
    }while(!salir);
    sc.close();
    }
    
    
}
