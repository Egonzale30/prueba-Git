/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Ejercicios {

    public static void main(String[] args) {
        tercerEjercicio();
    }
    
     public static void primerEjercicio() {
      //Calcular la media (promedio) de 5 números.
       Scanner lector = new Scanner(System.in);
      
         System.out.println("por favor digitar un numero");
         int n1= lector.nextInt();
         System.out.println("por favor digitar otro numero");
         int n2= lector.nextInt();
         System.out.println("por favor digitar otro numero");
         int n3= lector.nextInt();
         System.out.println("por favor digitar otro numero");
         int n4= lector.nextInt();
         System.out.println("por favor digitar otro numero");
         int n5= lector.nextInt();
         
         float prom= (n1+n2+n3+n4+n5)/5;
         
         System.out.println("el promedio es: "+prom);
         

// JOptionPane.showInputDialog( "por favor digitar un numero");
        
    }
 
     public static void segundoEjercicio() {
     //calcular el promedio final de la materia de algoritmos.
      Scanner prueba = new Scanner(System.in);
      
      
         System.out.println("por favor digite la nota del parcial");
         double m1= prueba.nextDouble();
         System.out.println("por favor digite la nota del parcial");
         double m2= prueba.nextDouble();
         System.out.println("por favor digite la nota del parcial");
         double m3= prueba.nextDouble();
         
        
         double promedio=(m1*0.55)+(m2*0.30)+(m3*0.15); 
         
         System.out.println("el promedio es: "+promedio);
          
     }
         
         
         public static void tercerEjercicio() {
         //sueldo mensual de un empleado tomando como datos de entrada: el nombre, horas trabajadas y el pago por hora.
          Scanner datos = new Scanner(System.in);
          
          
          System.out.println("por favor digite el nombre");
          String nombre = datos.next();
          System.out.println("por favor digite horas trabajadas"); 
          double horas= datos.nextDouble();
          System.out.println("por favor digite pago por horas");
          double PHoras= datos.nextDouble();
          
          
          double pago = horas*PHoras;
    }
          
          System.out.println("empleado"+nombre+ "el sueldo es" + pago);
          
          
          public static void cuartoEjercicio() {
          //Elaborar un algoritmo para determinar si un número es par o impar.
          Scanner lector = new Scanner(System.in);

          System.out.println("Digite un número:");
          int numero = lector.nextInt();

          if (numero % 2 == 0) {
          System.out.println("El número es PAR");
          } else {
          System.out.println("El número es IMPAR");
    

    }

          public static void quintoEjercicio() {

          Scanner lector = new Scanner(System.in);

          System.out.println("Digite el primer número:");
          int n1 = lector.nextInt();

          System.out.println("Digite el segundo número:");
          int n2 = lector.nextInt();

          System.out.println("Digite el tercer número:");
          int n3 = lector.nextInt();

          if (n1 == n2 + n3 || 
          n2 == n1 + n3 || 
          n3 == n1 + n2) {

          System.out.println("Uno de los números es la suma de los otros dos.");
          } else {
          System.out.println("Ninguno es la suma de los otros dos.");
    

    }
      
         
 }
     
    
   
            

   