/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

/**
 *
 * @author dairo
 */
public class Arquero extends Personaje {

    public Arquero(String nombre, double vida, double nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
    }
    
    @Override
    public String habilidadEspecial() {
        return "Golpe certero";
    }

    @Override
    public String toString() {
        return super.toString() + ""
                + " Habilida Especial = " + habilidadEspecial() + '}';
    }
    
}
