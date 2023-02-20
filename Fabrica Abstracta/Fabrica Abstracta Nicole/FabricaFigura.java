import java.util.Scanner;

public class FabricaFigura implements IFabrica {
	
		private IFiguraArea figura;
		 private static Scanner in = new Scanner(System.in);

		    @Override
		    public void crearFigura() {
		        int opcion;
		        System.out.println("Áreas");
		        do{
		            System.out.println("Seleccione el área de una de las figuras: ");
		            System.out.println("1. Círculo");
		            System.out.println("2. Cuadrado");
		            System.out.println("3. Triángulo");
		            opcion = in.nextInt();
		        }while(opcion < 1 || opcion>3);
		        if(opcion==1)
		            figura = new AreaCirculo();
		        else if(opcion==2)
		            figura = new AreaCuadrado();
		        else
		        	figura = new AreaTriangulo();
		        
		       figura.area();
		    }
		        
		    @Override
		    public IFiguraArea getFiguraArea() {
		        return figura;
		    }
}
