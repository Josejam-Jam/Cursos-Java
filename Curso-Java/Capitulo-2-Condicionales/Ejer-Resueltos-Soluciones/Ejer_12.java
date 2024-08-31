/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 *  Ejer 12     Pedir el día, mes y año de una fecha e indicar si la fecha es correcta
 *              Recordamos que existen meses con 28, 30 y 31 días
 * 
 *              No consideramos los años bisiestos.
 * 
 * @author josejam
 */
public class Ejer_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, year;
        boolean fechaCorrecta;
        
        System.out.println("Pedimos un día, un mes y año e indicamos si la fecha es correcta\n");
        
        System.out.println("Introduzca dia:");
        dia = sc.nextInt();
        
        System.out.println("Introduzca mes:");
        mes = sc.nextInt();
        
        System.out.println("Introduzca año:");
        year = sc.nextInt();
        
            if(year == 0) {
                
                fechaCorrecta = false;
                
            } else {
                
                if(mes == 2 && (1 <= dia && dia <= 28)) {
                    
                    fechaCorrecta = true;
                    
                } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia >= 30)) {
                    
                    fechaCorrecta = true;
                    
                } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) {
                    
                    fechaCorrecta = true;
                    
                } else {
                    
                    fechaCorrecta = false;
                    
                }
                
            }
        
    }
    
    /* FUNCIONES     */
    
}
