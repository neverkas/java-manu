package juegoEmbarcaciones;

import juegoEmbarcaciones.carga.Carga;
import juegoEmbarcaciones.embarcacion.Bote;

import java.util.Set;
import java.util.HashSet;
import java.util.ListIterator;

public class Puerto {
	public boolean boteCargaContrabando(Bote unBote) {		
		
		boolean hayCargaIlegal = false;
		ListIterator<Carga> listaDeCarga = unBote.getCarga().listIterator(0);				
		Set<Object> nuevaListaDeCarga = new HashSet<>();
		
		// recorro la lista de carga mientras se cumplan ambas condiciones:
		// 1. haya elementos
		// 2. no haya ninguna carga ilegal
		while(listaDeCarga.hasNext() && !hayCargaIlegal) {
			// guardo el tipo de la carga
			Object carga = listaDeCarga.next().getClass();
			
			// evaluo si no se repite la carga
			if(!nuevaListaDeCarga.add(carga)) {
				// doy aviso a seguridad
				hayCargaIlegal = true;
			}
		}
		
		return hayCargaIlegal;
	}
}
