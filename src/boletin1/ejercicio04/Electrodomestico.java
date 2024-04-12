package boletin1.ejercicio04;

public class Electrodomestico {

	/**
	 * Atributo enum donde guardaremos los diferentes tipos de consumo energético
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	/**
	 * Atributo enum donde guardaremos los colores disponibles
	 */
	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Atributo donde guardaremos el precio base de los productos
	 */
	protected double valorBase = 100;

	/**
	 * Atributo que almacena el color
	 */
	protected Colores color = Colores.BLANCO;

	/**
	 * Atributo que almacena el consumo energético
	 */
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;

	/**
	 * Atributo donde guardaremos el peso
	 */
	protected double pesoProducto = 5;

	/**
	 * Constructor vacío
	 */
	public Electrodomestico() {
	}

	/**
	 * Constructor con los parámetros precio y peso
	 * 
	 * @param valorBase Precio base del electrodomestico
	 * @param pesoProducto       Peso del electrodomestico
	 */
	public Electrodomestico(double valorBase, double pesoProducto) {

		if (valorBase >= 0) {
			this.valorBase = valorBase;
		}

		if (pesoProducto >= 0) {
			this.pesoProducto = pesoProducto;
		}
	}

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param valorBase        Precio base del electrodoméstico
	 * @param color             Color del electrodoméstico
	 * @param consumoEnergetico Consumo energético del electrodoméstico
	 * @param pesoProducto              Peso del electrodoméstico
	 */
	public Electrodomestico(double valorBase, String color, char consumoEnergetico, double pesoProducto) {

		if (valorBase >= 0) {
			this.valorBase = valorBase;
		}

		if (color != null && !color.equals("")) {
			comprobarColor(color);
		}

		// Comprobamos si el consumo energético es del tipo enum
		comprobarConsumoEnergetico(consumoEnergetico);

		if (pesoProducto >= 0) {
			this.pesoProducto = pesoProducto;
		}
	}

	/**
	 * Obtiene el precio base del electrodoméstico
	 * 
	 * @return Devuelve el precio base del electrodoméstico
	 */
	public double getValorBase() {
		return valorBase;
	}

	/**
	 * Obtiene el color del electrodoméstico
	 * 
	 * @return Devuelve el color del electrodoméstico
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * Obtiene el consumo energético del electrodoméstico
	 * 
	 * @return Devuelve el consumo del electrodoméstico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Obtiene el peso del electrodoméstico
	 * 
	 * @return Devuelve el peso del electrodoméstico
	 */
	public double getPesoProducto() {
		return pesoProducto;
	}

	/**
	 * Método que Comprueba si la letra introducida es un tipo enum y en caso
	 * afirmativo, le asigna el valor. En caso negativo, deja el valor por defecto
	 * 
	 * @param letra Letra del consumo energético
	 */
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A' -> this.consumoEnergetico = ConsumoEnergetico.A;
		case 'B' -> this.consumoEnergetico = ConsumoEnergetico.B;
		case 'C' -> this.consumoEnergetico = ConsumoEnergetico.C;
		case 'D' -> this.consumoEnergetico = ConsumoEnergetico.D;
		case 'E' -> this.consumoEnergetico = ConsumoEnergetico.E;
		case 'F' -> this.consumoEnergetico = ConsumoEnergetico.F;
		}
	}

	/**
	 * Método que Comprueba si el color introducido es un tipo enum y en caso
	 * afirmativo, le asigna el valor. En caso negativo, deja el valor por defecto
	 * 
	 * @param color Color del electrodoméstico
	 */
	private void comprobarColor(String color) {
		// Pasamos el color a minúsculas
		color = color.toLowerCase();

		switch (color) {
		case "blanco" -> this.color = Colores.BLANCO;
		case "negro" -> this.color = Colores.NEGRO;
		case "rojo" -> this.color = Colores.ROJO;
		case "azul" -> this.color = Colores.AZUL;
		case "gris" -> this.color = Colores.GRIS;
		}
	}

	/**
	 * Método que según el consumo energético y el peso aumenta el precio base del
	 * electrodoméstico
	 */
	public void precioFinal() {
		// Variable donde se almacenará el precio final
		double precioFinal = 0;

		// Comprobamos que consumo energético tiene
		switch (this.consumoEnergetico) {
		case A -> precioFinal += 100;
		case B -> precioFinal += 80;
		case C -> precioFinal += 60;
		case D -> precioFinal += 50;
		case E -> precioFinal += 30;
		case F -> precioFinal += 10;
		}

		// Comprobamos su peso
		if (pesoProducto >= 0 && pesoProducto <= 19) {
			precioFinal += 10;
		} else if (pesoProducto >= 20 && pesoProducto <= 49) {
			precioFinal += 50;
		} else if (pesoProducto >= 50 && pesoProducto <= 79) {
			precioFinal += 80;
		} else if (pesoProducto >= 80) {
			precioFinal += 100;
		}

		// Aumentamos el precio
		this.valorBase += precioFinal;
	}

	/**
	 * Método que devuelve la información del electrodoméstico como cadena
	 * 
	 * @return Devuelve la información del electrodomestico
	 */
	public String toString() {
		// Variable donde se almacenará la información
		String informacionProducto = "";

		// Asignamos la información
		informacionProducto += "Precio base: " + this.valorBase + " €";
		informacionProducto += "\nColor: " + this.color;
		informacionProducto += "\nConsumo: " + this.consumoEnergetico;
		informacionProducto += "\nPeso: " + this.pesoProducto + " kg";

		// Devolvemos la información
		return informacionProducto;
	}

}
