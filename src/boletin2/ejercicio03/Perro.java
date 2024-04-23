package boletin2.ejercicio03;

public class Perro extends AnimalDomestico {

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del perro
	 * @param raza   Raza del perro
	 * @param peso   Peso del perro
	 * @param color  Color del perro
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método que indica la acción de hacer ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau");
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

		// Comprobamos que sea mayor o igual que 0.10
		if (prob >= 0.1) {
			haceCaso = true;
		}

		// Devuelve si hace caso
		return haceCaso;
	}

}