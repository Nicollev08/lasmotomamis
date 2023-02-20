
public class AreaFigura {
	public IFigura getFigura(String figura) {
		if(figura.equalsIgnoreCase("C�rculo")) {
			return new AreaCirculo();
		}
		if(figura.equalsIgnoreCase("Cuadrado")) {
			return new AreaCuadrado();
		}
		if(figura.equalsIgnoreCase("Tri�ngulo")) {
			return new AreaTriangulo();
		}
		return null;
	}
}
