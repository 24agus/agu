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
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero con el que desea trabajar");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero con el que desea trabajar");
        int num2 = leer.nextInt();
        int eleccion = 0; //lo tuve que definir afuera del bucle sino me daba error
        do{
        System.out.println("--ELIJA UNA OPCION");
        System.out.println("---MENU---");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        eleccion = leer.nextInt();
        
        switch (eleccion){
            
            case 1:
                System.out.println("El resultado de la suma de los numeros ingresados es " + (num1+num2));
                break;
            case 2:
                System.out.println("El resultado de la resta de los numeros ingresados es " + (num1-num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion de los numeros ingresados es " + (num1*num2));
                break;
            case 4:
                System.out.println("El resultado de la division de los numeros ingresados es " + (num1/num2));
                break;
            case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = leer.next();
                    
                    if ("s".equals(confirmacion) || "S".equals(confirmacion)){
                        System.out.println("Saliendo del programa...");
                    } else {
                        eleccion = 0;
                    }
                    break;
            default: 
                   System.out.println("Opción inválida. Por favor, elija una opción del 1 al 5.");
                    break;
        }
        } while (eleccion != 5);
        
    }
}



