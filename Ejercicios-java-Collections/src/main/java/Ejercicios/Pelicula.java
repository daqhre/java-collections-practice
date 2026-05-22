/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Objects;

/**
 *
 * @author dairo
 */
public class Pelicula {

    private String titulo;
    private String director;
    private int año;

    public Pelicula(String titulo, String director, int año) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", a\u00f1o=" + año + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), director.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pelicula other = (Pelicula) obj;

        return titulo.equalsIgnoreCase(other.titulo)
                && director.equalsIgnoreCase(other.director);
    }

}
