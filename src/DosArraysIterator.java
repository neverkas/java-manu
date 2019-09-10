public class DosArraysIterator{
	int [] array1 = {};
	int numero;
	int contador = 0;
	
	
	public DosArraysIterator(int [] arr1, int [] arr2) {
		array1 = arr1;
		//array2 = arr2;
	}
	

	public boolean hasNext() {		
		while(contador < array1.length) {			
			
			contador +=1;
		}
		
		return false;
	}

	public int next() {
		return array1[contador];
	}
}
