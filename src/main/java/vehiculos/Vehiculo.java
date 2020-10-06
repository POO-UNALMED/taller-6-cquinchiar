package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int totalVehiculo;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getTotalVehiculo() {
		return totalVehiculo;
	}
	public static void setTotalVehiculo(int totalVehiculo) {
		Vehiculo.totalVehiculo = totalVehiculo;
	}
	public Vehiculo (String placa, int puertas,int velocidadMaxima,String nombre,int precio,
			int peso,String traccion,Fabricante fabricante) {
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setTraccion(traccion);
		this.setFabricante(fabricante);
		totalVehiculo++;
		this.fabricante.getPais().setTotalPais(this.fabricante.getPais().getTotalPais()+1);
		this.fabricante.setTotalMarca(this.fabricante.getTotalMarca()+1);
	}
	public static int getCantidadVehiculos() {
		return totalVehiculo;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.totalVehiculo = cantidadVehiculos;
	}
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getTotalAutomovil()+"\n"+
				"Camionetas: "+Camioneta.getTotalCamioneta()+"\n"+
				"Camion: "+Camion.getTotalCamion();
	}
	

}
