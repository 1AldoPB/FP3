/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion =sc.nextInt();
            if(opcion ==1){
            }else if (opcion ==2);{
            
            
            }
        }while(opcion !=3);

    }
   public static void imprimirMenu(){
       System.out.println("BIENVENIDO AL SISTEMA");
       System.out.println("1. CALCULAR UNA POTENCIA");
       
       System.out.println("2. SUMAR 2 NUMEROS");
       System.out.println("3. SALIR DEL SISTEMA");
       
   
   
   } 
   public static void calcularPotencia(){
           Scanner sc =new Scanner (System.in);
           int base,exp;
           System.out.println("**********CALCULO DE UNA POTENCIA****************");
           System.out.println("CAPTURA LA BASE");
           base=sc.nextInt();
           System.out.println("**********CALCULA EL EXPONENTE");
           exp=sc.nextInt();
           
           
   
   
   }
}
