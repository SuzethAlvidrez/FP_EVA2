/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_26_FACTORIAL_25550692 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int num, factorial = 1, i;
        
        System.out.print("Ingrese un número: ");
        num = input.nextInt();
        
        System.out.print("El factorial de " + num + " es: ");
        for(i = num; i >= 1; i--){
            System.out.print(i);
            if(i > 1){
                System.out.print("*");
            }
            factorial *= i;
        }
            System.out.println("=" + factorial);
    }
    
}
