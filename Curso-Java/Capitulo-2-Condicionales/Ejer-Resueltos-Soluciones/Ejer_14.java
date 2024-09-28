/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 14     Crear una aplicación que solicite al usuario una fecha (dia, mes y año)
 *              y muestre la fecha correspondiente al día siguiente.
 * 
 * @author josejam
 */
public class Ejer_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, year;
        int diasMeses;
        String fechaResult;
         
        System.out.println("Pedimos una fecha y mostramos la fecha del día siguiente");
        
        System.out.println("Introducido día:");
        dia = sc.nextInt();
        
        System.out.println("Introduce mes:");
        mes = sc.nextInt();
        
        System.out.println("Introduce year:");
        year = sc.nextInt();
        
        fechaResult = showFechaActual(dia, mes, year);
        
        System.out.println("Fecha Actual: " + fechaResult);
        
        
    }
    
    /* FUNCIONES     */
    
    public static int getDiasMes(int mes) {
        int result = 0;
        
            if(mes == 2){
                result = 28;
            }
            
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11 || mes == 12) {
                result = 30;
            }
            
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                result = 31;
            }
        
        return result;
    }
    
    public static String showFechaActual(int dia, int mes, int year) {
        String result = "";
        
        int diasMes = getDiasMes(mes);
        
            dia++;
            
            if(dia > diasMes) {
                dia = 1;
                mes++;
                
                if(mes > 12) {
                    year++;
                    mes = 0;
                }
            }
            
            if(year == 0) {
                year = 1;
            }
            
        result = ((dia < 10)?("0" + dia):dia) + "-" +((mes < 10)?("0" + mes):mes) + "-" + year;    
            
        return result;
    }
    
}
