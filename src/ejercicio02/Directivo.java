package ejercicio02;

public class Directivo extends Empleado {

	/**
	 * Constructor vacío
	 */
	public Directivo() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	public String toString() {
		String nombreDirectivo = "";

		nombreDirectivo = super.toString() + " -> Directivo";

		return nombreDirectivo;
	}
}
