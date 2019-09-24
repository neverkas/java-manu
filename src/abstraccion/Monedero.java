package abstraccion;
/*
 * Monedero<M>
 * agregar(M moneda)
 * cantidad(): int
 * 
 * Test de unidad
 * 1. Monedero vacio, retorne cero
 * 2. Agregar...
 * 2.1) 1 unavez retorne 1
 * 2.2) 2 veces retorne 2
 * 3. Monedero de pesos
 * 3.1)agregar
 * 3.2)agregar
 * 
 * Jugar
 * 1. Crear monederos de distintas monedas
 * 2.agregar monedas incorrectas
 * 3. crear monederos de strings
 */
// interfaz generica
public class Monedero<M>{
	int contador = 0;
	
	// agregar monedas incorrectas
	public void agregar(M moneda) {
		contador += 1;		
	}
	
	public int cantidad() {
		contador += 1;
		
		return contador;
	}	
	
	// crear monedero de distintas monedas
	public M crearMonedero() {
		M monedero = new M();
		return monedero;
	}
	
	
	
}
