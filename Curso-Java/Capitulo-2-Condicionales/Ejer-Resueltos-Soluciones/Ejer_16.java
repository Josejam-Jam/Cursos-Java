/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package curso_inicio_capitulo_2;

import java.util.Scanner;

/**
 *
 * Ejer 16 Solicitar un número comprendido entre 1 y 99
 *          El program debe mostrarlo escrito
 *          Por ejemplo, para 56 mostrar: "cicuenta y seis"
 * 
 * @author josejam
 */
public class Ejer_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        String numLetra = "";
        
        System.out.println("Pedimos un número y lo mostramos en letras\n");
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
            if(num <= 10 && num <= 15) {
                switch (num) {
                    case 10:
                        numLetra += "diez";
                        break;
                    case 11:
                        numLetra += "once";
                        break;
                    case 12:
                        numLetra += "doce";
                        break;
                    case 13:
                        numLetra += "trece";
                        break;
                    case 14:
                        numLetra += "catorce";
                        break;
                    case 15:
                        numLetra += "quince";
                        break;
                }
            } else {
                int unid, dec;
                
                unid = getUnidades(num);
                dec  = getDecenas(num);
                
                switch(dec) {
                    case 0:
                        numLetra += "";
                        break;
                    case 1:
                        numLetra += "dieci";
                        break;
                    case 2:
                        numLetra += "veinte";
                        break;
                    case 3:
                        numLetra += "treinta";
                        break;
                    case 4:
                        numLetra += "cuarenta";
                        break;
                    case 5:
                        numLetra += "cicuenta";
                        break;
                    case 6:
                        numLetra += "sesenta";
                        break;
                    case 7:
                        numLetra += "setenta";
                        break;
                    case 8:
                        numLetra += "ochenta";
                        break;
                    case 9:
                        numLetra += "noventa";
                        break;

                }
                
                if(dec != 0 && dec != 1) {
                    numLetra += " y ";
                }
                
                switch(unid) {
                    case 0:
                        numLetra += "cero";
                        break;
                    case 1:
                        numLetra += "uno";
                        break;
                    case 2:
                        numLetra += "dos";
                        break;
                    case 3:
                        numLetra += "tres";
                        break;
                    case 4:
                        numLetra += "cuatro";
                        break;
                    case 5:
                        numLetra += "cinco";
                        break;
                    case 6:
                        numLetra += "seis";
                        break;
                    case 7:
                        numLetra += "siete";
                        break;
                    case 8:
                        numLetra += "ocho";
                        break;
                    case 9:
                        numLetra += "nueve";
                        break;
                }
                
            }
            
        System.out.println("\n" + numLetra);   
        
        System.out.println("");
    }
    
    /* FUNCIONES    */
    
    public static int getUnidades(int num) {
        
        return (num % 10);
        
    }
    
    public static int getDecenas(int num) {
        
        return (num / 10);
        
    }
    
}
