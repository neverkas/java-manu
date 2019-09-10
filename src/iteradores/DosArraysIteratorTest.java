package iteradores;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DosArraysIteratorTest {
/*
 * precondicion->accion->postcondicion
 * dosArrayVacios
 * arrayVacio + [1,2]
 * [1,2] + arrayVacio
 * dosNull
 * null + [1,2]
 * [1,2] + null
 * [1,2] + [3,4]
 * null + vacio
 * vacio + null
 */
	@Test
	void DosArraysVacios() {		
		int [] array1 = {1,2};
		int [] array2 = {3,4};
		
		DosArraysIterator it = new DosArraysIterator(array1, array2);
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);			
		}
	}

}
