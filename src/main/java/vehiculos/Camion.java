package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int totalCamion;

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getTotalCamion() {
		return totalCamion;
	}

	public static void setTotalCamion(int totalCamion) {
		Camion.totalCamion = totalCamion;
	}
	public Camion (String placa,int velocidadMaxima,String nombre,int precio,
			int peso,String traccion,Fabricante fabricante,int ejes) {
			super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
			this.setEjes(ejes);
			totalCamion++;
	}

}
