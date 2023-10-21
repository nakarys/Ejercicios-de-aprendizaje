/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje9;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje9 {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
      String palabra = null;
   System.out.println("Ingrese una palabra: ");
        do {
            
        palabra = leer.nextLine();
        if ("a".equals(palabra.substring(0, 1).toLowerCase())){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Intenta nuevamente");
        }
                      
        } while (!"a".equals(palabra.substring(0, 1).toLowerCase()));
    }
}

