/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 * 
 * Ejer 1 Diseñar un programa que pida un número al usuario -por teclado-
 *          y a continuación lo muestre.
 *
 * @author josejam
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numDefault = "No se ha introducido ningún número";
        int num;
        
        System.out.println(numDefault);
        System.out.println("Escriba un número: ");
        
        num = sc.nextInt();
        
        System.out.println("El valor introducido es: " + num);
        
        
    }
    
}
