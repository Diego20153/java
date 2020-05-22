package Paquete;

public class Persona {
	
	// Variables -- Atributos de la clase.
	
	String nombre;
	String apellido;
	int edad;
	int altura;
	int peso;
	
	// Constructor de la clase.
	
	
	public Persona() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.altura = 0;
		this.peso = 0;
	}
	
	public Persona(String nombre, String apellido, int edad, int altura, int peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	// Getters y setters.
	
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
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	// Metodos de la clase
	
	public int dias() {
		
		return this.edad * 365;
		
	}
	

}


class Empesarios extends Persona {
	
	// Constructor  en cascada, sube a la superclase
	public Empesarios(String nom, String ape, int eda, int alt, int pes) {
		
		super(nom, ape, eda, alt, pes);
	}
	
	// Setter
	public void EstableceCargo(String c) {
		
		cargo = c;
	}
	
	// Getter - y a la vez es sobreescribindo un metodo de la superclase, le agrego algo mas
	public String getNombre() {
		
		String nombre = super.getNombre();
		this.cargo ="Gerente";
		
		return nombre + " " + cargo;
	}
	
	// Nueva variable o atributo
	private String cargo;
}
