
package javaapplication11;

import java.util.Scanner;

public class Lavadora {
public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora();
        
        ControlRemoto controlRemoto = new ControlRemoto(lavadora);
        
        int opcion;
        do{
            opcion = Menu();
            if(opcion != 5){
                controlRemoto.SeleccionControl(opcion-1);


   }
            
        }while(opcion!=5);
        
    }
    public static int Menu(){
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. elige para medir temperatura");
            System.out.println("2. elige para  enjuagar");
            System.out.println("3. elige para lavar");
            System.out.println("4. elige para secar");
            
            opcion = in.nextInt();
            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, netnte nuevamente");
            }
        }while(opcion < 1 || opcion > 5);
        return opcion;
    }
    
public void Enjuagar(){
        System.out.println("Lavadora enjuagando!");
    }
    public void Temperatura(){
        System.out.println("Lavadora midiendo temperatura!");
    }
   
    public void lavar(){
        System.out.println("Lavadora lavando!");
    }
    public void secar(){
        System.out.println("Lavadora secando!");
    }


}
