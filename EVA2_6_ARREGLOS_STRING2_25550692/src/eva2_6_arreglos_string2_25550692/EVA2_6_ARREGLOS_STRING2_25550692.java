/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string2_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_6_ARREGLOS_STRING2_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
       int dia;
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado"};
        System.out.println("Introduce un numero del 0 al 6:");
         dia = captu.nextInt();
         System.out.println("El dia es:" + diasSemana [dia]);
        
    }
    
}
