/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *
 *  Ejer 7      Sería interesante disponer de un programa que pida como entrada
 *              un número decimal y lo muestre redondeado al entero más próximo.
 * 
 * @author josejam
 */
public class Ejer_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double numDecimal;
        int numRedondeo;
        
        System.out.println("Introduce un número decimal:\n");
        numDecimal = sc.nextDouble();
        
        System.out.println("Redondeo al entero más próximo directo");
        System.out.println((int)(numDecimal + 0.5));
        
        System.out.println("Función Redondeo al entero más próximo");
        System.out.println(calcEnteroPróximo(numDecimal));
        
    }
    
    public static int calcEnteroPróximo(double num) {
        return ((int) (num + 0.5));
    }
}
