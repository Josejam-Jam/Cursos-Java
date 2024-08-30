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
public class Ejer_2 {

    /**
     * 
     *  Ejer 2 Pedir dos números enteros y decir si son iguales o no
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Creamos el Object Scanner con el constructor new Scanner
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        String mensaje;
        boolean iguales = false;
        
        System.out.println("Mostramos si dos números son iguales entre sí\n");
        
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();
        
            //  Forma 1
            if(num1 == num2){
                mensaje = "Los números son iguales";
            } else {
                mensaje = "Los números son distintos";
            }
        
        System.out.println("Los números introducido " + num1 + " y " + num2 + ":\t" + mensaje);
            
            // Forma 2 usando una función alternativa
        iguales = isIguales(num1, num2);
        
            if(iguales) {
                mensaje = "Los números son iguales";
            } else {
                mensaje = "Los números son distintos";
            }
        
        System.out.println("Los números introducido " + num1 + " y " + num2 + ":\t" + mensaje);
        
        
    }
    
    /* FUNCIONES    */
    
    public static boolean isIguales(int num1, int num2) {
        //  Evalua la expresión de la comparación entre los dos números
        return (num1 == num2);
    }
}
