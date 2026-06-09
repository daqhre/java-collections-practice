/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

import CRUD_Hotel.Habitacion.estado;
import java.util.ArrayList;

/**
 *
 * @author dairo
 */
public class LogicaHotel {
    ArrayList<Cliente> listacliente = new ArrayList<>();
    ArrayList <Habitacion> listahabitaciones = new ArrayList<>();
    ArrayList<Reservas> listareservas = new ArrayList<>();
    //metodos para los clientes
    public void agregarCliente(Cliente cliente){
        if(listacliente.contains(cliente)){
            System.out.println("El Usuario ya esta registrado");
        } else {listacliente.add(cliente); System.out.println("Cliente agregado con exito");}
        
    }
    
    public Cliente buscarCliente(int id){
        Cliente client = null;
        for (Cliente cliente1 : listacliente) {
            if(cliente1.getId() == id){
                client = cliente1;
            }
        }
        return client;
    }
    
    public void eliminarCliente(int id){
        if(listacliente.contains(buscarCliente(id))){
            listacliente.remove(buscarCliente(id));
            System.out.println("Cliente eliminado con exito");
        } else {System.out.println("El usuario que desea eliminar no existe");}
    }
    
    public void mostrarClientes(){
        if(!listacliente.isEmpty()){
        for (Cliente cliente : listacliente) {
            System.out.println(cliente);
         }
        }else{
            System.out.println("No hay clientes registrados");
        }
    }
    //metodos para las habitaciones
    public void agregarHabitacion(Habitacion habita){
        if(listahabitaciones.contains(habita)){
            System.out.println("Esta habitacion ya exite");
        }else {listahabitaciones.add(habita); System.out.println("Habitacion agregada con exito");}
    }
    public Habitacion buscarHabitacion(int numero){
        Habitacion habita = null;
        for (Habitacion habitacion : listahabitaciones) {
            if(habitacion.getNumero() == numero){
                habita = habitacion;
            }
        }
        return habita;
    }
    public void eliminarHabitacion(int numero){
        if(listahabitaciones.contains(buscarHabitacion(numero))){
            listahabitaciones.remove(buscarHabitacion(numero));
            System.out.println("Habitacion eliminada con exito");
        }else{System.out.println("La habitacion que desea eliminar no existe");}
    }
    public void mostrarHabitacionesdisponibles(int op2){
        System.out.println("Habitaciones disponibles: ");
        for (Habitacion habita : listahabitaciones) {
                    switch(op2){
                        case 1 -> {
                            if(habita instanceof HambitacionSimple){
                                if(habita.getDispoible() == estado.Disponible){
                                    System.out.println(habita);
                                } 
                            }
                        }
                        case 2 -> {
                            if(habita instanceof HabitacionDoble){
                                if(habita.getDispoible() == estado.Disponible){
                                    System.out.println(habita);
                                } 
                            }
                        }
                        case 3 -> {
                            if(habita instanceof Suite){
                                if(habita.getDispoible() == estado.Disponible){
                                    System.out.println(habita);
                                } 
                            }
                        }
                        case 4 -> {
                            if(habita.getDispoible() == estado.Disponible){
                                    System.out.println(habita);
                                } 
                        }
                        default ->{System.out.println("La opcion que eligio no es valida");}
                    }
        }
    }
    public void mostrarHabitaciones(int op1){
        for (Habitacion habita : listahabitaciones) {
            switch(op1){
                case 1 -> {
                            if(habita.getDispoible() == estado.Disponible){
                                    System.out.println(habita);
                                } 
                    }
                case 2 -> {
                    if(habita.getDispoible() == estado.NoDispobible){
                                    System.out.println(habita);
                                } 
                }
                case 3 -> {
                    System.out.println(habita);
                }
                default ->{System.out.println("La opcion que eligio no es valida");}
            }
        }
 }
    //metodos para las reservas
    public void agregarReserva(Reservas reserva){
        if(listareservas.isEmpty()){
            System.out.println("No hay reservas existentes");
        }else{
            listareservas.add(reserva);
        }
    }
    public void eliminarReserva(Reservas reserva){
        if(listareservas.contains(reserva)){
            listareservas.remove(reserva);
        } else {System.out.println("La reserva no exite");}
    }
    public void mostrarReservas(Cliente cliente){
        for (Reservas reserva : listareservas) {
            if(reserva.cliente == cliente){
                System.out.println(reserva);
            }
        }
    }
    public void mostrarReservas(){
        for (Reservas reserva : listareservas) {
            System.out.println(reserva);
        }
    }
    
}
