package delegate;

public class PatronDelegate {

	public static void main(String[] args) {
        Empleado objEmpleado = new Empleado(new ClaseCodificadora(),new ClaseDiseñadora());
        objEmpleado.codificar();
        objEmpleado.diseñar();
    }
    
}

