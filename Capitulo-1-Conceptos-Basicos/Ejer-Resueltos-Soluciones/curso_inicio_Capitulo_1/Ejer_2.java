/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *  Ejer 2 Pedir al usuario su edad y mostrar la que tendrá el próximo año
 * 
 * @author josejam
 */
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String men = "Introduce tú edad : ";
        int edad;
        String newMen = "El próximo año tendrás ";
        
        System.out.println(men);
        edad = sc.nextInt();
        
        System.out.println("Tú edad actual es : " + edad + " años\n\n");
        
        System.out.println(newMen + (edad + 1) + " años");
        
        
    }
}
