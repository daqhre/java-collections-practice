/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Ejercicios.Tarea.estado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class ListaTareas {

    public void Iniciar() {
        ArrayList<Tarea> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean fin1 = false;
        do {
            System.out.println("""
                          ¿Que desea hacer?
                         1. Agregar tarea
                         2. Mostrar tareas
                         3. Completar tarea
                         4. Eliminar tarea
                         5. Cantidad de tareas
                         6. Editar tarea
                         7. Salir
                           """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    boolean existe = false;
                    System.out.println("Ingrese el nombre de la tarea");
                    String nombre = sc.nextLine();
                    if (nombre.isEmpty()) {
                        System.out.println("No ingreso ningun nombre");
                    } else {
                        System.out.println("Ingrese el estado de la tarea");
                                System.out.println("""
                                           1. Pendiente
                                           2. Completada
                                           """);
                                int est = sc.nextInt();
                                estado esta = null;
                                switch (est) {
                                    case 1:
                                        esta = estado.PENDIENTE;
                                        break;
                                    case 2:
                                        esta = estado.COMPLETADA;
                                        break;
                                    default:
                                        System.out.println("El valor que ingreso no es valido");
                                        break;
                                }
                        Tarea tarea = new Tarea(nombre, esta);
                        
                            if (tareas.contains(tarea)) {
                                existe = true;
                            }
                        
                        if (existe) {
                            System.out.println("La tarea ya existe");
                        } else {
                            tareas.add(tarea);
                            System.out.println("Tarea Registrada con exito");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("""
                                   ¿Que desea hacer?
                                   1. Mostrar todas las tareas 
                                   2. Mostrar solo tareas pendientes
                                   3. Mostrar solo tareas completadas
                                   """);
                    int op = sc.nextInt();
                    switch (op) {
                        case 1 -> {
                            if (tareas.isEmpty()) {
                                System.out.println("La lista esta vacia");
                            } else {
                                for (Tarea tarea : tareas) {
                                    System.out.println(tarea);
                                }
                            }
                        }
                        case 2 -> {
                            int completa = 0;
                    for (Tarea tarea : tareas) {
                        if (tarea.getEstadotarea().equals(estado.PENDIENTE)) {
                            completa++;
                        } 
                    }
                            
                            if (completa <= 0) {
                                System.out.println("La lista no tiene tareas pendientes");
                            } else {
                                for (Tarea tarea : tareas) {
                                    if (tarea.getEstadotarea().equals(estado.PENDIENTE)) {
                                        System.out.println(tarea);
                                    }
                                }
                            }
                        }
                        case 3 -> {
                            
                    int pendiente = 0;
                    for (Tarea tarea : tareas) {
                        if (tarea.getEstadotarea().equals(estado.COMPLETADA)) {
                            pendiente++;
                        }
                    }
                            if (pendiente <= 0) {
                                System.out.println("La lista no tiene tareas completadas");
                            } else {
                                for (Tarea tarea : tareas) {
                                    if (tarea.getEstadotarea().equals(estado.COMPLETADA)) {
                                        System.out.println(tarea);
                                    }
                                }
                            }
                        }
                    }

                }
                case 3 -> {
                    boolean encontrado = false;
                    System.out.println("Tareas pendientes");
                    for (Tarea tarea : tareas) {
                                    if (tarea.getEstadotarea().equals(estado.PENDIENTE)) {
                                        System.out.println(tarea);
                                    }
                    }
                    System.out.println("Ingrese el nombre de la tarea que asignara como completada");
                    String nombre = sc.nextLine();
                    
                    if (nombre.isEmpty()) {
                        System.out.println("No ingreso ningun nombre");
                    } else {
                        for (Tarea tarea : tareas) {
                            if (nombre.equalsIgnoreCase(tarea.getNombre())) {
                                tarea.setEstadotarea(estado.COMPLETADA);
                                encontrado = true;
                            }
                        }
                        if (encontrado) {
                            System.out.println("La tarea a sido asignada como completada");
                        } else {
                            System.out.println("La tarea ingreasda no esta en la lista");
                        }
                    }
                }
                case 4 -> {
                    boolean encontrado = false;
                    Tarea eliminar = null;
                    System.out.println("Todas las tareas de la lista");
                    for (Tarea tarea : tareas) {
                                    System.out.println(tarea);
                                }
                    System.out.println("Ingrese el nombre de la tarea que desea eliminar");
                    String nombre = sc.nextLine();
                    if (nombre.isEmpty()) {
                        System.out.println("No ingreso ningun nombre");
                    } else {
                        for (Tarea tarea : tareas) {
                            if (nombre.equalsIgnoreCase(tarea.getNombre())) {
                                eliminar = tarea;
                                encontrado = true;
                            }
                        }
                        if (encontrado) {
                            tareas.remove(eliminar);
                            System.out.println("La tarea a sido eliminada con exito");
                        } else {
                            System.out.println("La tarea ingreasda no esta en la lista");
                        }
                    }
                }
                case 5 -> {
                    int completa = 0;
                    int pendiente = 0;
                    for (Tarea tarea : tareas) {
                        if (tarea.getEstadotarea().equals(estado.COMPLETADA)) {
                            completa++;
                        } else {
                            pendiente++;
                        }
                    }
                    System.out.println("La cantidad de tareas son: " + tareas.size());
                    System.out.println("La canitdad de tareas completadas son: " + completa);
                    System.out.println("La cantidad de tareas pendientes son: " + pendiente);
                }
                case 6 -> {
                    boolean encontrado = false;
                    System.out.println("Todas las tareas de la lista");
                    for (Tarea tarea : tareas) {
                                    System.out.println(tarea);
                                }
                    System.out.println("Ingrese el nombre de la tarea que desea editar");
                    String nombre = sc.nextLine();
                    if (nombre.isEmpty()) {
                        System.out.println("No ingreso ningun nombre");
                    } else {
                        for (Tarea tarea : tareas) {
                            if (nombre.equalsIgnoreCase(tarea.getNombre())) {
                                System.out.println("Ingrese el nuevo nombre");
                                String nom = sc.nextLine();
                                tarea.setNombre(nom);
                                System.out.println("Ingrese el nuevo estado");
                                System.out.println("""
                                           1. Pendiente
                                           2. Completada
                                           """);
                                int est = sc.nextInt();
                                switch (est) {
                                    case 1:
                                        tarea.setEstadotarea(estado.PENDIENTE);
                                        break;
                                    case 2:
                                        tarea.setEstadotarea(estado.COMPLETADA);
                                        break;
                                    default:
                                        System.out.println("El valor que ingreso no es valido");
                                        break;
                                }
                                encontrado = true;
                            }
                        }
                        if (encontrado) {
                            System.out.println("La tarea a sido editada con exito");
                        } else {
                            System.out.println("La tarea ingreasda no esta en la lista");
                        }
                    }
                }
                case 7 -> {
                    fin1 = true;
                }
            }

        } while (!fin1);

    }

    public static void main(String args[]) {
        ListaTareas inicio = new ListaTareas();
        inicio.Iniciar();
    }
}
