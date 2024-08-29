/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *
 *  Ejer Propuesto 6    Diseñar una aplicación que solicite al usuario que 
 *                      introduzca una cantidad de segundos
 * 
 *                      La aplicación debe mostrar cuántas horas, minutos y segundos
 *                      hay en el número de segundos introducidos por el usuario
 * 
 * @author josejam
 */
public class Ejer_Propuestos_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        final int INTERVALO_MIN = 60;
        final int INTERVALO_HORAS = 3600;
        
        int horas, min, seg;
        int segUsuario;
        
        System.out.println("Calculamos la cantidad de [ H : min : seg ] introducidos por teclado\n");
        
        System.out.println("Introduce la cantidad Total de Segundos");
        segUsuario = sc.nextInt();
        
        /*  Calculamos la cantidad total de segundos pasada a [ HTotales : minTotales : segTotales ]  */
        
            if(segUsuario > 0) {
                
                double resto = segUsuario % INTERVALO_HORAS;
                    
                horas = calcTotalEnHoras(segUsuario, INTERVALO_HORAS);

                min = calcMinutos(resto);

                seg = segUsuario % INTERVALO_MIN;

                System.out.println("Resultado :\t" + horas + " : " + min + " : " + seg);
                
            }
        
        
        /*
            if(segUsuario > 0) {
                
                if(segUsuario % INTERVALO_HORAS == 0 && segUsuario % INTERVALO_MIN == 0){
                    horas = calcTotalEnHoras(segUsuario, INTERVALO_HORAS);
                    min = 0;
                    seg = 0;
                    
                } else if(segUsuario % INTERVALO_HORAS != 0 && segUsuario % INTERVALO_MIN == 0) {
                    horas = 0;
                    min = calcTotalEnMinutos(segUsuario, INTERVALO_MIN);
                    seg = 0;
                } else {
                    
                    double resto = segUsuario % INTERVALO_HORAS;
                    
                    horas = calcTotalEnHoras(segUsuario, INTERVALO_HORAS);

                    min = calcMinutos(resto);
                    
                    seg = segUsuario % INTERVALO_MIN;
                    
                }
               
                System.out.println("Resultado :\t" + horas + " : " + min + " : " + seg);
                
            }
        */
        
            if(segUsuario == 0 || segUsuario < 0) {
                String salida = "";
                if(segUsuario == 0) { salida = "Valor introducido 0 seg:\t" + "0 horas : 0 min : 0 seg "; }
                
                if(segUsuario < 0) { salida = "Valor introducido es NEGATIVO seg:\t NO SE PUEDE VOLVER ATRÁS EN EL TIEMPO"; }
                
                System.out.println(salida);
            }
        
    }
    
    /*  FUNCIONES  */
    
    public static int calcHoras(double min) {

        return (int)(min / 60);
    }
    
    public static int calcTotalEnHoras(int seg, int INTERVALO_HORAS) {

        return ((int) (seg / INTERVALO_HORAS));

    }
    
    public static int calcMinutos(double min) {

        return (int) (min / 60);
    }
    
    public static int calcTotalEnMinutos(int seg, int INTERVALO_MIN) {

        return ((int) (seg / INTERVALO_MIN));
    }
    
    public static int calcSegundos(double seg) {

        return ((int) seg * 60);
    }
    
    public static int calcTotalEnSegundos(int seg, int INTERVALO_MIN) {

        return ((int) seg % INTERVALO_MIN);
    }
    
}
