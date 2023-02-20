package metFactory;


	public class ConexionTriangulo implements IConexion{
private int B;
private int A;

		public ConexionTriangulo() {
	
	this.B =6;
	this.A = 7;
}

		@Override
		public void area() {
		int respt;
		respt = this.B*this.A;
	System.out.println("area del triangulo: "+respt);
		
		
			
		}

		

		
	}

