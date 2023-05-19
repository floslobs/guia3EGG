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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que dado un número determine si es par o impar.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese un numero");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero " + num + " es par");

        } else {
            System.out.println("el numero " + num + " es impar");
        }

    }

}
