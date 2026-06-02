/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

/**
 *
 * @author dairo
 */
public class ValidarMenu {
    LogicaMenu logica = new LogicaMenu();
    ValidarMenu(LogicaMenu logica) {
        this.logica = logica;
    }
    public boolean datoVacio(String dato){
    return dato.isEmpty();
  }
   //mensaje para cuando un dato este vacio
  public String mesanjes(){
      String men = """
                   El dato que ingreso no son validos 
                   Por favor ingresar datos validos""";
      return men;
  }
    public void validarAgregar(String opcion, String placa, String marca, String modelo, String opcional){
        try {
        if(datoVacio(placa) || datoVacio(marca) || datoVacio(modelo) || datoVacio(opcional) || datoVacio(opcion)){
            System.out.println(mesanjes());
        } else {
            int op = Integer.parseInt(opcion);
            int pla = Integer.parseInt(opcional);
            
            switch (op) {
                case 1:
                     Vehiculo vehiculoC = new Carro(placa, marca, modelo, pla);
            logica.agregar(vehiculoC);
                    break;
                case 2: 
                     Vehiculo vehiculoM = new Moto(placa, marca, modelo, pla);
            logica.agregar(vehiculoM);
                case 3:
                    Vehiculo vehiculoP = new Camion(placa, marca, modelo, pla);
            logica.agregar(vehiculoP);
                default:
                    System.out.println("La opcion que eligio no es valida");
            }
           }
        } catch(Exception e){System.out.println("Error:" + e);}
    
    }
    public void validarEliminar(String placa){
        
        try {
            if(datoVacio(placa)){
            mesanjes();
            }else {
                
            logica.eliminar(placa);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
    public void validarBuscar(String placa){
        
        try {
            if(datoVacio(placa)){
            mesanjes();
            }else {
            logica.buscar(placa);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
    public void validarMostrar(String id){
        
        try {
            if(datoVacio(id)){
            mesanjes();
            }else {
                int iden = Integer.parseInt(id);
            logica.mostrar(iden);
            }
        } catch(Exception e){System.out.println("Error:" + e);}
    }
    
    public void validarseguroymantenimiento(String placa){
        try{
        if(datoVacio(placa)){
            mesanjes();
        } else {logica.seguroYmantenimiento(placa);}
        } catch(Exception e){System.out.println("Error: " + e);}
    }
}
