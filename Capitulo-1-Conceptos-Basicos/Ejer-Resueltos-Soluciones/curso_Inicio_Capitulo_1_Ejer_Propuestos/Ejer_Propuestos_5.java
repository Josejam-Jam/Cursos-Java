/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *
 *  Ejer Propuestos 5   Dado un polinomio de segundo grado
 * 
 *                          y = ax² + bx + c
 * 
 *                      Crear un programa que pida los coeficientes a , b y c,
 *                      así como el valor de x, y, y calcule el valor de y. 
 * 
 * @author josejam
 */
public class Ejer_Propuestos_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int aInt, bInt, cInt, xInt;
        double aDou, bDou, cDou, xDou;
        int valorYInt;
        double valorYDou;
        
        System.out.println("Calculamo el valor de [y] en un polinomiode 2º Grado:\n\n");
        
        /*  Pedimos los datos de tipo Entero [int]  */
        System.out.println("Introduzca los valores de Tipo Entero\n");
        
        System.out.println("Introduzca el valor de a:");
        aInt = sc.nextInt();
        
        System.out.println("Introduzca el valor de b:");
        bInt = sc.nextInt();
        
        System.out.println("Introduzca el valor de c:");
        cInt = sc.nextInt();
        
        System.out.println("Introduzca el valor de x:");
        xInt = sc.nextInt();
        
        valorYInt = calcPolinomio2Grado(aInt, bInt, cInt, xInt);
        
        System.out.println("\nValor de [ Y ] tipo entero:\t" + valorYInt + "\n\n");
        
        /*  Pedimos los datos de tipo Decimal [double]  */
        System.out.println("Introduzca los valores de Tipo Decimal\n");
        
        System.out.println("Introduzca el valor de a:");
        aDou = sc.nextDouble();
        
        System.out.println("Introduzca el valor de b:");
        bDou = sc.nextDouble();
        
        System.out.println("Introduzca el valor de c:");
        cDou = sc.nextDouble();
        
        System.out.println("Introduzca el valor de x:");
        xDou = sc.nextDouble();
        
        valorYDou = calcPolinomio2Grado(aDou, bDou, cDou, xDou);
        
        System.out.println("\nValor de [ Y ] tipo Decimal:\t" + valorYDou + "\n\n");
        
        
        
    }
    
    /*  FUNCIONES  */
    
    public static int calcPolinomio2Grado(int a, int b, int c, int x) {
    
        return ((int) ((a * Math.pow(x, 2)) + (b * x) + c));
    }
    
    public static double calcPolinomio2Grado(double a, double b, double c, double x) {
    
        return ((a * Math.pow(x, 2)) + (b * x) + c);
    }
    
    
    
}
