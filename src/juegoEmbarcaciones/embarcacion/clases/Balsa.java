package juegoEmbarcaciones.embarcacion.clases;

import juegoEmbarcaciones.embarcacion.interfaces.Cargable;
import juegoEmbarcaciones.embarcacion.interfaces.Embarcacion;

public class Balsa implements Embarcacion{
	private String nombre;
	
	public Balsa(String unNombre) {
		this.nombre = unNombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public boolean puedeCargar() throws Exception {
		if(!(this instanceof Cargable)) {
			throw new Exception("No se puede cargar");
		}
		
		return true;
	}
}
