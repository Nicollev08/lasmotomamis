package metFactory;

public class figura {

	public static void main(String[] args) {
	
		factory figurin = new factory();
		
		IConexion wawa = figurin.getConexion("cuadrado");
        wawa.area();
        
    	IConexion wawa2 = figurin.getConexion("triangulo");
        wawa2.area();
        
    	IConexion wawa3 = figurin.getConexion("circulo");
        wawa3.area();
	}

}
