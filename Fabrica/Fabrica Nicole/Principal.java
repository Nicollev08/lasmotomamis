
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaFigura figura = new AreaFigura();
		
		
		IFigura f1= figura.getFigura("C�rculo");
		f1.area();
	
		IFigura f2= figura.getFigura("Cuadrado");
		f2.area();
		
		IFigura f3= figura.getFigura("Tri�ngulo");
		f3.area();
	}

}
