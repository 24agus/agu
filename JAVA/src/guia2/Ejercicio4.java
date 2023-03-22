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
public class Ejercicio4 {
        
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la temperatura en Centigrados");
        int celcius = leer.nextInt();
        int fahrenheit = 32+(9*celcius/5);
        
        System.out.println("la temperatura en fahrenheit es " + fahrenheit);
    
}
    
}
