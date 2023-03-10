package delegate;

public class Empleado implements ICodificadora,IDiseņadora{
    
    ICodificadora codificador;
    IDiseņadora diseņador;

    public Empleado(ICodificadora codificadora, IDiseņadora diseņadora) {
        this.codificador = codificadora;
        this.diseņador = diseņadora;
    }

    @Override
    public void codificar() {
        codificador.codificar();
    }

    @Override
    public void diseņar() {
        diseņador.diseņar();
    }   
}

