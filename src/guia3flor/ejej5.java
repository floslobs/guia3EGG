/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3flor;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class ejej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, 
        y a continuación solicite números al usuario hasta que la suma de los 
        números introducidos supere el límite inicial.*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese valor limite");
        int lim = sc.nextInt();
        int sum = 0;

        do {
            System.out.println("ingrese numeros");
            int num = sc.nextInt();
            sum = sum + num;
        } while (sum < lim);
        
        if (sum <= lim) {
            System.out.println("la suma es : "+sum);
            
        }else{
            System.out.println("supero el limite");
        }

    }
    
}
