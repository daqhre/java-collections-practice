/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author dairo
 */
public class LogicaMenu {
     ArrayList<Vehiculo> lista = new ArrayList<>();

     public void agregar(Vehiculo v){
         lista.add(v);
     }
     public void eliminar(String placa){
         Vehiculo eliminado = null;
         for (Vehiculo vehiculos : lista) {
             if(vehiculos.getPlaca().equals(placa)){
             eliminado = vehiculos;
             }
         }
         if(eliminado != null){
             lista.remove(eliminado);
         } else {System.out.println("No se pudo eliminar el vehiculo");}
     }
     public void buscar(String placa){
         boolean encontrado = false;
         for (Vehiculo vehiculos  : lista) {
             if(vehiculos.getPlaca().equals(placa)){
                 System.out.println(vehiculos);
                 encontrado = true;
             }
         }
         if(!encontrado){System.out.println("No hay vehiculo registrado con esa placa");}
     }
     public void mostrar(int op){
         for (Vehiculo v : lista) {
             switch (op) {
                 case 1:
                     System.out.println("Carros:");
                     if(v instanceof Carro){
                     System.out.println(v);
                     }
                     break;
                 case 2:
                     if(v instanceof Moto){
                         System.out.println("Motos:");
                     System.out.println(v);
                     }
                     break;
                 case 3:
                     System.out.println("camioines");
                     if(v instanceof Camion){
                         System.out.println(v);
                     }
                 case 4: 
                     System.out.println(v);
                     break;
                 case 5:
                     ordenMarca();
                     break;
                 case 6:
                     ordenMantenimiento();
                     break;
                 default:
                     System.out.println("La opcion que eligio no es valida");
             }
         }
     }
     public void ordenMarca(){
         lista.sort(new OrdenMarca());
         for (Vehiculo vehiculos  : lista) {
                 System.out.println(vehiculos);
         }
     }
     public void ordenMantenimiento(){
         lista.sort(new OrdenMantenimiento());
         for (Vehiculo vehiculos  : lista) {
                 System.out.println(vehiculos);
         }
     }
     public void seguro(Asegurable p){
         System.out.println("El seguro del vehiculo es " + p.calcularSeguro());
    }
     public void mantenimiento(Vehiculo v){
         System.out.println("El mantenimiento del vehiculo es " + v.cacularCostomantenimiento());
     }
    public void seguroYmantenimiento(String placa){
                for (Vehiculo vehiculo : lista) {
                    if(vehiculo.getPlaca().equals(placa)){
                        mantenimiento(vehiculo);
                    Asegurable pe = (Asegurable) vehiculo;
                    seguro(pe);
                    }
                }
    }
     
}
