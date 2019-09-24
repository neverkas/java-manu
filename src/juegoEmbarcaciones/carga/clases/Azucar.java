package juegoEmbarcaciones.carga.clases;

import juegoEmbarcaciones.carga.interfaces.Carga;
import juegoEmbarcaciones.carga.interfaces.Pesable;

public class Azucar implements Pesable, Carga{
	public long cantidad;
	
	public Azucar(long unaCantidad) { // constructor
		this.cantidad = unaCantidad;
	}
	
	@Override
	public long getCantidad() { // getter
		return this.cantidad;
	}
}
