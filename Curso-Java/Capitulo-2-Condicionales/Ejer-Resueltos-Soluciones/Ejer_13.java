/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 13     Escribir un programa que pida un hora de la forma: hora, minutos y segundos
 * 
 *              El programa debe mostrar la hora un segundo más tarde
 * 
 *              Un ejemplo:
 * 
 *                  hora actual [10:41:59]  hora actual + 1  segundo [10:42:00].
 * 
 * 
 * @author josejam
 */
public class Ejer_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int h, min, seg;
        String result;
        
        System.out.println("Pedimos la hora por teclado y la incrementamos en un segundo");
        
        System.out.println("Introduce hora:");
        h = sc.nextInt();
        
        System.out.println("Introduce minutos:");
        min = sc.nextInt();
        
        System.out.println("Introduce segundos");
        seg = sc.nextInt();
        
        result = incrementarHora(h, min, seg);
         
        System.out.println("Hora actual introducida\t[ " + h + ":" + min + ":" + seg + " ]\t1 + 1 Segundo\t" + result);
       
    }
    
    /* FUNCIONES     */
    
    public static String incrementarHora(int hora, int min, int seg) {
        String result;
            
            if((seg + 1) == 60) {
                min++;
                seg = 0;
            } else if(min == 60) {
                hora++;
                min = 0;
            } else if(hora > 23) {
                hora = 0;
            }
            
        result = "[ " + ((hora == 0)?("0" + hora):hora) + ":" + ((min == 0)?("0" + min):min) + ":" + ((seg == 0)?("0" + seg):seg) + " ]";
        
        return result;
    }
    
}
