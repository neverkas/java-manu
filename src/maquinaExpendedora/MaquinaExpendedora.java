package maquinaExpendedora;

import java.util.NoSuchElementException;
import java.util.ArrayList;
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
	
	ArrayList<Moneda> monedas = new ArrayList<Moneda>();
	ArrayList<Premio> premios = new ArrayList<Premio>();

	public boolean hayMonedas() {		
		return !monedas.isEmpty();
	}
	
	public boolean agregarMoneda(Moneda m) throws Exception{				
		// si el argumento es null (no tiene informacion)
		if(m == null) {
			throw new NoSuchElementException("No hay moneda");					
		}
		// si es tipo moneda
		else if(m instanceof Moneda) {
			// la agregamos a la lista de monedas
			monedas.add(m);
			
			return true;
		}
		// sino ingresa algo del tipo Moneda
		else {
			throw new NoSuchElementException("No hay moneda");
		}
	}
	
	public Moneda retirarMoneda() throws Exception {
		 // si ingresaron alguna moneda
		if(hayMonedas()){						
			 // devolvemos el objeto
			Moneda moneda = monedas.get(0);
			monedas.remove(moneda);
			
			return moneda;
		}
		// sino ingresaron monedas
		else {
			throw new NoSuchElementException("No hay moneda");
		}		
	}
	
	public boolean hayPremios() {
		return !premios.isEmpty();
	}
	
	public boolean agregarPremio(Premio premio) throws Exception{				
		// si el argumento es null (no tiene informacion)
		if(premio == null) {
			throw new NoSuchElementException("No hay premio");					
		}
		// si es tipo premio
		else if(premio instanceof Premio) {
			// la agregamos a la lista de monedas
			premios.add(premio);
			
			return true;
		}
		// sino ingresa algo del tipo Premio
		else {
			throw new NoSuchElementException("No hay premio");			
		}		
	}
	
	public Premio retirarPremio() throws Exception {
		// si hay premios
		if(hayPremios()) {			
			Premio premio = premios.get(0);
			premios.remove(premio);
			
			return premio;			
		}
		// sino hay premios
		else {			
			throw new NoSuchElementException("No hay premios");
		}
		
	}
}