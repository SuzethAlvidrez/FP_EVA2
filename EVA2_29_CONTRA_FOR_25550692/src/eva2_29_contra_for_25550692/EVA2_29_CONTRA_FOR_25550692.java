/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for_25550692;

import java.util.Scanner;



/**
 *
 * @author suzet
 */
public class EVA2_29_CONTRA_FOR_25550692 {
 final static String usuario ="suzeth";
   final static String PWD ="1234";
     public static void main(String[] args) {
        // TODO code application logic here
       
        String usu, contra;
        int i;
         Scanner captu = new Scanner (System.in);
         for(i = 1; i<= 4; i++){
             System.out.println("Usuario:");
             usu = captu.nextLine();
             System.out.println("Contraseña:");
             contra = captu.nextLine();
             
             if(usu.equals(usuario)&& contra.equals(PWD)){
                 System.out.println("Acceso concedido");
                 break;
             }
         }
         
       
    }
    
}
