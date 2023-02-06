package patronesdediseño;

import java.util.Scanner;

public class Cliente {
	
	 private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion;
	       
        Interfaz operacion=null;
        do{
            opcion = Menu();
            
            switch(opcion){
                case 1:{
                    operacion= new SecadorEncender();
                    break;}
                case 2:{
                    operacion= new SecadorApagar();
                    break;}
                case 3:{
                    operacion= new SecadorTemperatura1();
                    break;}
                case 4:{
                    operacion= new SecardorTemperatura2();
                    break;}
            }
            
           
            
            if(opcion!=5){
               operacion.peso();
               
            }
            
          
        }while(opcion!=5);
        
       
    }
	
	public static int Menu(){
        int opcion = 0;
        in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Lavar");
            System.out.println("4. Centrifugar");
            System.out.println("5. Salir");
            opcion = in.nextInt();

            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, intente nuevamente");
                System.out.println(" ");
                
                }
        }while(opcion < 1 || opcion > 5);
        return opcion;
    

		
		
		
		
	}

}
