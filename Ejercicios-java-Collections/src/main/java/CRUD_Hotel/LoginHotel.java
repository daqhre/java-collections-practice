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
public class LoginHotel {
    Scanner sc = new Scanner(System.in);
    MenuAdministrador menu1 = new MenuAdministrador();
    MenuUsuario menu2 = new MenuUsuario();
    public void login(){
        System.out.println("Ingrese su numero de identificacion");
        String numero = sc.nextLine();
        int num = Integer.parseInt(numero);
        if(num == menu1.getClave()){
            menu1.iniciar();
        } else{ 
            if(menu2.logica.buscarCliente(num) == null){
            System.out.println("No esta registrado");
            System.out.println("Por favor registrese");
            menu2.registrarUsuario();
           } else {
            menu2.iniciarUsuario();
         }
     }
    }
}
