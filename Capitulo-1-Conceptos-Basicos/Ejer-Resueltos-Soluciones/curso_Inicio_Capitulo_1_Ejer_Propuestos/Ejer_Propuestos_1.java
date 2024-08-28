/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_Inicio_Capitulo_1_Ejer_Propuestos;

import java.util.Scanner;

/**
 *
 *  Ejer 1 Propuestos   Un economista nos ha encargado un programa para realizar
 *                      cálculos con el IVA, la aplicación debe solicitar la base
 *                      imponible y el IVA a aplicar, debemos mostrar en pantalla
 *                      el importe correspondiente al IVA y el Total
 * 
 * @author josejam
 */
public class Ejer_Propuestos_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        /*  Tipos IVA 21% 10% 4%  */
        final double TIPO_IVA_GENERAL = 0.21;           //  21     tipo int
        final double TIPO_IVA_REDUCIDO = 0.1;           //  10     tipo int
        final double TIPO_IVA_SUP_REDUCIDO = 0.04;      //   4     tipo int
        
        Scanner sc = new Scanner(System.in);
        
        double baseImp;
        int tipoIva;
        double impIVA;
        double impTotal;
        
        System.out.println("Introduce la Base Imponible");
        baseImp = sc.nextDouble();
        
        System.out.println("\n\nTipos IVA [21, 10, 4] Introduce uno de ellos:");
//        tipoIva = sc.nextInt();
        
            if((tipoIva = sc.nextInt()) == 4) { 
//            if(tipoIva == 4) { 
                impIVA = calcIVA(baseImp, TIPO_IVA_SUP_REDUCIDO);
                impTotal = precioMasIVA(baseImp, TIPO_IVA_SUP_REDUCIDO);
                
            } else if(tipoIva == 10) { 
                impIVA = calcIVA(baseImp, TIPO_IVA_REDUCIDO);
                impTotal = precioMasIVA(baseImp, TIPO_IVA_REDUCIDO);
                
            } else { 
                
                if(tipoIva == 21) { 
                    impIVA = calcIVA(baseImp, TIPO_IVA_GENERAL);
                    impTotal = precioMasIVA(baseImp, TIPO_IVA_GENERAL);
                } else{ 
                    
                    System.err.println("NO SE PUEDE CALCULAR EL IVA"); 
                    return; 
                } 
            }
        
        System.out.println("Calculamos el IVA y el Total Precio Final\n\n");
        System.out.println("Total IVA\t\t" + impIVA + " €");
        System.out.println("Total Importe + IVA\t" + impTotal + " €");
    }
    
    /*  FUNCIONES  */
    
    public static double calcIVA(double baseImp, int tipoIVA) {
        return (baseImp * (tipoIVA / 100));
    }
    
    public static double precioMasIVA(double baseImp, int tipoIVA) {
        return (baseImp * ((tipoIVA / 100) + 1));
    }
    
    public static double calcIVA(double baseImp, double tipoIVA) {
        return (baseImp * tipoIVA);
    }
    
    public static double precioMasIVA(double baseImp, double tipoIVA) {
        return (baseImp * (tipoIVA + 1));
    }
}
