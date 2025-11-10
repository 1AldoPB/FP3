/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_paso_referencia;

/**
 *
 * @author aldop
 */
public class EVA3_5_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor[] = new int[1]; //NEW =---- OBJETOS
        valor[0]=5;
        System.out.println(valor);
        System.out.println("VALOR (ANTES) = " + valor[0]);
        incrementar(valor);
        System.out.println("VALOR (DESPUES) = " + valor[0]);
        
        
    }
    public static void incrementar(int[]val){
        System.out.println(val);
        for (int i = 0; i < val.length; i++) {
            val[i] = val[i] + 1;
            //val[i]++;
            
        }
    
    
    
    
    
    
    }
    
}
