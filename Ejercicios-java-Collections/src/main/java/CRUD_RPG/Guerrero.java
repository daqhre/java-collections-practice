/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

/**
 *
 * @author dairo
 */
public class Guerrero extends Personaje {
    private int defensaespecial = 580;

    public int getDefensaespecial() {
        return defensaespecial;
    }
    
    public Guerrero(String nombre, double vida, double nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
    }
    @Override
    public String habilidadEspecial() {
        return "Escudo Protector";
    }

    @Override
    public String toString() {
        return super.toString() + ""
                + "Habilidad Especial = " + habilidadEspecial() + '}';
    }
    
}
