/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_2_SWITCH_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner captu = new Scanner (System.in);
       int opc;
        System.out.println("1 consultar saldo");
         System.out.println("2 retirara dinero");
          System.out.println("3 depositar dinero");
          System.out.println("Selecciona una opción del menu");
          opc = captu.nextInt();
         switch(opc){
             case 1:
                 System.out.println("Elegiste imprimir saldo!! ");
                 break;//Rompe o detiene el caso y el switch(instrucción)
             case 2:
                 System.out.println("Elegiste retirar saldo!!");
                 break;//fin del switch
             case 3:
                 System.out.println("Elegiste depositar saldo!!");
                 break;
             default://Opcional
                 System.out.println("Opción incorrecta");
        }
    
}}
