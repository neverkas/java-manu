package maquinaExpendedora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaquinaExpendedora {

	MaquinaExpendedora maquina = new MaquinaExpendedora();
	
	@Test
	void agregarMonedaTest() throws Exception {		
		Moneda m = new Moneda();
		boolean r = maquina.agregarMoneda(m);

		assertEquals(true, r);
	}
	
	@Test
	void retirarMonedaTest() throws Exception {		
		Moneda m = new Moneda();		
		maquina.agregarMoneda(m);
		
		Moneda r = maquina.retirarMoneda();
		boolean esMoneda = (r instanceof Moneda);
		
		assertEquals(true, esMoneda);
	}
	
	@Test
	void retirarPremio() throws Exception {
		Moneda m = new Moneda();		
		maquina.agregarMoneda(m);
		
		boolean esPremio = (maquina.retirarPremio() instanceof Premio);
		
		boolean r = (maquina.hayPremios() && maquina.hayMonedas() && esPremio);
		
		assertEquals(true, r);
	}

}
