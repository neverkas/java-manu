package maquinaExpendedora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaquinaExpendedora {

	MaquinaExpendedora maquina = new MaquinaExpendedora();
	Moneda m = new Moneda();
	Premio p = new Premio();
	
	@Test
	void agregarMonedaTest() {		
		boolean r = maquina.agregarMoneda(m);

		assertEquals(true, r);
	}
	
	@Test
	void retirarMonedaTest() {		
		maquina.agregarMoneda(m);
		Moneda r = maquina.retirarMoneda();
		boolean esMoneda = (r instanceof Moneda);
		
		assertEquals(true, esMoneda);
	}
	
	@Test
	void retirarPremio() {
		boolean r1 = maquina.agregarMoneda(m);
		Premio r2 = maquina.retirarPremio();
		boolean esPremio = (r2 instanceof Premio && r1 == true);
		
		assertEquals(true, esPremio);
	}

}
