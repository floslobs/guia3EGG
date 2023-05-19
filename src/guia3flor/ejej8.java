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
public class ejej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el tamaño de su cuadrado ");

        int tam = sc.nextInt();

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || j == 0 || j == tam - 1 || i == tam - 1) {
                    System.out.println(" *");

                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
    }

}
