package juegoEmbarcaciones.embarcacion;

import java.util.LinkedList;

import juegoEmbarcaciones.carga.Carga;

public class Bote implements Embarcacion, Cargable{
	private String nombre;
	LinkedList<Carga> carga;
	
	public Bote(String unNombre, LinkedList<Carga> unaCarga) {
		this.nombre = unNombre;
		this.carga = unaCarga;
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
		// TODO Auto-generated method stub
		
	}
}
