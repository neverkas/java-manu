package maquinaExpendedora;

import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * MaquinaExpendedora (3 premios)
 * 
 * Mensajes:
 * 
 * 1. agregar(Moneda m): Bool
 * throws NoHayMonedaExcepcion(cuando la moneda es null)
 * 
 * 2. retirarMoneda(): Moneda
 * throws NoHayMonedaExcepction (cuando no tiene monedas)
 * 
 * 3. retirarPremio(): Premio
 * throws NoHayPremiosException (cuando no hay premios disponibles)
 * throws NoHayMOnedaException (cuando no hay monedas en la maquina)
 * 
 * Estados:
 * 
 * 1. hayMoneda
 * 2. cantidadDeMonedas
 * 3. cantidadDePremios
 */

public class MaquinaExpendedora {
	boolean hayMoneda = false;
	
	Moneda monedas [] = new Moneda[10];
	Premio premios [] = new Premio[10];

	ArrayList<Moneda> monedasLista = new ArrayList<Moneda>(Arrays.asList(monedas));
	ArrayList<Premio> premiosLista = new ArrayList<Premio>(Arrays.asList(premios));

	// Excepciones
	Exception noHayMonedaException = new NoSuchElementException("No hay moneda");
	Exception noHayPremioException = new NoSuchElementException("No hay premios");

	public boolean hayMonedas() {		
		return (!monedasLista.isEmpty());
	}
	
	public boolean agregarMoneda() throws Exception{				
		// si el argumento pasado es vacío
		if(m == null) {
			throw noHayMonedaException;
		}
		// si el objeto es tipo moneda
		else if(m instanceof Moneda) {
			// la agregamos a la lista
			monedasLista.add(m);
		}
		 // sino ingresa algo del tipo Moneda
		else {
			throw noHayMonedaException;
		}
		
		return hayMonedas(); // devolvemos el estado
	}
	
	public Moneda retirarMoneda() throws Exception {
		 // si ingresaron alguna moneda
		if(hayMonedas()) {
			 // devolvemos el objeto
			Moneda moneda = new Moneda(); // creamos la moneda
			return moneda;
		}
		// sino ingresaron monedas
		else {
			throw noHayMonedaException;						
		}		
	}
	
	public boolean hayPremios() {
		return (!premiosLista.isEmpty());
	}
	
	public Premio retirarPremio() throws Exception {
		// si hay premios
		if(hayPremios()) {			
			Premio premio = premiosLista.get(0);
			
			return premio;			
		}
		// sino hay premios
		else {
			throw noHayPremioException;
		}
		
	}
}
