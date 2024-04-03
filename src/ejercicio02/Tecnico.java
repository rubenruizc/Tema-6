package ejercicio02;

public class Tecnico extends Operario {
	
	/**
	 * Constructor vacío
	 */
	public Tecnico() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		
		String nombreTecnico = "";

		nombreTecnico = super.toString() + " -> Técnico";

		return nombreTecnico;
	}
}
