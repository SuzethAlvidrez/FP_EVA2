/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_11_FOR_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int ini, fin, resi;
        System.out.println("Inicio:");
        ini = captu.nextInt();
         System.out.println("Fin:");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
            resi =i % 2;//saber si es par
            if( resi == 0)// es par
            System.out.println(i + "-");//dentro del if
            //una instruccion no es nesario poner llaves pero si es mas de una si se requiere
        }
    }
    
}
