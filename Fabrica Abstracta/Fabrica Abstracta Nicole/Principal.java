
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			 IFabrica miFabrica = (IFabrica) new FabricaFigura();
		        
		        miFabrica.crearFigura();
		        IFiguraArea miFigura = miFabrica.getFiguraArea();
		        
		        System.out.println(""+miFigura.getSeleccion());
		    }
	

}
