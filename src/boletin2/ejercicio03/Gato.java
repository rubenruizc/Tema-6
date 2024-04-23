package boletin2.ejercicio03;

public class Gato extends AnimalDomestico {

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del gato
	 * @param raza   Raza del gato
	 * @param peso   Peso del gato
	 * @param color  Color del gato
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método que indica la acción de hacer ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	/**
	 * Método que indica la acción de hacer caso
	 * 
	 * @return Devuelve si hace caso o no
	 */
	@Override
	public boolean hacerCaso() {
		// Variable que almacena si hace caso o no
		boolean haceCaso = false;

		// Variable que almacena la probabilidad de hacer caso
		double prob = Math.random();

		// Comprobamos que sea mayor o igual que 0.95
		if (prob >= 0.95) {
			haceCaso = true;
		}

		// Devuelve si hace caso
		return haceCaso;
	}

}