/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ejercicio2 {
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("ingrese una palabra");
        palabra = leer.next();
     
        
        if (palabra.equals ("eureka")) {
            System.out.println("correcto");
        }
        
        else{
            System.out.println("incorrecto");
        }
    }
    
 }
    

