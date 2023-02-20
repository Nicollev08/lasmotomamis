package delegate;

public class Empleado implements ICodificadora,IDise�adora{
    
    ICodificadora codificador;
    IDise�adora dise�ador;

    public Empleado(ICodificadora codificadora, IDise�adora dise�adora) {
        this.codificador = codificadora;
        this.dise�ador = dise�adora;
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

