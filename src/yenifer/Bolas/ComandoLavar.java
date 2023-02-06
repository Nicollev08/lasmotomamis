
package Bolas;




    public class ComandoLavar implements IComando {
    private Lavadora lv;
    public ComandoLavar(Lavadora pLv){
        this.lv = pLv;
    }

    @Override
    public void ejecutar() {
        lv.lavar();
    }  
}



    


