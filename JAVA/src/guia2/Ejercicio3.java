/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ejercicio3 {
       public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase");
        String frase = leer.next();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    
}
    
    
}
