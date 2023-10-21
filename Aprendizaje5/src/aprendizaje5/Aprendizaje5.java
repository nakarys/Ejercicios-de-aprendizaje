/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje5;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje5 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        double numero = leer.nextDouble();
        System.out.println("El doble de: "+numero+" es: " + numero*2);
        System.out.println("El el triple de: "+numero+" es: " + numero*3);
        System.out.println("La raiz cuadrada de: "+numero+" es: " + Math.sqrt(numero));
      
    }
    
}
