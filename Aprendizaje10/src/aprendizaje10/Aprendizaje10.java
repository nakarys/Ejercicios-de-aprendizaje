/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje10;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje10 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numLimite = 0;
        int num = 0;
        numLimite = entrada.nextInt();
        do {
            System.out.println("Ingrese un número: ");
            num = num + entrada.nextInt();
        }while(num < numLimite);
    }
    
}
