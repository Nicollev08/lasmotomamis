
public class Empleado implements ICodificadora,IDise�adora {
	

	ICodificadora codificador;
    IDise�adora dise�ador;

    public Empleado(ICodificadora codificador, IDise�adora dise�ador) {
        this.codificador = codificador;
        this.dise�ador = dise�ador;
    }

	@Override
    public void codificar() {
        codificador.codificar();
    }

    @Override
    public void dise�ar() {
        dise�ador.dise�ar();
    }   

}
