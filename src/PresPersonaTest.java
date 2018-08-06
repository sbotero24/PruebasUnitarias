import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PresPersonaTest {
	
	Personas personas= new Personas("Santiago","Botero",26);
	
		
	@Test
	public void CalcularA�oTest() {
		
		int resultado = personas.CalcularA�oNacimiento(2018);
		int esperado = 1992;
		assertEquals(esperado,resultado);
			
	}
	
	
	@Test
	public void ValidarA�oTest() {
		int actual = 2018;
		int resultado = personas.CalcularA�oNacimiento(2018);
		if(resultado>=actual) {
			assertTrue(2018<personas.CalcularA�oNacimiento(2018));
			System.out.println("El resultado es: "+personas.CalcularA�oNacimiento(resultado)+ " tu fecha no puede ser mayor a la fecha acutal");
		}else {
			assertTrue(2018>personas.CalcularA�oNacimiento(2018));
			System.out.println("El resultado es: "+personas.CalcularA�oNacimiento(resultado)+" y tu fecha es menor a el a�o actual");
		}
	
	}
	
	
	@Test
	public void PresPersonasTest() {
		
		String esperado ="Hola, soy Santiago Botero de edad: " + 26;
		assertEquals(esperado,personas.PresentarPersona());
				
	}
	

}
