package maquinaExpendedora;

import java.util.NoSuchElementException;
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
	Moneda moneda = new Moneda(); // creamos la moneda
	Premio premio = new Premio();
	boolean hayMoneda = false;
	
	public boolean agregarMoneda(Moneda m){				
		// si el argumento pasado es vacío
		if(m == null) {
			throw new NoSuchElementException("No ingresaste una moneda");
		}
		// si el objeto es tipo moneda
		else if(m instanceof Moneda) {
			hayMoneda = true;	// actualizamos que se ingresó una moneda			
		}
		 // sino ingresa algo del tipo Moneda
		else {
			throw new NoSuchElementException("No ingresaste una moneda");
		}
		
		return hayMoneda; // devolvemos el estado
	}
	
	public Moneda retirarMoneda() {
		 // si ingresaron alguna moneda
		if(hayMoneda) {
			 // devolvemos el objeto
			return moneda;
		}
		// sino ingresaron monedas
		else {
			throw new NoSuchElementException("No hay monedas");						
		}		
	}
	
	public Premio retirarPremio() {
		return premio;
	}
}
