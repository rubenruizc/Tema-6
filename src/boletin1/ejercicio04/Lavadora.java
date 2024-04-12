package boletin1.ejercicio04;

public class Lavadora extends Electrodomestico {

	/**
	 * Atributo que almacena la carga
	 */
	double carga = 5;

	/**
	 * Constructor vacío
	 */
	public Lavadora() {
	}

	/**
	 * Constructor con los parámetros precioBase y peso
	 * 
	 * @param valorBase    Precio base de la lavadora
	 * @param pesoProducto Peso de la lavadora
	 */
	public Lavadora(double valorBase, double pesoProducto) {
		super(valorBase, pesoProducto);
	}

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param precioBase        Precio base de la lavadora
	 * @param color             Color de la lavadora
	 * @param consumoEnergetico Consumo de la lavadora
	 * @param peso              Peso de la lavadora
	 * @param carga             Carga de la lavadora
	 */
	public Lavadora(double valorBase, String color, char consumoEnergetico, double pesoProducto, double carga) {
		super(valorBase, color, consumoEnergetico, pesoProducto);

		// Comprobamos que la carga sea mayor o igual que 0
		if (carga >= 0) {
			this.carga = carga;
		}
	}

	/**
	 * Obtiene la carga de la lavadora
	 * 
	 * @return Devuelve la carga de la lavadora
	 */
	public double getCarga() {
		return this.carga;
	}

	/**
	 * Método que modifica el precio base según el peso, el consumo energético y la
	 * carga
	 */
	public void precioFinal() {
		// Llamamos al método padre
		super.precioFinal();

		// Comprobamos si la carga es mayor a 30 kg
		if (this.carga > 30) {
			// Aumentamos el precio 50 €
			super.valorBase += 50;
		}
	}

	/**
	 * Método que devuelve la información de la lavadora como cadena
	 * 
	 * @return Devuelve la información del electrodomestico
	 */
	
	public String toString() {
		// Variable donde se almacenará la información
		String infoProducto = "";

		// Almacenamos la información
		infoProducto += super.toString() + "\nCarga: " + this.carga + " kg";

		// Devolvemos la información
		return infoProducto;
	}

}
