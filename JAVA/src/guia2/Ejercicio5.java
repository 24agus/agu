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
public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        
        int doble = num*2;
        int triple =num*3;
        double raiz = Math.sqrt(num);
        
        System.out.println("su doble es " + doble);
        System.out.println( "su triple es " + triple);
        System.out.println("su raiz es " + raiz);
    
}
    
}
