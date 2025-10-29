/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_21_BREAK_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor, adivinar;
       adivinar = (int)(Math.random()* 5) + 1;//numeros entre el 1 y 5
        while(true){
            System.out.println("Adivina el numero. -1 para terminar");
            valor = captu.nextInt();
            if(valor == adivinar){
                System.out.println("Felicidades, adivinaste");
                break;
            }
            if(valor == -1)
                break;//romper el ciclo
        }
        System.out.println("Gracias por jugar");
    }
    
}
