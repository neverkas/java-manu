package juegoEmbarcaciones.embarcacion.clases;

import java.util.LinkedList;

import juegoEmbarcaciones.carga.interfaces.Carga;
import juegoEmbarcaciones.embarcacion.interfaces.Cargable;
import juegoEmbarcaciones.embarcacion.interfaces.Embarcacion;

public class Carabela implements Embarcacion, Cargable{
	private String nombre;
	public LinkedList<Carga> carga;
	
	public Carabela(String unNombre, LinkedList<Carga> algunasCargas) {
		this.nombre = unNombre;
		this.carga = algunasCargas;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public LinkedList<Carga> getCarga() {
		return this.carga;
	}
	
	@Override
	public void setCarga(Carga unaCarga) {		
	}

	@Override
	public boolean puedeCargar() throws Exception {
		if(!(this instanceof Cargable)) {
			throw new Exception("No se puede cargar");
		}
		
		return true;
	}
}
