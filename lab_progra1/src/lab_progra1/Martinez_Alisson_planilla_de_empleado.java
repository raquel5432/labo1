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
public class Martinez_Alisson_planilla_de_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     System.out.println("favor ingresar nombre del empleado:");
    String nombre = scanner.next();
    System.out.println("favor ingresar horas trabajadas en el mes");
    int horas = scanner.nextInt();
    System.out.println("favor ingresar tarifa");
    int tarifa = scanner.nextInt();
    
    System.out.println("----- Boleta del Empleado -------");   
    System.out.println("Su nombre es:"+ nombre);
    System.out.println("Sus horas trabajadas son:"+ horas);
    System.out.println("Su tarifa es:"+ tarifa); 
    int salario = horas*tarifa;
    System.out.println("Su salario semanal seria:" + salario/4 + " semanal");
    }
    
}
