package juegoEmbarcaciones.embarcacion;

public class Botecito implements Embarcacion{
	private String nombre;
	
	public Botecito(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
