/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarepaso;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ejercicio8 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
        System.out.println("Ingrese una nota correcta");
         nota = leer.nextInt();}
         
        
         
         
        
      
        }
         
      
     }
    
    

