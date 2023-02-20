package patrones_de_diseño;

public class sebas extends Persona{

	private estudiante varestudiante;
	private hijo varhijo;
	
	public sebas () {
		varestudiante= new estudiante();
	    varhijo= new hijo();
	}
	
	public void ir_a_clases() {
		varestudiante.ir_a_clases();
	}
	
	public void ayudar_en_casa(){
		varhijo.ayudar_en_casa();
	}
	
	
	
	
	
	
	
	
	
	
	
}
