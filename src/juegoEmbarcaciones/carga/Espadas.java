package juegoEmbarcaciones.carga;

public class Espadas implements Contable, Carga{
	public long cantidad;
	
	public Espadas(long unaCantidad) { // constructor
		this.cantidad = unaCantidad;
	}
	
	@Override
	public long getCantidad() { // getter
		return this.cantidad;
	}
}
