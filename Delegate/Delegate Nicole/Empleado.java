
public class Empleado implements ICodificadora,IDiseñadora {
	

	ICodificadora codificador;
    IDiseñadora diseñador;

    public Empleado(ICodificadora codificador, IDiseñadora diseñador) {
        this.codificador = codificador;
        this.diseñador = diseñador;
    }

	@Override
    public void codificar() {
        codificador.codificar();
    }

    @Override
    public void diseñar() {
        diseñador.diseñar();
    }   

}
