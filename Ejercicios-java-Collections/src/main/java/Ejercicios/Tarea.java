/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author dairo
 */
public class Tarea {
    private  String nombre;
    private  estado estadotarea;
    public enum estado{
    PENDIENTE,
    COMPLETADA
    }

    public Tarea(String nombre, estado estadotarea) {
        this.nombre = nombre;
        this.estadotarea = estadotarea;
    }

    public String getNombre() {
        return nombre;
    }

    public estado getEstadotarea() {
        return estadotarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadotarea(estado estadotarea) {
        this.estadotarea = estadotarea;
    }
    

    @Override
    public String toString() {
        return "Tarea{" + "Nombre = " + nombre + ","
                + " Estado de la tarea = " + estadotarea + '}';
    }
    

    
    
}
