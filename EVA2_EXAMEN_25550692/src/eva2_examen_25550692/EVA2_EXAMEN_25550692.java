/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_EXAMEN_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner ( System. in);
        int pin, monto;
        int saldo= 5000;
        int calaculo;
        System.out.println( "Introduce tu pin:");
        pin = captu.nextInt();
        if (pin==1234){
            System.out.println( "1 Consultar saldo");
            System.out.println( "2 Retirar monto");
            System.out.println( "3 Depositar dinero");
            System.out.println( "Selecciona la operación");
            int opc = captu.nextInt();
            if(opc==1){
                System.out.println( "Tu saldo es de:" + saldo);
                 
        }else if(opc==2){
        System.out.println( "Cuanto vasa a retirar?");
         monto = captu.nextInt();
        if( monto <=saldo){
         calaculo= saldo - monto;
        System.out.println( "Tu saldo es de:" + calaculo);
         }else{
         System.out.println( "Monto mayor al saldo");
         }
        }else if(opc==3){
         System.out.println( "Cuanto vasa a depositar?");
         monto = captu.nextInt();
         if( monto>= 0){
                     calaculo= saldo + monto;
        }
        }else{
            
            System.out.println( "Pin incorrecto");
        
    }
    
}
    }
}
