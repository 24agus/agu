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
public class Ejercicio6 {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
          System.out.println("ingrese un numero");
          int num1=leer.nextInt();
          
          System.out.println("ingrese otro numero");
          int num2=leer.nextInt();
        
          int resultado;
        
        System.out.println("ingrese una opcion");
        
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                resultado=num1+num2;
                System.out.println("la suma es " + resultado);
                break;
            case 2:
                resultado=num1-num2;
                System.out.println("la resta es " + resultado);
                break;
            case 3:
                resultado=num1*num2;
                System.out.println("la multi es " + resultado);
                break;
            case 4:
                resultado=num1/num2;
                System.out.println("la division es " + resultado);
            case 5:
             
                System.out.println("salir");
            default:
                System.out.println("salir");
                   
    
}
}
}
