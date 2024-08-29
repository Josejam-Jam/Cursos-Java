/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *
 *  Ejer Propuesto 7    Solicitar al usuario tres distancias:
 * 
 *                          *   la primera, medida en milímetros
 *                          *   la segunda, medida en centímetros
 *                          *   y la última, medida en metros
 * 
 *                      Diseñar un programa que muestre la suma de las tres
 *                      longitudes introducidas (medidas en centímetros).
 * 
 * @author josejam
 */
public class Ejer_Propuestos_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int distMetros, distCm, distMm;
        double distDoubMetros, distDoubCm, distDoubMm;
        double distTotal;
        
        System.out.println("Mostramos la suma de 3 distancias en centímetros\n");
        
        System.out.println("Introduce datos Tipo int");
        System.out.println("Introduce la primera medida en Milímetros");
        distMm = sc.nextInt();
        
        System.out.println("Introduce la segunda medida en Centímetros");
        distCm = sc.nextInt();
        
        System.out.println("Introduce la tercera medida en Metros");
        distMetros = sc.nextInt();
        
        distTotal = ((calcMilimetrosACentimetros(distMm)) + distCm + (calcMetrosACentimetros(distMetros)));
        
        System.out.println("\nTotal de la Distancia:\t" + distTotal + " cm");
        System.out.println("\n\n");
        
        System.out.println("Introduce datos Tipo double");
        System.out.println("Introduce la primera medida en Mílimetros");
        distDoubMm = sc.nextDouble();
        
        System.out.println("Introduce la segunda medida en Centímetros");
        distDoubCm = sc.nextDouble();
        
        System.out.println("Introduce la tercera medida en Metros");
        distDoubMetros = sc.nextDouble();
        
        
        distTotal = ((calcMilimetrosACentimetros(distDoubMm)) + distDoubCm + (calcMetrosACentimetros(distDoubMetros)));
        
        System.out.println("\nTotal de la Distacia:\t" + distTotal + " cm");
        
        
    }
    
    /*  FUNCIONES    */
    
    public static double calcMetrosACentimetros(int distMetros) {
    
        return (distMetros * 10);
    }
    
    public static double calcMetrosACentimetros(double distMetros) {
        
        return (distMetros * 10);
    }
    
    public static double calcMetrosAMilimetros(int distMetros) {
    
        return (distMetros * 1000);
    }
    
    public static double calcMetrosAMilimetros(double distMetros) {
    
        return (distMetros * 1000);
    }
    
    public static double calcCentimetrosAMilimetros(int distCm) {
    
        return (distCm * 10);
    }
    
    public static double calcCentimetrosAMilimetros(double distCm) {
    
        return (distCm * 10);
    }
   
    public static double calcCentimetrosAMetros(int distCm) {
    
        return (distCm / 100);
    }
   
    public static double calcCentimetrosAMetros(double distCm) {
    
        return (distCm / 100);
    }
    
    public static double calcMilimetrosACentimetros(int distMm) {
    
        return (distMm / 10);
    }
    
    public static double calcMilimetrosACentimetros(double distMm) {
    
        return (distMm / 10);
    }
    
    public static double calcMilimetrosAMetros(int distMm) {
    
        return (distMm / 1000);
    }
    
    public static double calcMilimetrosAMetros(double distMm) {
    
        return (distMm / 1000);
    }
    
}
