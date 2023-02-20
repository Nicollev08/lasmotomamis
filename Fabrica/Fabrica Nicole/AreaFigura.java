
public class AreaFigura {
	public IFigura getFigura(String figura) {
		if(figura.equalsIgnoreCase("Círculo")) {
			return new AreaCirculo();
		}
		if(figura.equalsIgnoreCase("Cuadrado")) {
			return new AreaCuadrado();
		}
		if(figura.equalsIgnoreCase("Triángulo")) {
			return new AreaTriangulo();
		}
		return null;
	}
}
