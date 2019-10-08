/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nota: 1 euro equivale a 1,09541 dolares para la inserción
        //de la variable cambio.
        Scanner sc= new Scanner(System.in);
        System.out.print("Teclea euros: ");
        double euros = sc.nextDouble();
        System.out.print("Teclea cambio: ");
        double cambio = sc.nextDouble();
        System.out.println("dolares= "+(euros*cambio));
    }
    
}
