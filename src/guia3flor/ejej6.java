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
public class ejej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que pida dos números enteros positivos por teclado 
        y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
        y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
        si el usuario selecciona la opción 5, en vez de salir del programa directamente, se 
        debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
        programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
        contrario se vuelve a mostrar el menú.
        
        suma: restar, sumar, multiplicar, dividir, salir . elija opcion

*/

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese primer numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese segundo numero");
        int num2 = sc.nextInt();
        String conf = "";
        float sum = num1 + num2, res = num1 - num2, mult = num1 * num2, div = num1 / num2;

        do {
            System.out.println("MENU");
            System.out.println("1-suma");
            System.out.println("2-resta");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("5-salir");
            System.out.println("elija opcion");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("la suma es: " + sum);
                    break;
                case 2:
                    System.out.println("la resta es: " + res);
                    break;
                case 3:
                    System.out.println("la multiplicacion es: " + mult);
                    break;
                case 4:
                    System.out.println("la divicion es: " + div);
                    break;
                case 5:
                    System.out.println("desea salir S/N ?");
                    conf = sc.next();
                    break;

            }

        } while (!conf.equals("S"));

    }

}
