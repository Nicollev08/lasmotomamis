
public class ClaseCodificadora implements ICodificadora{
	
	@Override
    public void codificar() {
        System.out.println("Codificacion por la clase codificadora");
    } 
}

public class ClaseDisenadora implements IDisenadora{
    @Override
    public void disenar() {
        System.out.println("Diseñado por clase Diseñadora");
    }  



}
