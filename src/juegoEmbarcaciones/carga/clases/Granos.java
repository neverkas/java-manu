package juegoEmbarcaciones.carga.clases;

import juegoEmbarcaciones.carga.interfaces.Carga;
import juegoEmbarcaciones.carga.interfaces.Pesable;

public class Granos implements Pesable, Carga{
	public long cantidad;
	
	public Granos(long unaCantidad) { // constructor
		this.cantidad = unaCantidad;
	}
	
	@Override
	public long getCantidad() { // getter
		return this.cantidad;
	}
}
