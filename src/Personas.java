
public class Personas{

//el nombre de las variables siempre va en minuscula.
public String nombre;
public String apellido;
public int edad;
//por lo tanto el Constructor tengo que agregarle el apuntador this para que no se confunda con las 
//otras variables

public Personas(String nombre, String apellido, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

public Personas() {
	super();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


	public String PresentarPersona(){
	
		return "Hola, soy " + nombre + " " + apellido + " de edad: " + edad;

}

//es mejor no declarar varialbles en el parametro de la funcion y el tipo de dato es mejor que sea un entero
//para a si porder operarlos dado que el return devuelve un numero y no una cadena.

	public int CalcularAñoNacimiento(int añoActual){

		añoActual =2018;
		int resultado= añoActual-edad;
			return  resultado;

}

}