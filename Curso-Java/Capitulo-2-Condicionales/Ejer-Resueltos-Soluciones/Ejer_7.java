/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 7   Pedir tres números y mostrarlos ordenados de mayor a menor.
 * 
 * @author josejam
 */
public class Ejer_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Mostramos dos números ordenados de forma decreciente");
        
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num3 = sc.nextInt();
        
        // Método 1  A través de una función   
        
        ordenarSortDecreciente(num1, num2, num3);
        
    }
      
    /*  FUNCIONES  */
    
    public static void ordenarSortDecreciente(int num1, int num2) {
        int menor = (num1 < num2?num1:num2);
        int mayor = (num1 > num2?num1:num2);
        
        System.out.println("\n" + mayor + ", " + menor);
    }
      
    public static void ordenarSortDecreciente(int num1, int num2, int num3) {
        int mayor = 0;
        int menor = 0;
        int interm = 0;
        
            if(num1 < num2 && num1 < num3){
                menor = num1;
                mayor = (num2 < num3?num3:num2);
                interm = (mayor == num3?num2:num3);
            } else if(num1 > num2 && num1 > num3) {
                mayor = num1;
                menor = (num2 > num3?num3:num2);
                interm = (menor == num2?num3:num2);
            } else if(num2 > num3 && num2 > num1) {
                mayor = num2;
                menor = (num3 < num1?num3:num1);
                interm = (menor == num3?num1:num3);
            }
        
        System.out.println("\n" + mayor + ", " + interm + ", " + menor);
    }
    
    
}
