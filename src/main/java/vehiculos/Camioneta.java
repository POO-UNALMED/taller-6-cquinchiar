package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int totalCamioneta;

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getTotalCamioneta() {
		return totalCamioneta;
	}

	public static void setTotalCamioneta(int totalCamioneta) {
		Camioneta.totalCamioneta = totalCamioneta;
	}
	public Camioneta (String placa, int puertas,String nombre,int precio,
			int peso,Fabricante fabricante,Boolean volco) {
		super(placa, puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.setVolco(volco);
		totalCamioneta++;
	}

	

}
