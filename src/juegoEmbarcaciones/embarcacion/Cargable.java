package juegoEmbarcaciones.embarcacion;

import java.util.LinkedList;

import juegoEmbarcaciones.carga.Carga;

public interface Cargable {
	LinkedList<Carga> getCarga(); // lista enlazada
	
	void setCarga(Carga unaCarga);
}
