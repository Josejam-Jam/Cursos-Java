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
 * @author josejam
 */
public class Ejer_Propuestos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        final int NUMB_BASE = 7;
        int num;
        int numResult = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Transformamos el número introducido por teclado en un múltiplo de " + NUMB_BASE +"\n");
        
        System.out.println("Introduce un número:");
        num = sc.nextInt();
        
            if(num == NUMB_BASE) {
                System.out.println("\nEl número ya es múltiplo de " + NUMB_BASE);
                System.out.println("Hay que sumarle " + numResult + " , ya que ( " + NUMB_BASE + " / " + num + "  = 1 )");
            } else {
                
                if(num > NUMB_BASE){  
                    numResult = siEsMayorNum(num, NUMB_BASE);
                }
                
                if(num < NUMB_BASE) {
                    numResult = siEsMenorNum(num, NUMB_BASE);
                    System.out.println(numResult);
                }
                
                System.out.println("\nEl número resultante es:\t " + numResult + "\n");
                int numFinal = (num + numResult);
//                System.out.println("Ya que  " + (num + numResult) + " / " + NUMB_BASE  + " = "  + ((num + numResult) / NUMB_BASE));
                System.out.println("Ya que  ( " + num + " + " + numResult + " ) = " + numFinal + " / " + NUMB_BASE  + " = "  + (numFinal / NUMB_BASE));
            }
        
    }
    
    /*  FUNCIONES  */
    
    public static int siEsMenorNum(int num, int numBase) {
        return (numBase - num);
    }
    
    public static int siEsMayorNum(int num, int numBase) {
//        int result = ( numBase - (num % numBase));
        
//        return result;
        int result = 0;
        
            if((num % numBase) != 0) { result = (numBase - (num % numBase)); }
        //result = (((num % numBase) != 0)?(numBase - (num % numBase)):0);
        
//        return (numBase - (num % numBase));

        
//        return (((num % numBase) != 0)?(numBase - (num % numBase)):0);
        return (result);
    }
}
