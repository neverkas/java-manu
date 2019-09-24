package juegoEmbarcaciones.embarcacion.interfaces;

import java.util.LinkedList;

import juegoEmbarcaciones.carga.interfaces.Carga;

public interface Cargable {
	LinkedList<Carga> getCarga();
	void setCarga(Carga unaCarga);
}
