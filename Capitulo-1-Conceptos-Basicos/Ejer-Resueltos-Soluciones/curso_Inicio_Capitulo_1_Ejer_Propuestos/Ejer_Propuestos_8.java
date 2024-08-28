/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *
 * Ejer Propuestos 8    Un biólogo está realizando un estudio de distintas especies
 *                      de invertebrados y necesita una aplicación que le ayude a 
 *                      contabilizar el número de patas que tienen en total todos
 *                      los animales capturados durante  una jornada de trabajo
 * 
 * 
 *                      Para ello, nos ha solicitado que escribamos una aplicación
 *                      a la que hay que proporcionar:
 * 
 * 
 *                          * el número de hormigas capturadas (6 patas)
 *                          * el número de arañas capturadas (8 patas)
 *                          * el número de cochinillas capturadas (14 patas)
 * 
 * 
 *                      La aplicación debe mostrar el número total de patas
 *                      que poseen todos los animales.
 * 
 * @author josejam
 */
public class Ejer_Propuestos_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int cantHorm, cantA, cantCoch;
        int totalPatas;
        
        System.out.println("Mostramos la cantidad de Patas de invertebrados capturados\n");
        
        System.out.println("Introduce la cantidad de Hormigas capturadas");
        cantHorm = sc.nextInt();
        
        System.out.println("Introduce la cantidad de Arañas capturadas");
        cantA = sc.nextInt();
        
        System.out.println("Introduce la cantidad de Cochinillas capturadas");
        cantCoch = sc.nextInt();
        
        totalPatas = (calcTotalPatasHormigas(cantHorm) + calcTotalPatasSpiders(cantA) + calcTotalPatasCochinillas(cantCoch));
        
        System.out.println("\n\nTotal de patas:\t" + totalPatas);
        
    }
    
    /*  FUNCIONES    */
    
    public static int calcTotalPatasSpiders(int cantA){
        
        return (cantA * 8);
    }
    
    public static int calcTotalPatasHormigas(int cantHor){
        
        return (cantHor * 6);
    }
    
    public static int calcTotalPatasCochinillas(int cantCoch){
        
        return (cantCoch * 14);
    }
    
    public static int calcTotalPatasAll(int cantPA, int cantPHor, int cantPCoch) {
        
        return (cantPA + cantPHor + cantPCoch);
    }
    
}
