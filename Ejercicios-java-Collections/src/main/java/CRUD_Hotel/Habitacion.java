/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

/**
 *
 * @author dairo
 */
public abstract class Habitacion {
    private int numero;
    private estado dispoible;
    private Cliente cliente;
    public Habitacion(int numero, estado dispoible) {
        this.numero = numero;
        this.dispoible = dispoible;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public enum estado{
        Disponible,
        NoDispobible
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public estado getDispoible() {
        return dispoible;
    }

    public void setDispoible(estado dispoible) {
        this.dispoible = dispoible;
    }
    
    public abstract double calcularcosto(int noches);

    @Override
    public String toString() {
        return   " Numero = " + numero + ""
                + " Estado = " + dispoible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.numero;
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
        final Habitacion other = (Habitacion) obj;
        return this.numero == other.numero;
    }
    
    
    
}
