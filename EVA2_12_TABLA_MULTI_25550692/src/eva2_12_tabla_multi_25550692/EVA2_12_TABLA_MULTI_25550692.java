/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multi_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_12_TABLA_MULTI_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int tabla, resultado;
        System.out.println("Incerta un numero:");
        tabla = captu.nextInt();
         for(int i = 1; i <= 10; i++){
         resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
             
         }       
    }
    
}
