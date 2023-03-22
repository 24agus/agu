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
public class ejercicio7 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("ingrese una opcion");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("la bomsa es una bomba de agua");
                break;
            case 2:
                System.out.println("la bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("la bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("la bomba es una bomba de pasta alimenticia");
            default:
                System.out.println("no existe ningun valor valido para la bomba");
                   
        }
        
    }
    
}
    
}
