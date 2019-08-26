/*
 * 1. retorna el primer numero par de numeros
 * 2. Si numeros está vacío, lanza IllegalArgumentException
 * 3. Si no existen numero par, lanza NoSuchElement
 * */
package errores;

import java.util.NoSuchElementException;

public class buscarPar {	
	
	public static void main(String[] args) {
		int numeros[] = {};
		
		buscarPar(numeros);
	}
	
	public static int buscarPar(int[] numeros) {
		boolean hayNumeroPar = false;
		int primerNumeroPar = 0;
		int contador = 0;		
		
		// 1. evaluamos si el vector está vacío
		if(numeros.length == 0) throw new IllegalArgumentException();									
		
		// 2. evaluamos los numeros pares
		while (!hayNumeroPar && contador < numeros.length) {
			if(numeros[contador] % 2 == 0) {
				primerNumeroPar = numeros[contador];					
				hayNumeroPar = true;
			}
								
			contador++;
		}	
		
		// 3. sino hay numeros pares
		if(!hayNumeroPar) throw new NoSuchElementException();
		
		return primerNumeroPar;
		
	}
	
}
