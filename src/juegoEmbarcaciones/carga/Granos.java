package juegoEmbarcaciones.carga;

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
