/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class asd {
        public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner (System.in);
        int num;
        int cont = 0;        
        do {
            System.out.println("Ingrese un numero");
        
        num = leer.nextInt();
        cont = cont+1;
        suma = suma + num;
        if (cont == 20) {
            
            System.out.println("No se detecto el numero 0");
            break;
        }
        } while (num != 0);
        System.out.println("Se capturo el numero 0");
         }
    
}
