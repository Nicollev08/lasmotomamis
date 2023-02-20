
public class MasaNormal implements IElementoMasa{
	    @Override
	    public void producir() {
	        System.out.println("Generando masa normal");
	    }
	    @Override
	    public String getDatos() {
	        return "Masa redonda regular";
	    }   
	}

	public class MasaQueso implements IElementoMasa{
	    @Override
	    public void producir() {
	        System.out.println("Generando masa con bordes de queso");
	    }
	    @Override
	    public String getDatos() {
	        return "Masa redonda regular con bordes de queso";
	    } 
	}

	public class SaborHawaiana implements IElementoSabor{
	    @Override
	    public void seleccion() {
	        System.out.println("Se seleccionó pizza Hawaiana");
	    }
	    @Override
	    public String getInformacion() {
	        return " con cebolla, pimentón, champiñon, piña y tomate";
	    } 
	}

	public class SaborAmericana implements IElementoSabor{

	    @Override
	    public void seleccion() {
	        System.out.println("Se seleccionó pizza Americana");
	    }
	    @Override
	    public String getInformacion() {
	        return " con maíz tierno y tocineta con un toque picante de pepperoni";
	    } 
	}


}
