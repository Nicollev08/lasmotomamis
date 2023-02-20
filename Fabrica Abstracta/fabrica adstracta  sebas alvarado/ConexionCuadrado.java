package metFactory;

public class ConexionCuadrado implements IConexion{
	
private int l1;
private int l2;
	
	public ConexionCuadrado() {
	
	this.l1 =4;
	this.l2 =5;
}



	@Override
	public void area() {
	int respt;
	
	respt=this.l1*this.l2;
System.out.println("area del cuadrado: "+respt);
	
	
		
	}

	

	
}

