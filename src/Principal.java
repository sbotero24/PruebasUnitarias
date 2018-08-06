import java.util.Scanner;

public class Principal {
	
	

	public static void main(String[] args) {
	
	Scanner datos = new Scanner(System.in);	
	System.out.println("cual es tu nombre:");
	String nombre = datos.nextLine();
	System.out.println("Cual es tu apellido:");
	String apellido= datos.nextLine();
	System.out.println("de edad:");
	int edad=datos.nextInt();
		
		Personas personas = new Personas(nombre,apellido,edad);
		System.out.println(personas.PresentarPersona());
		System.out.println("Año de Nacimiento:\n");
		System.out.println(personas.CalcularAñoNacimiento(2018));
		
	}

}
