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
public class Ejercicio5 {
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     int valorlimite;
     int suma = 0;
     do { System.out.println("ingrese un limite");
        valorlimite = leer.nextInt();
     }while (valorlimite < 0);
     
     do { System.out.println("ingrese un numero");
     suma = suma + leer.nextInt();
     
     
     } while (suma <= valorlimite);
        System.out.println("la suma total es" +suma+ "y a superado al numero" +valorlimite);
        
    }
      
}   
    

