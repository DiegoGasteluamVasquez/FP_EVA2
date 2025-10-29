/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA2_27_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adivina el número. -1 para terminar.");
           valor = captu.nextInt();
           if(valor == adivinar)
                System.out.println("ADIVINASTE!!!");
           else if(valor == -1){
               System.out.println("Gracias por jugar!!");
               break;//Termina la ejecucion del ciclo
           }else{
               System.out.println("NO ADIVINASTE :(");
           }
        }while(true);//CONDICION PARA REPETIR (true)
    }
    
}
