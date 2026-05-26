/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

/**
 *
 * @author dairo
 */
public class EmpleadoDiseñador extends Empleado {
    private String herramienta;
    private double horasExtra;
    private double pagoHoras = 5;

    public EmpleadoDiseñador(  int id, String nombre, String herramienta, double horasExtra, double salario) {
        super(id, nombre, salario);
        this.herramienta = herramienta;
        this.horasExtra = horasExtra;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }
    
    
    @Override
    public double calcularsalario() {
        double dinero = getSalario() + (getHorasExtra() * getPagoHoras());
        return dinero;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + "herramienta=" + herramienta + ""
                + " horasExtra=" + horasExtra + '}';
    }
    
}
