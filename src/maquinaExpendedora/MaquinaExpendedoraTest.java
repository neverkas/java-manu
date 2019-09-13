package maquinaExpendedora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaquinaExpendedoraTest {
	
	@Test
	void agregarMonedaTest() throws Exception {		
		MaquinaExpendedora maquina = new MaquinaExpendedora();
		Moneda moneda = new Moneda();
		boolean resultado = maquina.agregarMoneda(moneda);

		assertTrue(resultado);
	}
	
	@Test
	void retirarMonedaTest() throws Exception{		
		MaquinaExpendedora maquina = new MaquinaExpendedora();
		Moneda moneda = new Moneda();		

		maquina.agregarMoneda(moneda);
		
		Moneda resultado = maquina.retirarMoneda();
		boolean esMoneda = (resultado instanceof Moneda);
		
		assertTrue(esMoneda);
	}
	
	@Test
	void retirarPremio() throws Exception {
		MaquinaExpendedora maquina = new MaquinaExpendedora();
		Moneda moneda = new Moneda();		
		Premio premio = new Premio();

		maquina.agregarMoneda(moneda);
		maquina.agregarPremio(premio);
		
		boolean esPremio = (maquina.hayPremios() && maquina.retirarPremio() instanceof Premio);
		boolean resultado = (maquina.hayMonedas() && esPremio);
		
		assertTrue(resultado);
	}

}
