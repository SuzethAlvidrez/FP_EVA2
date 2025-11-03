/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_28_PRIMO_25550692 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int num, divisor = 0, i;
        
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        
        for(i = 1; i <= num; i++){
            if(num % i == 0){
            divisor++;
            }
        }
        
        if(divisor == 2){
            System.out.println(num + " es un número primo");
        }else{
            System.out.println(num + " no es un número primo");
        }
    }
    
}
