/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_Capitulo_1;

import java.util.Scanner;

/**
 *
 *  Ejer 8  Un frutero nedesita calcular los beneficios anuales que obtiene de la
 *          venta de manzanas y peras
 *          Por ese motivo, es necesario diseñar una aplicación que solicite las
 *          ventas (en kilos) de cada trimestre para cada fruta
 *          La aplicación mostrará el importe total sabiendo que el precio
 *          del kilo de manzanas está fijado en 2.35 € y el kilo de peras
 *          está fijado en 1.95 €
 * 
 * @author josejam
 */
public class Ejer_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;
        
        double ventT1Manz, ventT2Manz, ventT3Manz, ventT4Manz;
        double ventT1Peras, ventT2Peras, ventT3Peras, ventT4Peras;
        
        double imporTotalManz;
        double imporTotalPeras;
        
        System.out.println("Introduce ventas T1 Manzanas");
        ventT1Manz = sc.nextInt(); 
        System.out.println("Introduce ventas T2 Manzanas");
        ventT2Manz = sc.nextInt();
        System.out.println("Introduce ventas T3 Manzanas");
        ventT3Manz = sc.nextInt();
        System.out.println("Introduce ventas T4 Manzanas");
        ventT4Manz = sc.nextInt();
        
        imporTotalManz = calcVentasTrimManzanas(ventT1Manz, PRECIO_MANZANAS);
        imporTotalManz += calcVentasTrimManzanas(ventT2Manz, PRECIO_MANZANAS);
        imporTotalManz += calcVentasTrimManzanas(ventT3Manz, PRECIO_MANZANAS);
        imporTotalManz += calcVentasTrimManzanas(ventT4Manz, PRECIO_MANZANAS);
        
        System.out.println("\n\nIntroduce ventas T1 Peras");
        ventT1Peras = sc.nextInt();
        System.out.println("Introduce ventas T2 Peras");
        ventT2Peras = sc.nextInt();
        System.out.println("Introduce ventas T3 Peras");
        ventT3Peras = sc.nextInt();
        System.out.println("Introduce ventas T4 Peras");
        ventT4Peras = sc.nextInt();
        
        imporTotalPeras = calcVentasTrimPeras(ventT1Peras, PRECIO_PERAS);
        imporTotalPeras += calcVentasTrimPeras(ventT2Peras, PRECIO_PERAS);
        imporTotalPeras += calcVentasTrimPeras(ventT3Peras, PRECIO_PERAS);
        imporTotalPeras += calcVentasTrimPeras(ventT4Peras, PRECIO_PERAS);
        
        System.out.println("\n\nBeneficios anuales Totales:\t" + (beneficiosTotales(imporTotalManz, imporTotalPeras)) +"\t€");
        
    }
    
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
