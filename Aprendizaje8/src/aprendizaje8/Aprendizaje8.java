/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje8;

import java.util.Scanner;

/**
 *
 * @author Nakary
 */
public class Aprendizaje8 {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
      String palabra = null;
   System.out.println("Ingrese una palabra: ");
        do {
            
        palabra = leer.nextLine();
        if (palabra.length() == 8){
            System.out.println("Intenta nuevamente");
        }
        else{
            System.out.println("Correcto");
        }
                      
        } while (palabra.length()==8);
    }
}
