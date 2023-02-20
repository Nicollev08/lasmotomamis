
public class AreaCirculo implements IFiguraArea {
	
		
		//ATRIBUTOS
		private double pi;
		private double radio;
		
		//CONSTRCUTORES
		public AreaCirculo() {
			this.pi = 3.1416;
			this.radio = 8;
			
		}

	    //METODOS
		@Override
		public void area() {
			double resultado=0;
			resultado=this.pi*(this.radio*this.radio);
			System.out.println("El �rea es: "+ resultado);
		}

		@Override
		public String getSeleccion() {
			// TODO Auto-generated method stub
			return "Has seleccionado el c�rculo";
		}
}
