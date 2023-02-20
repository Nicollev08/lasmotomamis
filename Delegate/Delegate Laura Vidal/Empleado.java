package delegate;

public class Empleado implements ICodificadora,IDiseñadora{
    
    ICodificadora codificador;
    IDiseñadora diseñador;

    public Empleado(ICodificadora codificadora, IDiseñadora diseñadora) {
        this.codificador = codificadora;
        this.diseñador = diseñadora;
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

