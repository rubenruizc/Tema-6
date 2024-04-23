package boletin2.ejercicio01;

public class Socio implements Comparable<Object> {

	/**
	 * Atributo donde guardaremos el id del socio
	 */
	private int id;

	/**
	 * Atributo donde guardaremos el nombre de socio
	 */
	private String nombre;

	/**
	 * Atributo donde guardaremos la edad del socio
	 */
	private int edad;

	/**
	 * Constructor con parámetros
	 * 
	 * @param id     Parámetro de id del socio
	 * @param nombre Parámetro del nombre del socio
	 * @param edad   Parámetro de la edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		super();

		if (id > 0) {
			this.id = id;
		}

		if (!nombre.equals("") && nombre != null) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}

	public String toString() {
		String info = "";

		info += "\nID: " + this.id;
		info += "\nNombre: " + this.nombre;
		info += "\nEdad: " + this.edad;
		return info;
	}

	@Override
	public int compareTo(Object o) {
		int resultado = 0;

		Socio soc = (Socio) o;

		if (this.id < soc.id) {
			resultado = -1;
		} else if (this.id > soc.id) {
			resultado = 1;

		}
		return resultado;
	}

}
