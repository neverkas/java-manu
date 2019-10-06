package juegoEmbarcaciones.embarcacion;

import java.util.LinkedList;

import juegoEmbarcaciones.carga.Carga;

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
}
