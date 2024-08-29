/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *
 *  Ejer 9  Los precios de la fruta no suelen ser constantes; varian según el mercado
 *          Se pide modificar el ejercicio anterior para que los precios no estén fijados
 *          y sea la aplicación quien los pidad al usuario
 * 
 * @author josejam
 */
public class Ejer_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double precioManzanas;
        double precioPeras;
        
        double ventT1Manz, ventT2Manz, ventT3Manz, ventT4Manz;
        double ventT1Peras, ventT2Peras, ventT3Peras, ventT4Peras;
        
        double imporTotalManz;
        double imporTotalPeras;
        
        System.out.println("Introduce el Precio/KG de las Manzanas");
        precioManzanas = sc.nextDouble();
        
        System.out.println("Introduce el Precio/KG de las Peras");
        precioPeras = sc.nextDouble();
        
        System.out.println("Introduce ventas T1 Manzanas");
        ventT1Manz = sc.nextInt(); 
        System.out.println("Introduce ventas T2 Manzanas");
        ventT2Manz = sc.nextInt();
        System.out.println("Introduce ventas T3 Manzanas");
        ventT3Manz = sc.nextInt();
        System.out.println("Introduce ventas T4 Manzanas");
        ventT4Manz = sc.nextInt();
        
        imporTotalManz = calcVentasTrimManzanas(ventT1Manz, precioManzanas);
        imporTotalManz += calcVentasTrimManzanas(ventT2Manz, precioManzanas);
        imporTotalManz += calcVentasTrimManzanas(ventT3Manz, precioManzanas);
        imporTotalManz += calcVentasTrimManzanas(ventT4Manz, precioManzanas);
        
        
        System.out.println("\n\nIntroduce ventas T1 Peras");
        ventT1Peras = sc.nextInt();
        System.out.println("Introduce ventas T2 Peras");
        ventT2Peras = sc.nextInt();
        System.out.println("Introduce ventas T3 Peras");
        ventT3Peras = sc.nextInt();
        System.out.println("Introduce ventas T4 Peras");
        ventT4Peras = sc.nextInt();
        
        imporTotalPeras = calcVentasTrimPeras(ventT1Peras, precioPeras);
        imporTotalPeras += calcVentasTrimPeras(ventT2Peras, precioPeras);
        imporTotalPeras += calcVentasTrimPeras(ventT3Peras, precioPeras);
        imporTotalPeras += calcVentasTrimPeras(ventT4Peras, precioPeras);
        
        System.out.println("\n\nBeneficios anuales Totales:\t" + (beneficiosTotales(imporTotalManz, imporTotalPeras)) +"\t€");
    } 
    
    /*  FUNCIONES  */
    public static double calcVentasTrimManzanas(double kiloManzanas, double precioM) {
        return (kiloManzanas *  precioM);
    }
    
    public static double calcVentasTrimPeras(double kiloPeras, double precioP) {
        return (kiloPeras * precioP);
    }
    
    public static double benefTotalesManzanas(double benefT1, double benefT2, double benefT3, double benefT4){
        return (benefT1 + benefT2 + benefT3 + benefT4);
    
    }
    
    public static double benefTotalesPeras(double benefT1, double benefT2, double benefT3, double benefT4){
        return (benefT1 + benefT2 + benefT3 + benefT4);
    }
    
    public static double beneficiosTotales(double benefTotalesM, double benefTotaleP){
        return (benefTotalesM + benefTotaleP);
    }
    
}
