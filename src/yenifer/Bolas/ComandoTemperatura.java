
package Bolas;



  
    public class ComandoTemperatura implements IComando {
    private Lavadora lv;
    public ComandoTemperatura(Lavadora pLv){
        this.lv = pLv;
    }
    @Override
    public void ejecutar() {
        lv.Temperatura();
    }   
}

