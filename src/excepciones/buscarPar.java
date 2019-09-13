/*
 * Tareas a realizar:
 * -Retorna el primer numero par de numeros
 * -Si numeros está vacío, lanza IllegalArgumentException
 * -Si no existen numero par, lanza NoSuchElement
 * */
package excepciones;

import java.util.NoSuchElementException;

public class buscarPar {		
	public static void main(String[] args) {
		int [] numeros = {1,4,5,6};
		int numero;
		
		// guardo el numero par
		numero = primerNumeroPar(numeros);
		
		// imprimo por consola
		System.out.println(numero);
	}
	
	public static boolean esNumeroPar(int numero) {
		// comparamos si el número dividido 2 da como resto 0
		// si se cumple, entonces es par
		return numero % 2 == 0;
	}
	
	public static int primerNumeroPar(int [] numeros) {
		boolean hayNumeroPar = false;
		int contador = 0;		
		int numero, numeroPar = 0;
		
		// evaluamos si el array esta vacío
		if(numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException();
		}
		// analizamos la lista mientras se cumplan las condiciones
		// 1. mientras no se cumpla hayNumerosPar
		// 2. no se haya llegado hasta el último elemento del array
		while (!hayNumeroPar && contador < numeros.length) {
			// lo guardamos solo por estética
			numero = numeros[contador];
			// delegamos la tarea de evaluar si es par o no
			if(esNumeroPar(numero)) {
				// guardamos su valor
				numeroPar = numero;				
				// modificamos el centinela que detiene la iteración
				hayNumeroPar = true;
			}
								
			// incrementamos para acceder a los elementos del array por su indice
			contador += 1;
		}
		
		// sino se encontró lanzamos una excepción
		if(!hayNumeroPar) {
			throw new NoSuchElementException();
		}
		
		// como la función debe retornar un número entero
		// es lo que devolveremos
		return numeroPar;		
		
	}	
}