/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_progra1;

import java.util.Scanner;

/**
 *
 * @author Roy Martinez
 */
public class Martinez_Alisson_Clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("ingrese la cantidad de clics 1:"); 
        double clics1 = scanner.nextDouble();
        System.out.println("ingrese la cantidad de clics 2:");
        double clics2 = scanner.nextDouble();
        System.out.println("ingrese la cantidad de clics 3:");
        double clics3 = scanner.nextDouble();
        
        double total1 = (clics1 / 60)* 0.30;
        double total2 = (clics2 / 100) * 0.25;
        double total3 = (clics3/20) * 0.80;
        
        double total = total1+ total2 + total3;
        double totalisv = total*0.16;
        double total_completo = totalisv + total;
        
        System.out.println("su total es:" + total + "\nsu total con ISV%16 es:"+ total_completo);
    }
    
}
