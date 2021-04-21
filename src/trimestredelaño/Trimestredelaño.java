/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestredelaño;

import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Trimestredelaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner numMes = new Scanner(System.in);
    int num = 0;

    System.out.println("Considerando los meses del año, ingrese un número del 1 al 12: ");
    
    num = numMes.nextInt();
        
     if (num >0 && num <=12) {
         
         switch (num){
            case 1,2,3:
            System.out.println("Se encuentra en el primer trimestre");
            break;   
            case 4,5,6:
            System.out.println("Se encuentra en el segundo trimestre");
            break;
            case 7,8,9:
            System.out.println("Se encuentra en el Tercer trimestre");
            break;   
            case 10,11,12:
            System.out.println("Se encuentra en el Cuarto trimestre");
            break;
        }
    
    }else{
         
        System.out.println("El número que colocó no pertenece a ningún mes del año. Por favor ingrese un número del 1 al 12");
    }
    }
    
}
