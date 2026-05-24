/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 *
 * @author dairo
 */
public class Libro implements Comparable<Libro> {

    private int isbn;
    private String titulo;
    private String autor;
    private int año;
    private estado disponible;

    public enum estado {
        Disponible,
        No_disponible
    }

    public Libro(int isbn, String titulo, String autor, int año, estado disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = disponible;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public estado getDisponible() {
        return disponible;
    }

    public void setDisponible(estado dispoble) {
        this.disponible = dispoble;
    }

    @Override
    public String toString() {
        return "Libro{" + ""
                + "isbn=" + isbn + " "
                + "titulo=" + titulo + ""
                + " autor=" + autor + ""
                + " a\u00f1o=" + año + ""
                + " dispoble=" + disponible + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.isbn;
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
        final Libro other = (Libro) obj;
        return this.isbn == other.isbn;
    }

    @Override
    public int compareTo(Libro libro) {
        return Integer.compare(this.año, libro.año);
    }
    
}
