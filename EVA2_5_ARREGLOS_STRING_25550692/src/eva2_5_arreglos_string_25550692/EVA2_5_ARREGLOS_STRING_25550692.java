/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_5_ARREGLOS_STRING_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner captu = new Scanner (System.in);
       int dia;
        String diasSemana[] = new String[7];
        diasSemana[0]="Domingo";
        diasSemana[1]="Lunes";
        diasSemana[2]="Martes";
        diasSemana[3]="Miercoles";
        diasSemana[4]="Jueves";
         diasSemana[5]="Viernes";
         diasSemana[6]="Sabado";
         System.out.println("Introduce un numero del 0 al 6:");
         dia = captu.nextInt();
         System.out.println("El dia es:" + diasSemana [dia]);
         
                 
    }
    
}
