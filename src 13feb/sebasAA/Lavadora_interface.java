package lavadora_David;

public class Lavadora_interface {

public static void main(String[] args) {

		
	EstrategiaRemojo lav= new EstrategiaRemojo ();
	lav.EstrategiaRemojo1();
	
	
	EstrategiaLavado lava= new EstrategiaLavado ();
	lava.EstrategiaLavado1();
	
	
	EstrategiaCentrifugado lavad= new EstrategiaCentrifugado ();
	lavad.EstrategiaCentrifugado1();
	
	
	EstrategiaSecado lavado= new EstrategiaSecado ();
	lavado.EstrategiaSecado1();
	
	
	EstrategiaCalcular lavador = new EstrategiaCalcular (7,8);
	System.out.println("el agua nesesaria para lavar es : "+lavador.CalcularAgua());
	
	
	}
}