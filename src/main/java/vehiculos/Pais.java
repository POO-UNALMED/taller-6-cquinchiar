package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int totalPais;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais (String nombre) {
		this.setNombre(nombre);
		paises.add(this);
	}
	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
	
	
	public int getTotalPais() {
		return totalPais;
	}

	public void setTotalPais(int totalPais) {
		this.totalPais = totalPais;
	}
	
	public static Pais paisMasVendedor() {
		Collections.sort(paises, new Comparator<Pais>() {
			   public int compare(Pais obj1, Pais obj2) {
			      return new Integer(obj2.getTotalPais()).compareTo(obj1.getTotalPais());
			   }
			});
		return paises.get(0);
		
	}
}
