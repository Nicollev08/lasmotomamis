package lavadora_David;

public class EstrategiaCalcular extends Lavadora_interface {
//atributos
	private int  PesoAgua;
	private int  NumPrendas;
	
	
	
	//constructor por defecto
	public EstrategiaCalcular() {
		super();
	
		this.PesoAgua = 0;
		this.NumPrendas = 0;
		
	}


	//constructor parametrizado

	public EstrategiaCalcular(int pesoAgua, int numPrendas) {
		super();
		this.PesoAgua = pesoAgua;
		this.NumPrendas = numPrendas;
	}
	
	
	//metodos de clase
	
	public int CalcularAgua () {
		
		if (this.PesoAgua != 0 || this.NumPrendas != 0 ) {
			
		}
		return this.NumPrendas * this.PesoAgua;
		
	}
	
	
	
	
	
	
	
}
