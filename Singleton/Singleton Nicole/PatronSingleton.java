
public class PatronSingleton {
	  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Constante constante = Constante.getInstance();
        System.out.println(constante);
        constante.setDatos("Iva", 0.16);
        System.out.println(constante);
        Constante constante2 = Constante.getInstance();
        System.out.println(constante2);
    }


}
