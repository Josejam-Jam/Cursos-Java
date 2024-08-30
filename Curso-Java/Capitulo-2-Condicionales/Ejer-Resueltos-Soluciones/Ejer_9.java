/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 9  Escribir un aplicación que indique cuántas cifras tiene un número entero
 *          introducido por teclado, que estará comprendido entre 0 y 99999.
 * 
 * @author josejam
 */
public class Ejer_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int cantCifras;
        
        System.out.println("Mostramos la cantidad de Cifras\n");
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        cantCifras = calcCantCifras(num);
        
        System.out.println("El número introducido " + num + " tienes " + cantCifras + " cifras");
        
    }
    
    /*  FUNCIONES   */
    
    public static int calcCantCifras(int num) {
        int result = 0;
        
            if(num < 10) {
                result = 1;
            } else if(num > 9 && num <= 99) {
                result = 2;
            } else if(num > 99 && num <= 999) {
                result = 3;
            } else if(num > 999 && num <= 9999) {
                result = 4;
            } else if(num > 9999 && num <= 99999) {
                result = 5;
            }
            
        return result;
    }
    
}
