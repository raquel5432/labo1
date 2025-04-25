
package lab_progra1;

import java.util.Scanner;


public class Martinez_Alisson_Formulas {

    
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
 
         
         double resultadoA = (3.0 / 2.0) * (4.0 / 3.0);
         System.out.println("Resultado a): " + resultadoA);
 
         System.out.print("Ingrese el valor de x: ");
         double x = scanner.nextDouble();
         System.out.print("Ingrese el valor de y: ");
         double y = scanner.nextDouble();
         double resultadoB = (1 / (x - 5)) - (3 * y / 4);
         System.out.println("Resultado b): " + resultadoB);
 
         
         double resultadoC = (1.0 / 2.0) + 7;
         System.out.println("Resultado c): " + resultadoC);
 
        
         double resultadoD = 7 + (1.0 / 2.0);
         System.out.println("Resultado d): " + resultadoD);
 
        
         double resultadoE = (Math.pow(2, 2) / (3 - 1)) - ((4 - 5) / (6 - (2 * 3) / 2));
         System.out.println("Resultado e): " + resultadoE);
     }
     
 }
    
    

