/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

import java.util.Objects;

/**
 *
 * @author dairo
 */
public class Reservas {
    Cliente cliente;
    Habitacion habitacion;
    int noches;

    public Reservas(Cliente cliente, Habitacion habitacion, int noches) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.noches = noches;
    }

    @Override
    public String toString() {
        return "Reserva: " + ""
                + "cliente = " + cliente + ""
                + " habitacion = " + habitacion + ""
                + " noches = " + noches;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.habitacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservas other = (Reservas) obj;
        return Objects.equals(this.habitacion, other.habitacion);
    }
    
    
}
