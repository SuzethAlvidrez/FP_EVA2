/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_14_CAPTURA_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int tama;
        System.out.println("Cuantas calificaciones va a capturar?");
        tama = captu.nextInt();
        int califas[]  = new int[tama];
       //captura
        for(int i = 0; i < califas.length; i++){
            System.out.println("Calificación" + (i + 1)  + ":");
            califas[i] = captu.nextInt();
        }
        //leer
        for(int i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]");
           
        }
            
        
    }
    
}
