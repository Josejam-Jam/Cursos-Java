/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *  Ejer Propuesto 2    Escribir un programa que tome como entrada un número entero
 *                      y nos indique qué cantidad hay que sumarle para que el resultado
 *                      sea múltiplo de 7
 *                          
 *                          Ejemplo: 
 *                              *   A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7
 *                              *   A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7
 *                      
 *                      Si proporcionamos el número 2 o el 13, la salida de la aplicación debe ser 5 o 1 respectivamente
 * 
 * 
 *  Ejer Propuestos 3   Modificar el ejercicio anterior para que, indicando 
 *                      dos números n y m, nos diga qué cantidad hay que sumarle
 *                      a n para que sea múltiplo de m.
 * 
 * @author josejam
 */
public class Ejer_Propuestos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int num1;
        int num2;
        int numResult = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        
        System.out.println("\nTransformamos el número introducido N = " + num1 + " en un múltiplo de M = " + num2 +"\n");
        
            if(num1 == num2) {
                System.out.println("\nEl número ya es múltiplo de " + num2);
                System.out.println("Hay que sumarle " + numResult + " , ya que ( " + num2 + " / " + num1 + "  = 1 )");
            } else {
                
                if(num1 > num2){  
                    numResult = siEsMayorNum(num1, num2);
                }
                
                if(num1 < num2) {
                    numResult = siEsMenorNum(num1, num2);
                    System.out.println(numResult);
                }
                
                System.out.println("\nEl número resultante es:\t " + numResult + "\n");
                int numFinal = (num1 + numResult);
//                System.out.println("Ya que  " + (num + numResult) + " / " + num2  + " = "  + ((num + numResult) / num2));
                System.out.println("Ya que  ( " + num1 + " + " + numResult + " ) = " + numFinal + " / " + num2  + " = "  + (numFinal / num2));
            }
        
    }
    
    /*  FUNCIONES  */
    
    public static int siEsMenorNum(int num, int num2) {
        return (num2 - num);
    }
    
    public static int siEsMayorNum(int num, int num2) {
//        int result = ( num2 - (num % num2));
        
//        return result;
        int result = 0;
        
            if((num % num2) != 0) { result = (num2 - (num % num2)); }
        //result = (((num % num2) != 0)?(num2 - (num % num2)):0);
        
//        return (num2 - (num % num2));

        
//        return (((num % num2) != 0)?(num2 - (num % num2)):0);
        return (result);
    }
}
