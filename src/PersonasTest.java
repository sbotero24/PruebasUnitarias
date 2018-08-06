import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonasTest {

	@Test
	public void PresentarPersonaTest() {
		String nombre = "Santiago";
		String apellido = " Botero";
		int edad = 26;
		Integer.toString(edad);
		String resultado = nombre+apellido+edad;
		String esperado= "Santiago"+" Botero"+ "26";
		assertEquals(esperado, resultado);
								
	}
	
	@Test
	public void PresentPersona() {
		String nombre = "Julian";
		String apellido = "Jaramillo";
		int edad = 33;
		Integer.toString(edad);
		String resultado = nombre+apellido+edad;
		String esperado= "Julian"+"Jaramillo"+ "33";
		assertEquals(esperado, resultado);
	}

		@Test
		public void CalcularAñoNacimientoTest() {
			int edad=26;
			int añoActual=2018;
 			if(edad>añoActual) {
 				System.out.println("Esta mal.");
				
			}else {
				
				System.out.println("Esta bien.");
				
			}
			
		}
		
			
}

