package juegoEmbarcaciones.carga.clases;

import juegoEmbarcaciones.carga.interfaces.Carga;
import juegoEmbarcaciones.carga.interfaces.Contable;

public class Oro implements Contable, Carga{
	public long cantidad;
	
	public Oro(long unaCantidad) { // constructor
		this.cantidad = unaCantidad;
	}
	
	@Override
	public long getCantidad() { // getter
		return this.cantidad;
	}
	
}
