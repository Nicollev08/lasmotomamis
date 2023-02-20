package singleton;

public class Conexion {
	
	
		private static Conexion instancia;
		
		private Conexion() {
			
		}
		
	
		public static Conexion getInstancia() {
			if(instancia == null) {
				instancia = new Conexion();
			}
			return instancia;
		}
		
		
		public void conectar() {
			System.out.println("Me conecté ");
		}
		
	
		public void desconectar() {
			System.out.println("Me desconecté ");
		}


		public static Conexion getInstancia1() {
			// TODO Auto-generated method stub
			return null;
		}


		public void conectar1() {
			// TODO Auto-generated method stub
			
		}


}
