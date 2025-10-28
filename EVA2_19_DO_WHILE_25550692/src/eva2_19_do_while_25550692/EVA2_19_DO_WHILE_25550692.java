/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while_25550692;

import java.util.Scanner;

/**
 *
 * @author suzet
 */
public class EVA2_19_DO_WHILE_25550692 {

    /**
     * @param args the command line arguments
     */
   final static String usuario ="admin";
   final static String PWD ="admin";
    public static void main(String[] args) {
        // TODO code application logic here
        //pedimos datos de acceso
        Scanner captu = new Scanner (System.in);
        String usu, contra;
        //validamos
        //incorrecto ---> volver a preguntar
        //correcto---> acceso al sistema
      do{
        System.out.println("Usuario:");
        usu = captu.nextLine();
        System.out.println("Contraseña:");
        contra = captu.nextLine();
      }while(!(usu.equals(usuario) && contra.equals(PWD)));
       System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL SISTEMA");
      
        /*if(usu.equals(usuario) && contra.equals(PWD))
        //VALIDAR
        System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL SISTEMA");
        else
            System.out.println("ACCESO DENEGADO!!");*/
        
        
       
        
    }
    
}
