/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje1;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje1 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para su suma");
        double num1= leer.nextDouble();
        System.out.println("ingrese otro numero para su suma");
        double num2= leer.nextDouble();
        double resultado;
        resultado = num1 + num2;
        System.out.println("el resultado de la suma es = "+resultado);
        
        
    }
    
}
