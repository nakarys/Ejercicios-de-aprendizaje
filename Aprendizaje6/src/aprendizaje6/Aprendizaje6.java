/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje6;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje6 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        double numero = leer.nextDouble();
        if (numero%2 == 0) {
            System.out.println("el numero: "+numero+" es par");}
            else 
            System.out.println("el numero: "+numero+" es impar");
            
                }
    }
    

