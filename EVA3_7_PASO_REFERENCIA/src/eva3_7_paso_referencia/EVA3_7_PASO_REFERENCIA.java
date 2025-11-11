/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_referencia;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA3_7_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cliente[] =new String[5];
        double credito[] =new double[5];
        capturarClientes(cliente,credito);
        imprimir(cliente,credito);
        

    }
    public static void capturarClientes(String[] nombre,double[] credito){
    Scanner sc=new Scanner(System.in);
        for (int i = 0; i < credito.length; i++) {
            System.out.println("NOMBRE DE CLIENTE");
            nombre[i]=sc.nextLine();
            System.out.println("CREDITO DEL CLIENTE");
            credito[i]=sc.nextDouble();
            sc.nextLine();
          
        }
    
    
    }
    public static void imprimir(String[] nombre,double[] credito){
        for (int i = 0;  i < credito.length; i++) {
            System.out.println("NOMBRE: " + nombre[i] + " CREDITO: $" + credito[i]);
        }
    
    
    
    }
    
}
