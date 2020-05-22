package Paquete;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empesarios	em = new Empesarios("Diego","Maldonado",43,187,85);
		
		System.out.println(em.getNombre());
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Katalina";
				
		Profesor  profe1  = new Profesor("Estadistica", "02");
				
		System.out.println(profe1.losdatos());
		
		System.out.println(persona1.nombre);
		
		
		
		
	}
	
	

}
