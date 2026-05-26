/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Empleados;

/**
 *
 * @author dairo
 */
public class ValidarEmpleados {
    LogicaEmpleados logica = new LogicaEmpleados();

    ValidarEmpleados(LogicaEmpleados logica) {
        this.logica = logica;
    }
        public void validacionAgregardesarrollador(String id, String nombre, String lenguaje,String proyectos){
    try {
        if(id.isEmpty() || nombre.isEmpty() || lenguaje.isEmpty() || proyectos.isEmpty()){
            System.out.println("Alguno de los datos que ingreso no es valido");
        } else {
        int identi = Integer.parseInt(id);
        double sal = 1200;
        double pro = Double.parseDouble(proyectos);
        if(identi < 0 || pro < 0){
            System.out.println("El id o la cantidad de proyectos no pueden ser menos a 0");
        } else {
        Empleado em = new EmpleadoDesarrollador(identi, nombre, lenguaje, sal, pro);
        logica.agregarEmpleado((EmpleadoDesarrollador) em);
          }
         }
        } catch (NumberFormatException e){
        System.out.println("hubo un error en validacion agreagar desarrollador");
        System.out.println(e);
   }
  }
        public void validarAgregardiseñador(String id, String nombre, String herramienta, String horas){
        try {
        if(id.isEmpty() || nombre.isEmpty() || herramienta.isEmpty() || horas.isEmpty()){
            System.out.println("Alguno de los datos que ingreso no es valido");
        } else {
        int identi = Integer.parseInt(id);
        double sal = 1100;
        double ho = Double.parseDouble(horas);
        if(identi < 0 || ho < 0){
            System.out.println("El id o la cantidad de proyectos no pueden ser menos a 0");
        } else {
        Empleado em = new EmpleadoDiseñador(identi, nombre, herramienta, ho, sal);
        logica.agregarEmpleado((EmpleadoDiseñador) em);
          }
         }
        } catch (NumberFormatException e){
        System.out.println("hubo un herror en validar agregar diseñador");
        System.out.println(e);
   }
        }
        public void ValidacionBuscar(String id){
            try {
        boolean valido = false;
        if(id.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int identi = Integer.parseInt(id);
          if(identi > 0){
              logica.buscarEmpleado(identi);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la busqueda del empleado");}
        } catch (NumberFormatException e){
        System.out.println("hubo un error en validacion buscar");
        System.out.println(e);
            }
    }
        public void ValidacionEliminar(String id){
            try {
    boolean valido = false;
        if(id.isEmpty()){
            System.out.println("El dato que ingreso no es valido");
            System.out.println("Por favor intentelo de nuevo");
        } else{
          int identi = Integer.parseInt(id);
          if(identi > 0){
              logica.eliminarEmpleado(identi);
              valido = true;
          } else {System.out.println("El codigo obligatoriamente debe ser mayor a 0");}
        }
        if(!valido){System.out.println("No se pudo realizar la eliminacion del empleado");}
        } catch (NumberFormatException e){
        System.out.println("hubi un error en validacion eliminar");
        System.out.println(e);
            }
    }
}
