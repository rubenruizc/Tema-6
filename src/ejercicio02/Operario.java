package ejercicio02;

public class Operario extends Empleado {
	/**
	 * Constructor vacío
	 */
	public Operario() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	public String toString() {
		String nombreOperario = "";

		nombreOperario = super.toString() + " -> Operario";

		return nombreOperario;
	}
}
