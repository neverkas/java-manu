package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import juegoEmbarcaciones.Puerto;
import juegoEmbarcaciones.carga.*;
import juegoEmbarcaciones.embarcacion.*;

class PuertoTest {

	@Test
	void agregarUnaEmbarcacionTest() {
		Puerto puertoDeSantos = new Puerto("Puerto de Santos");
		
		LinkedList<Carga> cargaDelTheFancy = new LinkedList();
		cargaDelTheFancy.add(new Oro(100));
		cargaDelTheFancy.add(new Espadas(300));
				
		Carabela theFancy = new Carabela("The fancy", cargaDelTheFancy);
		
		puertoDeSantos.agregarEmbarcacion(theFancy);
		
		assertEquals(1, puertoDeSantos.listarEmbarcaciones().size());
	}
	
	@Test
	void agregarTresEmbarcacionesTest() {
		Puerto puertoDeCartagena = new Puerto("Puerto de Cartagena");
		
		LinkedList<Carga> cargaDelTheFancy = new LinkedList();
		cargaDelTheFancy.add(new Oro(100));
		cargaDelTheFancy.add(new Espadas(300));
				
		Carabela theFancy = new Carabela("The fancy", cargaDelTheFancy);
		
		LinkedList<Carga> cargaDelAmity = new LinkedList();
		cargaDelAmity.add(new Oro(100));
		cargaDelAmity.add(new Espadas(300));
		Carabela amity = new Carabela("Amity", cargaDelAmity);

		LinkedList<Carga> cargaDelRosePink = new LinkedList();
		cargaDelRosePink.add(new Oro(100));
		cargaDelRosePink.add(new Espadas(300));
				
		Carabela rosePink = new Carabela("Rose Pink", cargaDelRosePink);

		puertoDeCartagena.agregarEmbarcacion(theFancy);
		puertoDeCartagena.agregarEmbarcacion(amity);
		puertoDeCartagena.agregarEmbarcacion(rosePink);
		
		assertEquals(3, puertoDeCartagena.listarEmbarcaciones().size());
		
	}

}
