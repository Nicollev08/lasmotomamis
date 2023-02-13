package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class articulosNavideños {
	

	public static void main(String[] args) {
		List<String>navidad=new ArrayList<String>();
		navidad.add("arbol");
		navidad.add("oso");
		navidad.add("gorritos");
		navidad.add("bolitas");
		navidad.add("pesebre");
		navidad.add("luces");
		navidad.add("polvora");
		
		
		
		int contador=0;
		System.out.println("vaneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee ");
		for(int i=0;i<navidad.size();i++) {

		if(navidad.get(i)=="pesebre"){


		System.out.println("encontre  "+navidad.get(i));

		}
		}

		System.out.println("alexanderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr es un perrp hp");
		for(int i=0;i<navidad.size();i++) {





			System.out.println(navidad.get(i)+"");


			contador=i;
			contador++;
			if(contador==6 ){


			navidad.add(6,"polvora");

			}


		}
		System.out.println("/");
	   
	}
}
