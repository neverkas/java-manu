package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import juegoEmbarcaciones.carga.*;
import juegoEmbarcaciones.embarcacion.*;
import juegoEmbarcaciones.Puerto;

class EmbarcacionTest {		
	@Test
	void unaCarabelaPuedeCargarTest() {
		// inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		// instancio la clase con el constructor		
		Carabela rebecca = new Carabela("Rebecca", carga);
		// si implementa la interfaz Cargable, puede cargar
		assert(rebecca instanceof Cargable);
	}
	
	@Test
	void unBotePuedeCargarTest() {
		// inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		// instancio la clase con el constructor		
		Bote solNaciente = new Bote("Sol Naciente", carga);
		// si implementa la interfaz Cargable, puede cargar
		assert(solNaciente instanceof Cargable);
	}
	
	@Test
	void unBoteNoPuedeCargarMasDeUnTipoTest(){
		// inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();

		// defino cada carga
		Oro primeraCargaDeOro = new Oro(100);
		Espadas primeraCargaDeEspadas = new Espadas(20);
		Oro segundaCargaDeOro = new Oro(100);		
		
		// agrego cada carga a la embarcación
		carga.add(primeraCargaDeOro);		
		carga.add(segundaCargaDeOro);
		carga.add(primeraCargaDeEspadas);
		
		// instancio la clase con el constructor		
		Bote solNaciente = new Bote("Sol Naciente", carga);
		
		//
		Puerto puertoDeBuenosAires = new Puerto("Puerto de Buenos Aires");
		
		//
		assert(puertoDeBuenosAires.boteCargaContrabando(solNaciente));
	}

	@Test
	void unBotecitoNoPuedeCargarTest() {
		// instancio la clase con el constructor		
		Botecito elDragonVolador = new Botecito("El Dragón Volador");
		// sino implementa la interfaz Cargable, no puede cargar
		assertFalse(elDragonVolador instanceof Cargable);
	}
	
	@Test
	void unaBalsaNoPuedeCargarTest() {
		// instancio la clase con el constructor		
		Balsa saintJames = new Balsa("Saint James");
		// sino implementa la interfaz Cargable, no puede cargar
		assertFalse(saintJames instanceof Cargable);
	}
	
	@Test
	void cargarCienDeOroTest() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);

		Oro primerCargaCostosa = new Oro(100);
		elRoyalFortune.carga.add(primerCargaCostosa);
		
		assertEquals("El Royal Fortune", elRoyalFortune.getNombre());
		assertEquals(100, elRoyalFortune.getCarga().getFirst().getCantidad());
	}
	
	@Test
	void agregarDosCargasDelMismoTipoTest() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);

		Oro primerCargaCostosa = new Oro(100);
		elRoyalFortune.carga.add(primerCargaCostosa);

		Espadas segundaCargaCostosa = new Espadas(200);
		elRoyalFortune.carga.add(segundaCargaCostosa);

		assertEquals(2, elRoyalFortune.getCarga().size());
	}

	@Test
	void agregarTresCargasDiferentesTest() {
		 // inicializo lista enlazada
		LinkedList<Carga> carga = new LinkedList<>();
		 // instancio la clase con el constructor
		Carabela elRoyalFortune = new Carabela("El Royal Fortune", carga);
		
		// defino cada carga
		Oro primerCargaCostosa = new Oro(100);
		Espadas segundaCargaCostosa = new Espadas(550);
		Azucar tercerCargaCostosa = new Azucar(100);
		
		// agrego cada carga a la embarcación
		elRoyalFortune.carga.add(primerCargaCostosa);
		elRoyalFortune.carga.add(segundaCargaCostosa);
		elRoyalFortune.carga.add(tercerCargaCostosa);

		assertEquals(3, elRoyalFortune.getCarga().size());
	}

}
