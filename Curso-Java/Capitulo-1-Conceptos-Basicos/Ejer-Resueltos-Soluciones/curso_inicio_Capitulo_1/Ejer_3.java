/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 * Ejer 3   Escribir una aplicación que pida el año actual y el de nacimiento del usuario
 *          Debe calucular su edad, suponiendo que en el año en curso el usuario
 *          ya ha cumplido años
 *
 * @author josejam
 */
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String menInicio = "Introduce el año Actual: ";
        String menEdad = "Introduce tú año de nacimiento: ";
        String menSalida = "Tú edad actual es: ";
        int yearActual = 0;
        int yearNacimiento = 0;
        
        System.out.println(menInicio);
        yearActual = sc.nextInt();
        
        System.out.println(menEdad);
        yearNacimiento = sc.nextInt();
        
        System.out.println("\nCalculamos la edad directamente\n");
        System.out.println(menSalida + "\t" + (yearActual - yearNacimiento) + " años\n\n");
        
        System.out.println("Calculamos la edad a través de una Función calcularEdad:\t" + (calcularEdad(yearActual, yearNacimiento)) + " años \n\n");
        
        
        System.out.println("Calculamos la edad a través de una Función menCalcularEdad\t" + menCalcularEdad(yearActual, yearNacimiento) + " años \n\n");
        
        
        
    }

    
    public static int calcularEdad(int yearAct, int yearNac) {
        int result = (yearAct - yearNac);
        
        //        return (yearAct - yearNac);
        return result;
    }
    
    public static String menCalcularEdad(int yearAct, int yearNac) {
        
        return ("Tú edad Actual es: " + calcularEdad(yearAct, yearNac));
    }

}
