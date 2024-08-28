/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 * 
 * Ejer 4   El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
 *          Se pide escribir un programa que compruebe que el rango de valores de
 *          tipo se comporta de forma cíclica, es decir, el valor siguiente al máximo
 *          es el valor mímimo y viceversa.
 *      
 *
 * @author josejam
 */
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        short num;
        num = 32767;
        
        System.out.println("Valor máximo de un Tipo Short:\t" + num + "\n");
        num++;
        System.out.println("Valor mínimo de un Tipo Short:\t" + (num) + "\n");
        
        System.out.println("Valor mínimo de un Tipo Short:\t" + (--num) + "\n");
        System.out.println("Valor mínimo de un Tipo Short:\t" + (++num) + "\n");
        
        
        
    }
}
