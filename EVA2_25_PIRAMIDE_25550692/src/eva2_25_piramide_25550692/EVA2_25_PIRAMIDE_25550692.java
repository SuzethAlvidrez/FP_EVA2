/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_piramide_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_25_PIRAMIDE_25550692 {

   
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =  new Scanner(System.in);
        int valor, i, j,a ,b;
        
        System.out.println("PIRAMIDE");
        System.out.println("Introduce un valor:");
        valor = input.nextInt();
        
        for(i = 1; i<= valor; i++){
            for(j = 1; j<= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(i = valor; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
