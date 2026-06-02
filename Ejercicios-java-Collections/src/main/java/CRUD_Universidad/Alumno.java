/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Universidad;

/**
 *
 * @author dairo
 */
public class Alumno extends Persona implements Presentacion{
    
    private String carrera;
    private double semestre;

    public Alumno(int id, String nombre, String carrera, double semestre) {
        super(id, nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    

    @Override
    public void mostrarRol() {
        System.out.print("Soy estudiante");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return  super.toString()
                + " carrera = " + carrera + ""
                + " semestre = " + semestre + '}';
    }

    @Override
    public void mensajeUniversitario(String mensaje) {
        mostrarRol();
        System.out.println(" de la " + mensaje);
    }
    
}
