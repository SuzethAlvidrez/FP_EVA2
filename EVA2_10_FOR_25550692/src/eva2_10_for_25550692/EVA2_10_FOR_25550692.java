/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_10_FOR_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR NUMERO DEL 1 AL 20
      
         for(int i = 1; i = <= 20; i++)
            System.out.print(i + "-");
        
        //numeros del 1 al 100
        for(int i = 0; i = <= 100; i+=2)
            System.out.print(i + "-");
        System.out.println("");
        //el anterior en inverso
        for(int i = 100; i = >= 0; i-=2)
         System.out.print(i + "-");
        //imprimir lista de numeros entre cualquier valor
        System.out.println("Con que numero quieres iniciar?");
        int rep1;
        System.out.println("Con que numero quieres terminar?");
       int rep2;
       Scanner captu = new Scanner (System.in);
       rep1= captu.nextInt();
       rep2= captu.nextInt();
       for(int i = rep1; i <= rep2; i++){}
           
    }
    
}

