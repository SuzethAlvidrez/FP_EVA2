/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo_2550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_24_TRIANGULO_2550692 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
       int valor;
        System.out.println("Introduce un número:");
        valor = captu.nextInt();
        
         for(int i =1; i <= valor; i++){
         for(int j = 1; j<= i; j++){
             System.out.print("*");
         }
             System.out.println("");
         }
    }
    
}
