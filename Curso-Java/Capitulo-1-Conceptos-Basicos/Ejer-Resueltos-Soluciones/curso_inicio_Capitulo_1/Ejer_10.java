/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *
 *  Ejer 10 Diseñar una aplicación que calcule la longitud y el área de una
 *          circunferencia, para ello, el usuario debe introducir el radio
 *          que puede contener decimales
 * 
 *          formulas:   longitud = 2PI * r²
 *                      área =  PI * r²
 * 
 * @author josejam
 */
public class Ejer_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double longitud, area;
        double radio;
        
        System.out.println("Introduce el valor del Radio de la Circunferencia:");
        radio = sc.nextDouble();
        
        longitud = calcLongitud(radio);
        area = calcArea(radio);
        
        System.out.println("\n\nCalculamos la Longitud y el Área de la Circunferencia\n");
        System.out.println("Circunferencia radio:\t\t\t" + radio);
        System.out.println("Longitud Circunferencia:\t\t" + longitud);
        System.out.println("Área Circunferencia\t\t\t" + area);
        
    }
    
    /* FUNCIONES     */
    
    public static double calcLongitud(double radio) {
        return ((Math.PI * 2) * (Math.pow(radio, 2)));
    }

    public static double calcArea(double radio) {
        return (Math.PI * (Math.pow(radio, 2)));
    }
    
}
