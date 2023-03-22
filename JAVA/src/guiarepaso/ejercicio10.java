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
public class ejercicio10 {
        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese 4 numeros entre el 1 y el 20");
        Scanner leer = new Scanner (System.in);
        int num1= leer.nextInt(); 
        for (int i = 0; i < num1 ; i++) {
            System.out.print("*");}
        System.out.println();
        
        int num2= leer.nextInt();
        for (int i = 0; i < num2 ; i++) {
            System.out.print("*");}
        System.out.println();
        
        int num3= leer.nextInt();
        for (int i = 0; i < num3 ; i++) {
            System.out.print("*");}
        System.out.println();
        
        int num4= leer.nextInt();
        for (int i = 0; i < num4 ; i++) {
            System.out.print("*");}
        System.out.println();
    }
    
}

//public static void main(String[] args){
    int num;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entre 1 y 20");
        for(int i=0;i<4;i++){
            do{
            num = leer.nextInt();
            }while(num<1 || num>20);
              System.out.print(num);
              for(int a=0;a<num;a++){
              System.out.print("*");
              }
              System.out.println("");
        }
    
}
