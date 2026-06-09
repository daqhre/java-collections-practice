/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Hotel;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class MenuAdministrador {
    private int clave = 1038094679;
    private Cliente cliente;
     private Habitacion habita;

    public int getClave() {
        return clave;
    }
     
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabita() {
        return habita;
    }

    public void setHabita(Habitacion habita) {
        this.habita = habita;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        LogicaHotel logica = new LogicaHotel();
        ValidacionLogica validar = new ValidacionLogica(logica);
        try {
            boolean salir = false;
            do {
                System.out.println("Bienvenido administrador");
                System.out.println("""
                           ¿Que desea hacer?
                           1. Opciones de clientes
                           2. Opciones de habitacion
                           3. Opcions de reservas
                           4. salir
                           """);
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1 -> {
                        boolean salir2 = false;
                        while (!salir2) {
                            System.out.println("""
                           ¿Que desea hacer?
                           1. Agregar cliente
                           2. Buscar cliente
                           3. Eliminar cliente
                           4. Mostrar clientes
                           5. salir
                           """);
                            int opcion2 = sc.nextInt();
                            sc.nextLine();
                            switch (opcion2) {
                                case 1 -> {
                                    System.out.println("Ingrese el numero de la Identificacion del usuario");
                                    String id = sc.nextLine();
                                    System.out.println("Ingrese el nombre del usuario");
                                    String nombre = sc.nextLine();
                                    System.out.println("Ingrese el numero telefonico del usuario");
                                    String numero = sc.nextLine();
                                    validar.validarAgregarcliente(numero, nombre, numero);
                                }
                                case 2 -> {
                                    System.out.println("Ingrese la Identificacion del usuario que desea buscar");
                                    String id = sc.nextLine();
                                    validar.validarBuscarcliente(id);
                                }
                                case 3 -> {
                                    System.out.println("Ingrese la Identificacion del usuario que desea eliminar");
                                    String id = sc.nextLine();
                                    validar.validarEliminarcliente(id);
                                }
                                case 4 -> {
                                    logica.mostrarClientes();
                                }
                                case 5 -> {
                                    salir2 = true;
                                }
                                default -> {
                                    System.out.println("La opcion que ingreso no es valida");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        boolean salir2 = false;
                        while (!salir2) {
                            System.out.println("""
                           ¿Que desea hacer?
                           1. Agregar habitacion
                           2. Buscar habitacion
                           3. Eliminar habitacion
                           4. Mostrar habitaciones
                           5. Cambiar el estado de una habitacion
                           6. salir
                           """);
                            int opcion2 = sc.nextInt();
                            sc.nextLine();
                            switch (opcion2) {
                                case 1 -> {
                                    System.out.println("Ingrese el numero de la habitacion");
                                    String numero = sc.nextLine();
                                    System.out.println("Ingrese el tipo de la habitacion "
                                            + "1. Simple"
                                            + "2. Doble"
                                            + "3. Suite");
                                    String tipo = sc.nextLine();
                                    validar.validarAgregarhabitacion(numero, tipo);
                                }
                                case 2 -> {
                                    System.out.println("Ingrese el numero de la habitacion que desea buscar");
                                    String numero = sc.nextLine();
                                    validar.validarBuscarhabitacion(numero);
                                }
                                case 3 -> {
                                    System.out.println("Ingrese el numero de la habitacion que desea eliminar");
                                    String numero = sc.nextLine();
                                    validar.validarEliminarhabitacion(numero);
                                }
                                case 4 -> {
                                    System.out.println("""
                                             ¿Que desea hacer?
                                             1. Mostrar habitaciones disponibles
                                             2. Mostrar habitaciones no disponibles
                                             3. Mostrar todas
                                             4. Mostrar habitaciones disponibles de un solo tipo
                                             """);
                                    String opcion3 = sc.nextLine();
                                    int op = Integer.parseInt(opcion3);
                                    if (op == 4) {
                                        System.out.println("""
                                                 ¿Que tipo desea ver?
                                                 1. Simple
                                                 2. Doble
                                                 3. Suite
                                                 4. Todas
                                                 """);
                                        String opcion4 = sc.nextLine();
                                        validar.validarmostrarHabitacionesdisponibles(opcion4);
                                    } else {
                                        validar.validarMostrarhabitaciones(opcion3);
                                    }
                                }
                                case 5 -> {
                                    System.out.println("Habitaciones no disponibles");
                                    validar.validarMostrarhabitaciones("2");
                                    System.out.println("Ingrese el numero de la habitacion que desea buscar");
                                    String numero = sc.nextLine();
                                    int num = sc.nextInt();
                                    validar.validarBuscarhabitacion(numero);
                                    Habitacion habitas = logica.buscarHabitacion(num);
                                    System.out.println("La habitacion esta ocupada por ");
                                    System.out.println(habitas.getCliente());
                                    System.out.println("""
                                             ¿Que desea hacer?
                                             1. Cambiar a disponible
                                             2. Cambiar a no disponible
                                             """);
                                    int op4 = sc.nextInt();
                                    switch (op4) {
                                        case 1 -> {
                                            habitas.setDispoible(Habitacion.estado.Disponible);
                                            System.out.println("Cambio a disponible hecho con exito");
                                        }
                                        case 2 -> {
                                            habitas.setDispoible(Habitacion.estado.NoDispobible);
                                            System.out.println("Cambio a no disponible hecho con exito");
                                        }
                                        default -> {System.out.println("La opcion que eligio no es valida");}
                                    }
                                }
                                case 6 -> {
                                    salir2 = true;
                                }
                                default -> {
                                    System.out.println("La opcion que ingreso no es valida");
                                }
                            }
                        }
                    }
                    case 3 -> {

                        System.out.println("¿Que desea hacer?");
                        System.out.println("""
                           1. Mostrar Reservas
                           2. Hacer una reserva
                           3. Cancelar una reserva
                           4. Mostrar reservas de un usuario reservas
                           5. salir
                           """);
                        String op = sc.nextLine();
                        int opci = Integer.parseInt(op);
                        switch (opci) {
                            case 1 -> {
                                logica.mostrarReservas();
                            }
                            case 2 -> {
                                System.out.println("""
                                   ¿Que tipo de habitaciones desea elegir?
                                   1. Habitaciones simples
                                   2. Habitaciones dobles
                                   3. Suite
                                   4. Todas
                                   """);
                                String habi = sc.nextLine();
                                System.out.println("Habitaciones Disponibles:");
                                validar.validarBuscarhabitacion(habi);
                                boolean no = false;
                                while (!no) {
                                    System.out.println("Ingrese el numero de identificacion del Cliente");
                                            int numeros = sc.nextInt();
                                            setCliente(logica.buscarCliente(numeros));
                                            
                                    System.out.println("Ingrese el numero de la habitacion que desea reservar");
                                    String numero = sc.nextLine();
                                    validar.validarBuscarhabitacion(numero);
                                    int abi = Integer.parseInt(numero);
                                    System.out.println("""
                                       ¿Seguro que desea reservar esa habitacion?
                                       1. Si
                                       2. No
                                       3. Salir al menu principal
                                       """);
                                    String opc = sc.nextLine();
                                    int opcio = Integer.parseInt(opc);
                                    switch (opcio) {
                                        case 1 -> {
                                            setHabita(logica.buscarHabitacion(abi));
                                            System.out.println("Ingrese las noches que desea alquilar");
                                            int noches = sc.nextInt();
                                            sc.nextLine();
                                            habita.setCliente(getCliente());
                                            habita.setDispoible(Habitacion.estado.NoDispobible);
                                            System.out.println("El costo por esa cantidad de noches es " + habita.calcularcosto(noches) + "USD");
                                            Reservas reserva = new Reservas(getCliente(), getHabita(), noches);
                                            logica.agregarReserva(reserva);
                                            no = true;
                                        }
                                        case 2 -> {
                                        }
                                        case 3 -> {
                                            no = true;
                                        }
                                        default -> {
                                            System.out.println("La opcion que eligio no es valida");
                                        }
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("Ingrese el numero de identificacion del Cliente");
                                            int numeros = sc.nextInt();
                                            setCliente(logica.buscarCliente(numeros));
                                logica.mostrarReservas(getCliente());
                                System.out.println("Ingrese el numero de la habitacion para eliminar la reserva");
                                String numero = sc.nextLine();
                                int abi = Integer.parseInt(numero);
                                setHabita(logica.buscarHabitacion(abi));
                                getHabita().setDispoible(Habitacion.estado.Disponible);
                                Reservas reserva = new Reservas(getCliente(), getHabita(), 1);
                                logica.eliminarReserva(reserva);
                            }
                            case 4 -> {
                                System.out.println("Ingrese el numero de identificacion del Cliente");
                                            int numeros = sc.nextInt();
                                            setCliente(logica.buscarCliente(numeros));
                                logica.mostrarReservas(getCliente());
                            }
                            case 5 -> {
                                System.out.println("Gracias por participar");
                                salir = true;
                            }
                            default -> {
                                System.out.println("La opcion que eligio no es valida");
                            }
                        }
                    }
                }
            } while (!salir);
        } catch (NumberFormatException e) {
            System.out.println("Error en iniciar administrador " + e);
        }
    }
}
