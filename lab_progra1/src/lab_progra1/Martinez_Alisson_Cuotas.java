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
public class Martinez_Alisson_Cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("ingrese precio inicial:");
        double precioini = scanner.nextDouble();
        
        System.out.println("ingrese interes:");
        double interes = scanner.nextDouble();
        
        System.out.println("ingrese comision:");
        double comision = scanner.nextDouble();
        
        System.out.println("ingrese el porcentage de seguro:");
        double seguro = scanner.nextDouble();
        
        System.out.println("ingrese plazo a meses:");
        double meses = scanner.nextDouble();
        
        double comision_total= comision/100;
        double calcular_comision = precioini*(comision_total);
        double calcular_seguro = seguro/100;
        double total_finansiar = calcular_comision + precioini + calcular_seguro;
        double interes_mensual= interes/100;
        double cuota_fija1 = (total_finansiar * interes_mensual);
        double cuota_fija2 = 1- Math.pow(1+comision_total , -meses);
        double cuota_total = Math.round(cuota_fija1 / cuota_fija2);
        
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: " + cuota_total +" HNL");
        System.out.println("Total a Pagar: " + cuota_total*meses +" HNL");
    }
    
}
