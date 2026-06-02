/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Universidad;

/**
 *
 * @author dairo
 */
public class Profesor extends Persona implements Presentacion{
    private String materia;
    private double salario = 200;

    public Profesor(int id, String nombre, String materia) {
        super(id, nombre);
        this.materia = materia;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy profesor ");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return    super.toString()
                + "materia=" + materia + '}';
    }

    @Override
    public void mensajeUniversitario(String mensaje) {
        mostrarRol();
        System.out.println("de la " + mensaje);
    }
    
    
}
