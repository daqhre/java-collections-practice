/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_RPG;

/**
 *
 * @author dairo
 */
public class Mago extends Personaje {
    private int ataqueespecial = 860;

    public Mago(String nombre, double vida, double nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
    }

    public int getAtaqueespecial() {
        return ataqueespecial;
    }
    
            
    @Override
    public String habilidadEspecial() {
       return "Gran bola de fuego";
    }

    @Override
    public String toString() {
        return super.toString() + "" +
                "Habilidad Especial = " + habilidadEspecial() + '}';
    }
    
}
