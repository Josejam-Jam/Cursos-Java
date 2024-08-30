/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 1 Diseñar una aplicación que solicite al usuario un numero 
 *         e indique si es par o impar
 * 
 * 
 * @author josejam
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarmos el Object Scanner
        Scanner sc = new Scanner(System.in);
        
        // Variables de entorno
        int num;
        boolean par = false;
        String respuesta;
        
        System.out.println("Mostramos si un número es par o impar\n");
        
        // Pedimos un número por teclado
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        par = isPar(num);
        
            if(par) {
                respuesta = "Es par";
            } else {
                respuesta = "Es impar";
            }
        
        System.out.println("\nEl número introducido " + num + ":\t" + respuesta);
        
        
    }
    
    /*  FUNCIONES   */
    
    public static boolean isPar(int num) {
        // Evalua la expresión si el módulo de 2 aplicado a num es = 0  [ true || false ] 
        return (num % 2 == 0);
    }
    
}
