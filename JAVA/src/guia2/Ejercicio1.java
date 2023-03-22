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
public class Ejercicio1 {
         public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");               
        System.out.println("ingrese dos numeros");
                int num1 =leer.nextInt();
                int num2 = leer.nextInt();
                int suma =num1+num2;
                
                
                
                System.out.println(" la suma es " + suma);
        // TODO code application logic here
    }
    
    
}

    

