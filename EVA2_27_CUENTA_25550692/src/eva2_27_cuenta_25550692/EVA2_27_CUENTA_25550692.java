/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_27_CUENTA_25550692 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double saldo= 1000000;
        double retiro;
        
        System.out.println("Tú saldo inicial es: $" + saldo);
        
        while(saldo > 0){
            System.out.println("¿Cuánto deseas retirar?");
            retiro = input.nextDouble();
            
            saldo -= retiro;
            
            if(saldo > 0){
                System.out.println("Retiro exitoso. Su saldo restante es de: $" + saldo);
            }else if(saldo == 0){
                System.out.println("Tú cuenta se ha agotado. Saldo: $0");
            }else{
                System.out.println("Sú saldo está en número rojos. Has sobregirado tu cuenta en $" + (-saldo));
            }
        }
    }
    
}
