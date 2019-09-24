package juegoEmbarcaciones.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import juegoEmbarcaciones.carga.clases.*;
import juegoEmbarcaciones.carga.interfaces.Carga;
import juegoEmbarcaciones.embarcacion.clases.*;

class EmbarcacionTest {

	@Test
	void cargarCienDeOro() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);

		Oro primerCargaCostosa = new Oro(100);
		elRoyalFortune.carga.add(primerCargaCostosa);
		
		assertEquals(elRoyalFortune.getNombre(), "El Royal Fortune");
		assertEquals(elRoyalFortune.getCarga().getFirst().getCantidad(), 100);
	}
	
	@Test
	void agregarDosCargasDelMismoTipo() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);

		Oro primerCargaCostosa = new Oro(100);
		elRoyalFortune.carga.add(primerCargaCostosa);

		Espadas segundaCargaCostosa = new Espadas(200);
		elRoyalFortune.carga.add(segundaCargaCostosa);

		assertEquals(elRoyalFortune.getCarga().size(), 2);
	}
	
	@Test
	void agregarDosCargasDiferentes() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);

		Oro primerCargaCostosa = new Oro(100);
		elRoyalFortune.carga.add(primerCargaCostosa);

		Espadas segundaCargaCostosa = new Espadas(550);
		elRoyalFortune.carga.add(segundaCargaCostosa);

		assertEquals(elRoyalFortune.getCarga().size(), 2);
	}
	
	@Test
	void unBotecitoPuedeCargar() throws Exception {
		Botecito elDragonVolador = new Botecito("El Dragón Volador");
		
	    Throwable exception = assertThrows(Exception.class, () -> {
	    	elDragonVolador.puedeCargar();
	    });
	    assertEquals("No se puede cargar", exception.getMessage());
	}
	
	@Test
	void unaCarabelaPuedeCargar() throws Exception {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor		
		Carabela Rebecca = new Carabela("Rebecca", carga);
		
		assertTrue(Rebecca.puedeCargar());
	}

}
