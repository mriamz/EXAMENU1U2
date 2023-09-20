/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen0102;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura =new Scanner (System.in);
        double ganacia, total1,total2,total3,ganancia1,ganancia2,ganancia3;
       final double instumento1=1250.45;
       final double instumento2=3743.00;
       final double instumento3=2683.78;
        System.out.println("ingrese el nombre del instrumento 1");
        String insto1 = lectura.nextLine();
        System.out.println("ingrese precio de compra ");
        double precio =lectura.nextDouble();
        lectura.nextLine();
        System.out.println("ingrese el nombre del instrumento 2 ");
         String insto2 = lectura.nextLine();
         System.out.println("ingrese precio de compra");
         double precio2 =lectura.nextDouble();
         lectura.nextLine();
         System.out.println("ingrese el nombre del instrumento 3 ");
         String insto3 = lectura.nextLine();
         System.out.println("ingrese precio de compra");
         double precio3 =lectura.nextDouble();
         
         ganancia1=instumento1-precio;
         ganancia2=instumento2-precio2;
          ganancia3=instumento3-precio3;
          total1 =(ganancia1/precio)*100;
          total2 =(ganancia2/precio2)*100;
          total3 =(ganancia3/precio3)*100;
          
          System.out.println("******************************************************************");
         System.out.println("el porcentaje de ganancia de "+insto1+"  es  "+total1);
         System.out.println("el porcentaje de ganancia de "+insto2+"  es  "+total2);
         System.out.println("el porcentaje de ganancia de "+insto3+"  es  "+total3);
          System.out.println("******************************************************************");
         
          
        
        
    }
    
}
