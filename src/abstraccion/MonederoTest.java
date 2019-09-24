package abstraccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clasesdeclases.Peso;

class MonederoTest {

	@Test
	// 1. monedero vacio retorne cero
	void MonederoVacio() {
		Monedero<Peso> monedero = new Monedero<Peso>();
		
		assertEquals(0, monedero.cantidad());
	}
	
	@Test
	// 2.1 agregar una vez retorne 1
	void agregarUnaVez() {
		Monedero<Moneda> monedero = new Monedero<Moneda>();
		
		Moneda moneda = new Patacon();
		monedero.agregar(moneda);
		
		assertEquals(1, monedero.cantidad());
	}

	@Test
	// 2.2 agregar dos veces retorne 2
	void agregarDosVeces() {
		Peso moneda = new Peso();
		Monedero<Peso> monedero = new Monedero<Peso>();
		
		monedero.agregar(moneda);
		monedero.agregar(moneda);
		
		assertEquals(2, monedero.cantidad());
	}
	
	@Test
	void agregarLecop() {
		Monedero<Peso> monedero = new Monedero<Peso>();
		
	}

}