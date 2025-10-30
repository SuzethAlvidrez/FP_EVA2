/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_23_BUSQUEDA_25550692 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner captu = new Scanner (System.in);
       int valor,posi = -1;
        int datos[] = new int[10];
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int)(Math.random()* 100);
        }
        for(int i = 0; i < datos.length; i++){
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor buscar:");
        valor = captu.nextInt();
        //BUSQUEDA LINEAL
         for(int i = 0; i < datos.length; i++){
         if(valor == datos[i]){//LO ENCONTRAMOS
            posi = i;//regresamos donde lo encontramos 
            break;//termina la busqueda
         }
         }
         System.out.println("Posición:" + posi);
    }
    
}
