package juegoEmbarcaciones.embarcacion;

public class Balsa implements Embarcacion{
	private String nombre;
	
	public Balsa(String unNombre) {
		this.nombre = unNombre;
	}

	public String getNombre() {
		return this.nombre;
	}
}
