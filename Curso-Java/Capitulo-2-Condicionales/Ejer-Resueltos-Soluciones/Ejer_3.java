/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 3 Solicitar dos números distintos y mostrar cuál es el mayor
 * 
 * @author josejam
 */
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Creamos el Object Scanner
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        boolean esMayor = false;
        boolean esMenor = false;
        String mensaje;
        
        System.out.println("Comparamos dos números distintos y mostaramos cual es el mayor\n");
        
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
            // Forma 1 
            
            if(num1 > num2) {
                mensaje = "El número " + num1 + " es mayor que " + num2;
            } else if(num1 < num2){
                mensaje = "El número " + num2 + " es mayor que " + num1;
            } else {
                mensaje = "El número " + num1 + " son iguales " + num2;
            }
        System.out.println(mensaje + "\n");
            // Segunda Forma
        
        esMayor = isMayor(num1, num2);
        esMenor = isMenor(num1, num2);
        
            if(esMayor) {
                mensaje = "El número " + num1 + " es mayor que " + num2;
            } else if(esMenor) {
                mensaje = "El número " + num2 + " es mayor que " + num1;
            } else {
                mensaje = "El número " + num1 + " son iguales " + num2;
            }
                
        System.out.println(mensaje);
    }
    
    
    /* FUNCIONES  */
    
    public static boolean isMayor(int num1, int num2) {
        return (num1 > num2);
    }
    
    public static boolean isMenor(int num1, int num2) {
        return (num1 < num2);
    }
    
}
