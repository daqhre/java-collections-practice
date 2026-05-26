/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class MenuEmpleados {
    LogicaEmpleados logica = new LogicaEmpleados();
    ValidarEmpleados validar = new ValidarEmpleados(logica);
Scanner sc = new Scanner(System.in);
    public void iniciar(){
        try {
        boolean salir = false;
        do{
            System.out.println("""
                               ¿Que desea hacer?
                               1. Agregar un empleado
                               2. Mostrar empleados
                               3. Buscar empleado
                               4. Eliminar
                               5. Salir
                               """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println("Que desea hacer?");
                    System.out.println("""
                                       1. Agregar Desarrollador
                                       2. Agregar Diseñador
                                       """);
                    int op = sc.nextInt();
                    sc.nextLine();
                    if(op == 1){
                        System.out.println("Ingrese el numero de identificacion del empleado");
                    String codiid = sc.nextLine();
                    System.out.println("Ingrese el nombre del empleado");
                    String nom = sc.nextLine();
                    System.out.println("Ingrese el lenguaje de programacion");
                    String len = sc.nextLine();
                    System.out.println("Ingrese la cantidad de proyectos que va realizar");
                    String pro = sc.nextLine();
                    validar.validacionAgregardesarrollador(codiid, nom, len, pro);
                    System.out.println("Por ser un empleado diseñador obtiene un salario base de 1200");
                    } else if(op == 2){
                        System.out.println("Ingrese el numero de identificacion del empleado");
                    String codiid = sc.nextLine();
                    System.out.println("Ingrese el nombre del empleado");
                    String nom = sc.nextLine();
                    System.out.println("Ingrese su herramienta de diseño");
                    String dise = sc.nextLine();
                    System.out.println("Ingrese la cantidad de horas extra que va realizar");
                    String hora = sc.nextLine();
                    validar.validarAgregardiseñador(codiid, nom, dise, hora);
                        System.out.println("Por ser un empleado diseñador obtiene un salario base de 1100");
                    } else {
                        System.out.println("La opcion que eligio no es valida");
                    }
                    
                }
                case 2 -> {
                    logica.mostrarEmpleados();
                    boolean sa1 = false;
                    while(!sa1){
                        System.out.println("""
                                           ¿Que desea hacer?
                                           1. Mostrar ordenado por nombre
                                           2. Mostrar ordenado por salario
                                           3. Salir
                                           """);
                        int op1 = sc.nextInt();
                        sc.nextLine();
                        switch (op1) {
                            case 1: 
                                logica.mostrarOrdennombre();
                                break;
                            case 2: 
                                logica.mostrarOrdensalario();
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
                    System.out.println("Ingrese el numero de identificacion del empleado");
                    String iden = sc.nextLine();
                    validar.ValidacionBuscar(iden);
                }
                case 4 -> {
                    System.out.println("Ingrese el numero de identificacion del empleado");
                    String iden = sc.nextLine();
                    validar.ValidacionEliminar(iden);
                }
                case 5 -> {
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
