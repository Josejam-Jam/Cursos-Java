/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 * @author josejam
 */
public class Ejer_6 {

    /**
     * 
     *  Ejer 6 Pedir dos números y mostrarlos ordenados de forma decreciente.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int mayor, menor;
        
        System.out.println("Mostramos dos números ordenados de forma decreciente");
        
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
        // Método 1
        menor = (num1 < num2?num1:num2);
        mayor = (num1 > num2?num1:num2);
        
        System.out.println("\n" + mayor + ", " + menor + "\n");
        
        // Método 2  A través de una función   
        
        ordenarSortDecreciente(num1, num2);
        
    }
    
    /*  FUNCIONES  */
    
    public static void ordenarSortDecreciente(int num1, int num2) {
        int menor = (num1 < num2?num1:num2);
        int mayor = (num1 > num2?num1:num2);
        
        System.out.println("\n" + mayor + ", " + menor);
    }
    
    
}
