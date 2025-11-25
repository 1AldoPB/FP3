/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int opcion;
  do {
        imprimirMenu();
        opcion = sc.nextInt();

        if (opcion == 1) {
            calcularAreaT();
        } else if (opcion == 2) {
            calcularAreaC();
        } else if (opcion == 3) {
            calcularAreaTR();
        } else if (opcion == 4) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opción no válida. Intente nuevamente.");
        }

    } while (opcion != 4);
}
   public static void imprimirMenu(){
       System.out.println("BIENVENIDO AL SISTEMA");
       System.out.println("1. CALCULAR AREA DEL TRIANGULO");
       System.out.println("2. CALCULAR AREA DEL CIRCULO");
       System.out.println("3. CALCULAR AREA DEL TRAPECIO");
       System.out.println("4. SALIR DEL SISTEMA");
       
   
   
   } 
   public static void calcularAreaT(){
           Scanner sc =new Scanner (System.in);
           double B,A,R;
           System.out.println();
           System.out.println("CAPTURA LA BASE");
           B=sc.nextDouble();
           System.out.println("CAPTURA LA ALTURA");
           A=sc.nextDouble();
           R=(B * A)/2;
           System.out.println("SU RESULTADO ES: " + R);
   
   
   }
   public static void  calcularAreaC(){
       Scanner sc =new Scanner (System.in);
       double R,P,r;
       System.out.println("CAPTURE EL RADIO");
       R=sc.nextDouble();
       P=3.1416;
       r=P*(R*R);
       System.out.println("EL AREA DEL CIRCULO ES: " + r);
   
   
   
   
   
   
   }
   public static void calcularAreaTR(){
   Scanner sc =new Scanner(System.in);
   double b,m,h,r;
       System.out.println("INGRESE LA BASE MAYOR");
       b=sc.nextDouble();
       System.out.println("INGRESE LA BASE MENOR");
        m=sc.nextDouble();
       System.out.println("INGRESE LA ALTURA");
        h=sc.nextDouble();
        r=(b+m) *(h) /2;
        System.out.println("EL AREA ES: " + r);
   
   
   
   }
}

