package javaapplication11;





	public class ComandoEnjuagar implements IComando {
	    private Lavadora lv;
	    public ComandoEnjuagar(Lavadora pLv){
	        this.lv = pLv;
	    }

	    @Override
	    public void ejecutar() {
	        lv.Enjuagar();
	    }  
	}

