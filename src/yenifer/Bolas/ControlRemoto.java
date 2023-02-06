
package Bolas;





    public class ControlRemoto { 
    private IComando[] comandos = new IComando[4]; 
    public ControlRemoto(Lavadora pLv){
        comandos[0] = new ComandoTemperatura(pLv);
        comandos[1] = new ComandoEnjuagar(pLv);
        comandos[2] = new ComandoLavar(pLv);
        comandos[3] = new ComandoSecar(pLv);
        
    } 
    public void SeleccionControl(int pIndice){
        comandos[pIndice].ejecutar();
    }   
}

