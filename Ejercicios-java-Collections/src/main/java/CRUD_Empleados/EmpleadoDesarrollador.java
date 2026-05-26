/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

/**
 *
 * @author dairo
 */
public class EmpleadoDesarrollador extends Empleado{
    private String lenguaje;
    double proyectos = 0;
    private double bono = 100;

    public EmpleadoDesarrollador( int id, String nombre,String lenguaje, double salario, double proyectos) {
        super(id, nombre, salario);
        this.lenguaje = lenguaje;
        this.proyectos = proyectos;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    public double getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }
    
    public double getBono() {
        return bono;
    }
    
    
    
    @Override
    public double calcularsalario() {
        double dinero = getSalario() + (getBono() * getProyectos());
        return dinero;
    }

    @Override
    public String toString() {
         
        return super.toString() + ""
                + " lenguaje = " + lenguaje + ""
                + " proyectos = " + proyectos + '}';
    }
    
}
