/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_for_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_9_FOR_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++){
            System.out.println(mensaje);}
        
    }

}
