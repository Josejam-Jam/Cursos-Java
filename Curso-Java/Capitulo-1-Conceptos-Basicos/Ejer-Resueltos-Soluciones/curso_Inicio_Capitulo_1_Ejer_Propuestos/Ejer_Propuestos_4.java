/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *  
 * Ejer Propuestos 4    Crear un programa que pida la base y la altura de un
 *                      triángulo y muestre su área
 * 
 *                          A = (b * h) / 2
 * 
 * @author josejam
 */
public class Ejer_Propuestos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        /* *** RECUERDA QUE SI USAS DOUBLE LA INTRODUCCIÓN DE NÚMEROS DECIMALES POR CONSOLA SE USA LA COMA ' 2,5 '   */
        
        int intBase, intAltura;
        double douBase, douAltura;
        
        double areaInt;     //  ***     PUEDE CONTENER DECIMALES
        double areaDouble;
        
        System.out.println("Calculamos el Área de un triángulo\n\n");
        
        /*  Pedimos los datos con números enteros  */
        
        System.out.println("Introduce la Base del Triángulo en números enteros");
        intBase = sc.nextInt();
        
        System.out.println("\nIntroduce la Altura del Triángulo en números enteros");
        intAltura = sc.nextInt();
        
        /*  Calculamos el resultado  */
        areaInt = calcAreaTriangulo(intBase, intAltura);
        
        /*  Mostramos el resultado  */
        System.out.println("El Área del Triángulo [ Base = " + intBase + ", Altura = " + intAltura + " ]\n");
        System.out.println("Área :\t a = " + areaInt);
        
        /*  Cálculo directo  2º Método */
        System.out.println("Cálculo Directo Área :\t a = " + calcAreaTriangulo(intBase, intAltura));
        
        /*  Pedimos los datos con números decimales  */
        
        System.out.println("\nIntroduce la Base del Triángulo en números decimales");
        douBase = sc.nextDouble();
        
        System.out.println("\nIntroduce la Altura del Triángulo en números decimales");
        douAltura = sc.nextDouble();
        
        /*  Calculamos el resultado  */
        areaDouble = calcAreaTriangulo(douBase, douAltura);
        
        /*  Mostramos el resultado  */
        System.out.println("El Área del Triángulo [ Base = " + douBase + ", Altura = " + douAltura + " ]\n");
        System.out.println("Área :\t a = " + areaDouble);
        
        /*  Cálculo directo  2º Método  */
        System.out.println("Cálculo Directo Área :\t a = " + calcAreaTriangulo(douBase, douAltura));
        
        
    }
    
    /*  FUNCIONES  */
   
    public static double calcAreaTriangulo(int base, int altura) {
        /*   Puede contener decimales   */
        return ((base * altura) / 2);
    }
    
    public static double calcAreaTriangulo(double base, double altura) {
        return ((base * altura) / 2);
    }
}
