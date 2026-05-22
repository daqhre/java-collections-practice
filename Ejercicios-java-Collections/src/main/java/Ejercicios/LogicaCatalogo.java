/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class LogicaCatalogo {

    HashSet<Pelicula> listapeliculas = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void AgregarPelicula(Pelicula pelicula) {
        boolean agregado = listapeliculas.add(pelicula);

        if (agregado) {
            System.out.println("Pelicula agregada");
        } else {
            System.out.println("La pelicula ya existe");
        }
    }

    public void MostrarPeliculas() {
        if (listapeliculas.isEmpty()) {
            System.out.println("No hay peliculas registradas");
        } else {
            Iterator<Pelicula> it = listapeliculas.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void EliminarPelicula(Pelicula pelicula) {
        Iterator<Pelicula> it = listapeliculas.iterator();
        while (it.hasNext()) {
            Pelicula peli = it.next();
            if (peli.equals(pelicula)) {
                it.remove();
            }
        }
    }

    public void BuscarPelicula(String pelicula) {

        for (Pelicula listapelicula : listapeliculas) {
            if (listapelicula.getTitulo().equalsIgnoreCase(pelicula)) {
                System.out.println(listapelicula);
            }
        }
    }

    public void MostrarCantidad() {
        System.out.println("La cantidad de peliculas registradas son: " + listapeliculas.size());
    }

    public void iniciar() {
        boolean salir = false;
        do {

            System.out.println("""
                         ¿Que desea hacer?
                           1. Agregar Pelicula
                           2. Mostrar Peliculas
                           3. Eliminar Pelicula
                           4. Buscar Peliculas
                           5. Mostrar cantidad de peliculas
                           6. Salir
                           """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el titulo de la pelicula:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el nombre del director:");
                    String director = sc.nextLine();
                    System.out.println("Ingrese el año de estreno de la pelicula");
                    String año = sc.nextLine();
                    int años = Integer.parseInt(año);
                    if (titulo.isEmpty() || director.isEmpty() || año.isEmpty()) {
                        System.out.println("No ingreso el Nombre, el Numero telefonico o el correo electronico");
                        System.out.println("POR FAVOR INTENTELO OTRA VEZ");
                    } else {
                        Pelicula pelic = new Pelicula(titulo, director, años);
                        AgregarPelicula(pelic);
                    }
                }
                case 2 -> {
                    MostrarPeliculas();
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del juego");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese la plataforma del juego");
                    String director = sc.nextLine();
                    if (titulo.isEmpty() || director.isEmpty()) {
                        System.out.println("No ingreso ningun nombre o ninguna plataforma");
                    } else {
                        Pelicula pelic = new Pelicula(titulo, director, 0);
                        EliminarPelicula(pelic);
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el titulo de la pelicula");
                    String pel = sc.nextLine();
                    if (pel.isEmpty()) {
                        System.out.println("No ingreso ningun titulo");
                    } else {
                        System.out.println("Las peliculas con el titulo " + pel + " son:");
                        BuscarPelicula(pel);
                    }
                }
                case 5 -> {
                    MostrarCantidad();
                }
                case 6 -> {
                    salir = true;
                }
                default -> {
                    System.out.println("La opcion que ingreso no es valida");
                }
            }
        } while (!salir);
        sc.close();
    }
}
