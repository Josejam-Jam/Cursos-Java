/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 11     Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente 
 *              (de 0 a 4), Suficiente (5), Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).
 * 
 * 
 * 
 * @author josejam
 */
public class Ejer_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int nota;
        String calificacion;
        
        System.out.println("Mostrar la Calificaciones");
        
        nota = sc.nextInt();
        
        calificacion = calificacion(nota);
        
        
        System.out.println("Calificación:\t" + calificacion);
        
        
    }
    
    /* FUNCIONES     */
    
    public static String calificacion(int nota) {
        
        String result = "";
            
            if(nota <= 0 && nota < 5) {
                result = "Insuficiente";
            } else if(nota == 5) {
                result = "Suficiente";
            } else if(nota == 6) {
                result = "Bien";
            } else if(nota == 7 || nota == 8) {
                result = "Notable";
            } else if(nota == 9 || nota == 10) {
                result = "Sobresaliente";
            }
            
        return result;
        
    }
}
