package Paquete;

public class Profesor extends Persona {
	
	private String area;
	
	private String grupo;

	public Profesor(String area, String grupo)
	{
		super();  //Llamar constructor de la clase padre
		
		this.area = area;
		this.grupo = grupo;
			
	}
	
	public String losdatos() {
		
		return (" Este es un metodo dentro de una clase heredada " + area + " " + grupo);
	}

}
