package iteradores;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DosArraysIteratorTest {
	@Test
	void DosArraysVacios() {		
		int[] array1 = {};
		int[] array2 = {};
		
		DosArraysIterator it = new DosArraysIterator(array1, array2);
		
		assertFalse(it.hasNext());
	}
	
	@Test
	void soloPrimerArrayVacio() {
		int[] array1 = {};
		int[] array2 = {1, 3};
		
		DosArraysIterator it = new DosArraysIterator(array1, array2);

		assertFalse(it.hasNext()); // 1er array -> no tiene elementos, está vacío		
		assertEquals(1, it.next()); // 2do array -> 1er elemento debe ser 1
		assertTrue(it.hasNext()); // 2do array -> no deberia haber mas elementos		
		assertEquals(3, it.next()); // 2do array -> 2do elemento debe ser 3
	}

}