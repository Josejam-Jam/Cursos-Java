/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 *  Ejer 5 Implementar un programa que pida por teclado un número decimal e indique
 *          si es un número casi-cero, que son aquellos, positivos o negativos, 
 *          que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 
 *          no se considera un número casi-cero
 * 
 *          Ejemplos de números casi-cero son el 0.3, el -0.99 o el 0.123
 *          Y números que no se consideran casi-ceros son: el 12.3, el 0 o el -1.
 * 
 * 
 * @author josejam
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double num;
        String mensaje;
        
        System.out.println("Mostramos si un número introducido por teclado es un número casi-cero\n");
        
        System.out.println("Introduce un número decimal entre [ -1  y  1 ] distinto de 0:");
        num = sc.nextDouble();
        
            if(num != 0 && (num > -1) && (num < 1)){
                mensaje = "El número introducido " + num + " es casi-cero";
            } else {
                mensaje = "El número introducido " + num + " no es casi-cero";
            }
        
        System.out.println("\n" + mensaje + "\n");
        
        
            
        
    }
    
    /*  FUNCIONES    */
    
    public static boolean isCasiCero(double num){
        return(num != 0 && (num > -1) && (num < 1));
    }
    
    public static String showMensaje(double num) {
        String result;
        
            if(isCasiCero(num)){
                result = "El número introducido " + num + " es casi-cero";
            } else {
                result = "El número introducido " + num + " no es casi-cero";
            }
            
        return result;    
    }
    
}
