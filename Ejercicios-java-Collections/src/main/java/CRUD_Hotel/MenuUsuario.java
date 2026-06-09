/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class MenuUsuario {
    Scanner sc = new Scanner(System.in);
    LogicaHotel logica = new LogicaHotel();
    ValidacionLogica validar = new ValidacionLogica(logica);
    
     private Cliente cliente;
     private Habitacion habita;
     
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabita() {
        return habita;
    }

    public void setHabita(Habitacion habita) {
        this.habita = habita;
    }
    public void registrarUsuario(){
        try {
        System.out.println("Bienvenido");
        System.out.println("Para poder registrarse debe proporicionar"
                + " su numero de identificacion,"
                + " su nombre y su numero telefonico");
        System.out.println("Ingrese su numero de identificacion");
        String numero = sc.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su numero telefonico");
            String numer = sc.nextLine();
            validar.validarAgregarcliente(numero, nombre, numer);
            System.out.println("Resigtrado con exito");
            int iden = Integer.parseInt(numero);
            setCliente(logica.buscarCliente(iden));
            iniciarUsuario();
        } catch(Exception e){System.out.println("Error al registrar un usuario " + e);}
    }
    public void iniciarUsuario(){
   
    try {
        boolean salir = false;
        do{
            System.out.println("Bienvenido " + getCliente().getNombre());
        System.out.println("¿Que desea hacer?");
        System.out.println("""
                           1. Mostrar habitaciones disponibles
                           2. Hacer una reserva
                           3. Cancelar una reserva
                           4. Mostrar mis reservas
                           5. salir
                           """);
        String op = sc.nextLine();
        int opcion = Integer.parseInt(op);
        switch(opcion){
            case 1 -> {
                System.out.println("""
                                   ¿Que tipo de habitaciones desea ver?
                                   1. Habitaciones simples
                                   2. Habitaciones dobles
                                   3. Suite
                                   4. Todas
                                   """);
                String habi = sc.nextLine();
                System.out.println("Habitaciones Disponibles:");
                validar.validarBuscarhabitacion(habi);
            }
            case 2 -> {
                System.out.println("""
                                   ¿Que tipo de habitaciones desea elegir?
                                   1. Habitaciones simples
                                   2. Habitaciones dobles
                                   3. Suite
                                   4. Todas
                                   """);
                String habi = sc.nextLine();
                System.out.println("Habitaciones Disponibles:");
                validar.validarBuscarhabitacion(habi);
                boolean no = false;
                while(!no){
                System.out.println("Ingrese el numero de la habitacion que desea reservar");
                String numero = sc.nextLine();
                validar.validarBuscarhabitacion(numero);
                int abi = Integer.parseInt(numero);
                    System.out.println("""
                                       ¿Seguro que desea reservar esa habitacion?
                                       1. Si
                                       2. No
                                       3. Salir al menu principal
                                       """);
                    String opc = sc.nextLine();
                    int opcio = Integer.parseInt(opc);
                    switch(opcio){
                        case 1 -> {
                            setHabita(logica.buscarHabitacion(abi)); 
                            System.out.println("Ingrese las noches que desea alquilar");
                            int noches = sc.nextInt();
                            sc.nextLine();
                            habita.setDispoible(Habitacion.estado.NoDispobible);
                            habita.setCliente(getCliente());
                            System.out.println("El costo por esa cantidad de noches es " + habita.calcularcosto(noches) + "USD");
                           Reservas reserva = new Reservas(getCliente(), getHabita(), noches);
                           logica.agregarReserva(reserva);
                           no = true;
                        }
                        case 2 ->{}
                        case 3 ->{no = true;}
                        default ->{System.out.println("La opcion que eligio no es valida");}
                    }
                }
            }
            case 3 -> {
                logica.mostrarReservas(getCliente());
                System.out.println("Ingrese el numero de la habitacion para eliminar la reserva");
                String numero = sc.nextLine();
                int abi = Integer.parseInt(numero);
                setHabita(logica.buscarHabitacion(abi));
                getHabita().setDispoible(Habitacion.estado.Disponible);
                Reservas reserva = new Reservas(getCliente(), getHabita(), 1);
                logica.eliminarReserva(reserva);
            }
            case 4 -> {
                logica.mostrarReservas(getCliente());
            }
            case 5 -> { System.out.println("Gracias por participar");
                salir = true;}
            default ->{System.out.println("La opcion que eligio no es valida");}
         }
        } while(!salir);
    } catch(NumberFormatException e){System.out.println("Error en el inicio de sesion de usuario " + e);}
        
    }
    
    
    
}
