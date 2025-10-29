/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue_25550692;

/**
 *
 * @author suzet
 */
public class EVA2_22_CONTINUE_25550692 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR NÚMEROS PARES
        int i = 0;
        while(i < 100){
            int residuo = i % 2;
            if(residuo != 0){//divisible entre 2(pares) !=omitir
                i++;
                continue;}
            
            System.out.print(i + " - ");
            i++;
        }
        
    }
    
}
