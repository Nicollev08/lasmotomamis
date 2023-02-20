
public class AreaTriangulo implements IFigura {
	
	//ATRIBUTOS
	private double base;
	private double altura;
	
	//CONSTRCUTORES
	public AreaTriangulo() {
		this.base = 12;
		this.altura = 8;
		
	}

    //METODOS
	@Override
	public void area() {
		double resultado=0;
		resultado=(this.base*this.altura)/2;
		System.out.println("El área del triángulo es: "+ resultado);
	}
	
}

