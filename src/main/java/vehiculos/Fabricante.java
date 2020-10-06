package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> marcas = new ArrayList<Fabricante>();
	private int totalMarca;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		marcas.add(this);
	}
	public static ArrayList<Fabricante> getMarcas() {
		return marcas;
	}
	public static void setMarcas(ArrayList<Fabricante> marcas) {
		Fabricante.marcas = marcas;
	}
	public int getTotalMarca() {
		return totalMarca;
	}
	public void setTotalMarca(int totalMarca) {
		this.totalMarca = totalMarca;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Collections.sort(marcas, new Comparator<Fabricante>() {
			   public int compare(Fabricante obj1, Fabricante obj2) {
			      return new Integer(obj2.getTotalMarca()).compareTo(obj1.getTotalMarca());
			   }
			});
		return marcas.get(0);
	}

}
