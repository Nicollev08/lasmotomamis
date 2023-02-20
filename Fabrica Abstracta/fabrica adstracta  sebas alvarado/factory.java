package metFactory;

public class factory {
public IConexion getConexion(String motor) {
		
		
		if (motor.equalsIgnoreCase("cuadrado")) {
			return new ConexionCuadrado();
		
		} else if (motor.equalsIgnoreCase("circulo")) {
			return new ConexionCirculo();
		} else if (motor.equalsIgnoreCase("triangulo")) {
			return new ConexionTriangulo();
		}

		return null;
	}

}
