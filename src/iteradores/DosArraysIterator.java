package iteradores;

import java.util.Iterator;

public class DosArraysIterator implements Iterator<Object>{
	int [] array1, array2 = {};
	int elemento;	
	int indiceArray1, indiceArray2 = 0;
	int indiceActualArray1, indiceActualArray2 = 0;		
	
	public DosArraysIterator(int [] arr1, int [] arr2) {
		array1 = arr1;
		array2 = arr2;
	}	

	@Override // sobreescribimos la función original por una propia, con fines prácticos
	public boolean hasNext() {		
		// si los arrays son nulos (no apuntan a ninguna dirección en memoria ni ocupan espacio en memoria, no tienen datos)
		if(this.array1 == null || this.array2 == null) {
			// devolvemos una excepción porque no podriamos acceder a ningun elemento
			throw new NullPointerException();
		}
		
		// verificamos si el indice o posicion del elemento actual al que apuntan 
		// cada array no supere la longitud de ellos
		// sino se cumple no hay elementos que le sigan por ser los ultimos
		if(this.indiceActualArray1 > 0) {
			return this.indiceArray1 < this.array1.length;
		}
		else if(this.indiceActualArray2 > 0) {
			return this.indiceArray2 < this.array2.length;								
		}	
		
		return false;
	}

	@Override // sobreescribimos la función original por una propia, con fines prácticos
	public Object next() {
		// si el array es nulo (no apunta a ninguna dirección en memoria ni ocupa espacio en memoria, no tiene datos)
		if(this.array1 == null || this.array2 == null) {
			// devolvemos una excepción porque no podriamos acceder a ningun elemento
			throw new NullPointerException();
		}
		// en caso que el array esté tenga cero (vacío), uno o más elementos
		try {			
			// guardamos la posicion actual antes de apuntar al siguiente elemento de cada array
			this.indiceActualArray1 = this.indiceArray1;
			this.indiceActualArray2 = this.indiceArray2;
			// si el indice del elemento no supera la longitud del array
			if(this.indiceArray1 < this.array1.length) {
				// hago que el array apunte al siguiente elemento
				this.indiceArray1 += 1;				
				// guardo el valor que voy a devolver
				this.elemento = array1[indiceActualArray1];
			}
			// si el array1 no tiene mas elementos, evaluo el array2
			// utilizamos el mismo criterio que con el array1
			else if(this.indiceArray2 < this.array2.length) {
				this.indiceArray2 += 1;				
				
				this.elemento = array2[indiceActualArray2];
			}
			
			return this.elemento;
			
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException("El elemento no existe o el indice supera la longitud del array en cuestión");
		}					
	}
}
