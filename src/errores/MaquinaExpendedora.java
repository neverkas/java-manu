package errores;

import java.util.NoSuchElementException;
import java.util.Scanner;
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
		if(m == null) { // sino ingresa una moneda
			throw new NoSuchElementException("No ingresaste una moneda");
		}
		
		else if(m instanceof Moneda) {
			hayMoneda = true;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Moneda retirarMoneda() {
		if(hayMoneda) {
			return moneda;				
		}
		else {
			throw new NoSuchElementException("No hay monedas");
		}
			
	}
	
	public Premio retirarPremio() {
		return premio;
	}
}
