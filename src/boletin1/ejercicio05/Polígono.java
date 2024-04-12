package boletin1.ejercicio05;

public abstract class Polígono {

	/**
	 * Atributo que almacena el número de lados
	 */
	protected int numeroLados;

	/**
	 * Constructor vacío
	 */
	public Polígono() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param numeroLados parámetro que recoge el numero de lados
	 */
	public Polígono(int numeroLados) {
		super();

		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Métood que obtiene el número de lados
	 * 
	 * @return devuelve el número de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método que almacena el número de lados
	 * 
	 * @param numeroLados número de lados del polígono
	 */
	public void setNumeroLados(int numeroLados) {
		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Método abstracto que devuelve el área del poligono
	 * 
	 * @return devuel el área del polígono
	 */
	abstract double area();

	/**
	 * Método que devuelve la información del polígono
	 *
	 * @return devuelve la cantidad de lados
	 */
	@Override
	public String toString() {
		return "Número de lados:" + this.numeroLados;
	}

}
