/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 15  Idear un programa que solicite al usuario un número comprendido entre 1 y 7, 
 *          correspondiente a un día de la semana 
 * 
 *          Se debe mostrar el nombre del día de la semana al que corresponde
 * 
 *          Por ejemplo, el número 1 corresponde a "lunes" y el 6 a "sábados"
 * 
 * @author josejam
 */
public class Ejer_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numSemana;
        String diaSemana;
        
        System.out.println("Pedimos un número y mostramos su nombre en letras\n");
        
        System.out.println("Introduce el número correspondiente al día de la semana");
        numSemana = sc.nextInt();
        
        diaSemana = getDiaSemana(numSemana);
        
        System.out.println("El número introducido " + numSemana + " corresponde a:\t" + diaSemana);
        
    }
    
    /* FUNCIONES     */
    
    public static String getDiaSemana(int numSemana) {
        String result = "";
                
        switch (numSemana) {
            case 1:
                result = "Lunes";
                break;
            case 2:
                result = "Martes";
                break;
            case 3:
                result = "Miércoles";
                break;
            case 4:
                result = "Jueves";
                break;
            case 5:
                result = "Viernes";
                break;
            case 6:
                result = "Sábados";
                break;
            case 7:
                result = "Domingo";
                break;
        }
        
        return result;
    }
    
}
