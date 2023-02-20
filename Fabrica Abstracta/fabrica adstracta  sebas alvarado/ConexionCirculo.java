package metFactory;

public class ConexionCirculo implements IConexion{
	
private double Pi;
 private int R;
 
	public ConexionCirculo() {

	this.Pi =3.1416;
	this.R =6;
}

	@Override
	public void area() {
	int respt;
	
	respt = (int) this.Pi*(this.R*this.R);
System.out.println("area del circulo: "+respt);
	
	
		
	}


	
	
	
}
