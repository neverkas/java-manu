package abstraccion;

public class prueba{
	public void usandoPesos() {
		Moneda peso = new Lecop(); // mal "perdido de informacion, porque no se sabe lo que tenes"
		
		Peso peso2 = new Peso(); // no se puede porque peso es una clase abstracta		
		Lecop lecop = new Lecop(); // puedo apesar que hereda de una clase abstracta

		Euro euro = new Euro();
	}
}
