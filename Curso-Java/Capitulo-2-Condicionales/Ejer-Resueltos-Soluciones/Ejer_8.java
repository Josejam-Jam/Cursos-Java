/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  Ejer 8  Pedir los coeficientes de una ecuación de 2º Grado, y mostrar sus soluciones
 *          reales
 * 
 *          Si no existen, debe indicarlo
 * 
 *          Recordemos que las soluciones de una ecuación de segundo grado, 
 *          ax² + bx + c = 0 son
 * 
 *                  x = ( -b (+-) raíz(b² - 4ac) ) / 2a
 *  
 * 
 * @author josejam
 */
public class Ejer_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        // Para usar el . en los datos double 
        sc.useLocale(Locale.US);
        
        double a, b, c;
        double x1, x2, d;
        
        System.out.println("Introduzca primer coeficiente ( a ): ");
        a = sc.nextDouble();
        
        System.out.println("Introduzca segundo coeficiente ( b ): ");
        b = sc.nextDouble();
        
        System.out.println("Introduzca tercer coeficiente ( c ): ");
        c = sc.nextDouble();
        
        //d = (b * b -4 * a * c);
        d = calcDiscriminante(a, b, c);
        
            if(d < 0){
                System.out.println("No existen soluciones reales");
            }else {
                if(a == 0){
                    System.out.println("No es una ecuación de segundo grado");
                }else {
                    //x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x1 = calcSolucion1(a, b, c, d);
                    
                    //x2 = (-b - Math.sqrt(d)) / (2 * a);
                    x2 = calcSolucion2(a, b, c, d);
                    
                    System.out.println("Solución 1: " + x1);
                    System.out.println("Solución 2: " + x2);
                }
            }
        
    }
    
    /*  FUNCIONES    */
    
    public static double calcDiscriminante(double a, double b, double c) {
        
        return ((b * b) - (4 * a * c));
        
    }
    
    public static double calcSolucion1( double a, double b, double c, double discriminante) {
    
        double discrim = (Math.sqrt(calcDiscriminante(a, b, c)));
        return ((-b + discrim) / (2 * a));
        
    }
    
    public static double calcSolucion2( double a, double b, double c, double discriminate) {
    
        double discrim = (Math.sqrt(calcDiscriminante(a, b, c)));
        return ((-b - discrim) / (2 * a));
    }
    
}
