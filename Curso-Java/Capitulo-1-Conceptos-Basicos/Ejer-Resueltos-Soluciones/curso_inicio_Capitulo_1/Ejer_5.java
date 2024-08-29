/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 * 
 *  Ejer 5  Necesitamos una aplicación que calcule la media aritmética de dos notas enteras
 *          Hay que tner en cuenta que la media puede contener decimales.
 *
 * @author josejam
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;
        /*  Declaramos un array vacío   */
        int[] notas = new int[2];
        
        
        System.out.println("Introduce Nota 1: ");
        nota1 = sc.nextInt();
        notas[0] = nota1;
        
        System.out.println("Introduce Nota 2: ");
        nota2 = sc.nextInt();
        notas[1]= nota2;
        
        System.out.println("Calculamos la Nota Media directamente");
        System.out.println("Media:\t" + ((nota1 + nota2) / 2) + "\n\n");
        
        /*  Calculamos la nota media a través de una función que recibe dos notas tipo int   */
        System.out.println("Calculamos la Nota Media Función calcMedia");
        System.out.println("calcMedia Media:\t" + calcMedia(nota1, nota2) + "\n\n");
        
        /*  Calculamos la nota media a través de una función que recibe un array como parámetro   */
        System.out.println("Calculamos la Nota Media Fución calcMedia Array");
        System.out.println("calcMedia Array Media:\t" + calcMedia(notas));
        
        
        
        
        
        
        
    }
    
    /*  Calcular la Media  función que recibe dos parámetros tipo int   */
    public static double calcMedia(int nota1, int nota2){
        return ((nota1 + nota2) / 2);
    }
    
    /*  Calcular la Media  función que recibe un array int como parámetro   */
    public static double calcMedia(int[]notas){
        int cantElem = notas.length;
        int total = 0;

            for (int nota : notas) {
                total += nota;
//                total = total + nota;
                
            }
            
        return (total / cantElem);
    }
}
