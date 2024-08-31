/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 10     Pedir un número entre 0 y 9999, y decir si es capicúa.
 * 
 * @author josejam
 */
public class Ejer_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int dm, udm, cent, dec, unid;
        boolean esCapicua = false;
        
        System.out.println("Mostramos si un número es capicua\n");
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        dm = num % 10;
        num = num / 10;
        
        udm = num % 10;
        num = num / 10;
        
        cent = num % 10;
        num = num / 10;
        
        dec = num % 10;
        num = num / 10;
        
        unid = num;
        
        esCapicua = isCapicua(dm, udm, cent, dec, unid);
        
        
    }
    
    /* FUNCIONES     */
    
    public static boolean isCapicua(int dm, int udm, int cent, int dec, int unid) {
        boolean result = false;
        
            if(dm != 0 && dm == unid && udm == dec) {
                result = true;
            }
        
            if(dm == unid && udm == dec) {
            
            }
        
        return result;
    }
    
}
