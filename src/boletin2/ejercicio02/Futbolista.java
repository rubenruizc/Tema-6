package boletin2.ejercicio02;

public class Futbolista implements Comparable<Futbolista> {

	/**
	 * Atributo que almacena el dorsal del jugador
	 */
	private int dorsal;

	/**
	 * Atributo que almacena el nombre del jugador
	 */
	private String nombre = "";

	/**
	 * Atributo que almacena la edad del jugador
	 */
	private int edad;

	/**
	 * Atributo que almacena el número de goles del jugador
	 */
	private int goles;

	/**
	 * Constructor con los parámetros dorsal, nombre, edad y goles
	 * 
	 * @param dorsal Dorsal del jugador
	 * @param nombre Nombre del jugador
	 * @param edad   Edad del jugador
	 * @param goles  Goles del jugador
	 */
	public Futbolista(int dorsal, String nombre, int edad, int goles) {
		// Comprobamos que el dorsal sea mayor que 0
		if (dorsal > 0 && dorsal <= 99) {
			this.dorsal = dorsal;
		}

		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Comprobamos que la edad sea mayor que 0
		if (edad > 0) {
			this.edad = edad;
		}

		// Comprobamos que el número de goles sea al menos de 0
		if (goles >= 0) {
			this.goles = goles;
		}
	}

	/**
	 * Método que devuelve la información del futbolista
	 * 
	 * @return Devuelve la información del futbolista
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información
		String info = "";

		// Almacenamos la información
		info = "\nNombre: " + this.nombre;
		info += "\nEdad: " + this.edad;
		info += "\nGoles: " + this.goles;
		info += "\nDorsal: " + this.dorsal;

		// Devolvemos la información
		return info;
	}

	/**
	 * Método que devuelve si los objetos son iguales
	 * 
	 * @return Devuelve si los objetos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		// Variable que almacena si son iguales
		boolean sonIguales = false;

		// Creamos un nuevo objeto Futbolista
		Futbolista futbolista = (Futbolista) obj;

		// Comparamos los objetos
		if (this.dorsal == futbolista.dorsal && this.nombre.equals(futbolista.nombre)) {
			sonIguales = true;
		}

		// Devolvemos si son iguales
		return sonIguales;
	}

	@Override
	public int compareTo(Futbolista futbolista) {
		// Variable que almacena el resultado
		int res;

		// Comprobamos que el dorsal sea menor o mayor
		if (this.dorsal < futbolista.dorsal) {
			res = -1;
		} else if (this.dorsal < futbolista.dorsal) {
			res = 1;
		} else {
			// Si es igual, comparamos por el nombre
			res = this.nombre.compareTo(futbolista.nombre);
		}

		// Devolvemos el resultado
		return res;
	}

}