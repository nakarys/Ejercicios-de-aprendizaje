/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje4;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje4 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los °C que desea transformar en F: ");
        double numero = leer.nextDouble();
        double F = 32+(9*numero/5);
        System.out.println(F+"F");
    }
    
}
