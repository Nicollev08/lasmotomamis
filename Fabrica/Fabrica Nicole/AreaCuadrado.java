
public class AreaCuadrado implements IFigura {

	//ATRIBUTOS
	private double base;
	private double altura;
	
	//CONSTRCUTORES
	public AreaCuadrado() {
		this.base = 12;
		this.altura = 8;
	}

    //METODOS
	@Override
	public void area() {
		double resultado=0;
		resultado=this.base*this.altura;
		System.out.println("El área del cuadrado es: "+ resultado);
	}
	
}
