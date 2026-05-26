/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dairo
 */
public class LogicaEmpleados {
    ArrayList<Empleado> listaempleados = new ArrayList<>();
    
    public void agregarEmpleado(EmpleadoDesarrollador empleado){
        if(listaempleados.contains(empleado)){
            System.out.println("El empleado que desea registrar, ya esta registrado");
        } else {
        listaempleados.add(empleado);
            System.out.println("Empleado registrado con exito");
        }
    }
    public void agregarEmpleado(EmpleadoDiseñador empleado){
        if(listaempleados.contains(empleado)){
            System.out.println("El empleado que desea registrar, ya esta registrado");
        } else {
        listaempleados.add(empleado);
        System.out.println("Empleado registrado con exito");
        }
    }
    
    public void mostrarEmpleados(){
        for (Empleado listaempleado : listaempleados) {
            System.out.println(listaempleado);
        }
    }
    
    public void buscarEmpleado(int id){
        for (Empleado listaempleado : listaempleados) {
            if(listaempleado.getId() == id){
                System.out.println(listaempleado);
            } else {System.out.println("El empleado no esta registrado");}
        }
    }
    public void eliminarEmpleado(int id){
    Iterator<Empleado> it = listaempleados.iterator();
    while(it.hasNext()){
        Empleado em = it.next();
    if(em.getId() == id){
       it.remove();
        System.out.println("Empleado eliminados con exito");
      }
     }
    }
    public void mostrarOrdennombre(){
        listaempleados.sort(new OrdenNombre());
        mostrarEmpleados();
    }
    public void mostrarOrdensalario(){
        listaempleados.sort(new OrdenSalario());
        mostrarEmpleados();
    }
    
}
