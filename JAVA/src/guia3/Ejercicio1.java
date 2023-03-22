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
public class Ejercicio1 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
    
        if (num%2 == 0)
            System.out.println("el numero es par");
        else 
            System.out.println("el numero es impar");
    
    }
    
}
