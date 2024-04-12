package boletin1.ejercicio02;

public class Oficial extends Operario {

	/**
	 * Constructor vacío
	 */
	public Oficial() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	public String toString() {

		String nombreTecnico = "";

		nombreTecnico = super.toString() + " -> Oficial";

		return nombreTecnico;
	}
}
