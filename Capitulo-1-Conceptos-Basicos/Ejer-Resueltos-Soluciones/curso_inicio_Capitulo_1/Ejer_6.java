/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *
 *  Ejer 5  Necesitamos una aplicación que calcule la media aritmética de dos notas enteras
 *          Hay que tner en cuenta que la media pue contener decimales
 * 
 * 
 *  Ejer 6  Modificar el ejercicio anterior para que muestre la parte entera
 *          de la media de tres notas decimales.
 * 
 * 
 * @author josejam
 */
public class Ejer_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        /*  Declaramos un array para 3 elementos   */
        double[] notas = new double[3];
        
        
        System.out.println("Introduce Nota 1: ");
        nota1 = sc.nextDouble();    /*  LECTURA DE DATOS DOUBLE USA COMAS AL INTRODUCIR LOS DATOS POR CONSOLA      */
        notas[0] = nota1;
        
        System.out.println("Introduce Nota 2: ");
        nota2 = sc.nextDouble();
        notas[1]= nota2;
        
        System.out.println("Introduce Nota 3: ");
        nota3 = sc.nextDouble();
        notas[2]= nota2;
        
        System.out.println("\nCalculamos la Nota Media directamente");
        System.out.println("Media:\t" + ((int)(nota1 + nota2 + nota3) / 3) + "\n\n");
        
        /*  Calculamos la nota media a través de una función que recibe dos notas tipo int   */
        System.out.println("Calculamos la Nota Media Función calcMedia");
        System.out.println("calcMedia Media:\t" + calcMedia(nota1, nota2, nota3) + "\n\n");
        
        /*  Calculamos la nota media a través de una función que recibe un array como parámetro   */
        System.out.println("Calculamos la Nota Media Fución calcMedia Array");
        System.out.println("calcMedia Array Media:\t" + calcMedia(notas));
        
        
        /* NOTA:    AL INTRODUCIR LOS DATOS POR CONSOLA EL SISTEMA 
                    RECONOCE EL LAS "COMAS [ 8,5 ]" COMO DECIMALES, ES EL SISTEMA
                    EUROPEO, EN EL SISTEMA AMERICANO E INGLÉS SE USA EL "PUNTO [ 8.5 ]"
        */
        
        /* EJEMPLO DE LECTURA DE DATOS INT    */
        
        double[] notas2 = {9.5,10,9.75};
        
        
        System.out.println("\nCalculo de Media lectura int");
        System.out.println("Media:\t" + calcMedia(notas2));
        
        
    }
    /* FUNCIONES  */
    
    /*  Calcular la Media  función que recibe tres parámetros tipo int   */
    public static int calcMedia(int nota1, int nota2, int nota3){
        return (int)((nota1 + nota2 + nota3) / 3.0);
    }
    
    /*  Calcular la Media  función que recibe un array int como parámetro   */
    public static int calcMedia(int[]notas){
        int cantElem = notas.length;
        int total = 0;

            for (int nota : notas) {
                total += nota;
//                total = total + nota;
                
            }
            
        return (int)(total / (cantElem * 1.0));
    }
    
    /*  Calcular la Media  función que recibe tres parámetros tipo double   */
    public static int calcMedia(double nota1, double nota2, double nota3){
        return (int)((nota1 + nota2 + nota3) / 3);
    }
    
    /*  Calcular la Media  función que recibe un array double como parámetro   */
    public static int calcMedia(double[]notas){
        int cantElem = notas.length;
        int total = 0;

            for (double nota : notas) {
                total += nota;
//                total = total + nota;
                
            }
            
        return (int)(total / cantElem);
    }
}
