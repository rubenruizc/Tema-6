package boletin1.ejercicio04;

public class Television extends Electrodomestico {
	/**
	 * Atributo que almacena la resolución en pulgadas
	 */
	private double resolucion = 20;

	/**
	 * Atributo que almacena el sintonizador TDT
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor vacío
	 */
	public Television() {
	}

	/**
	 * Constructor con los parámetros precio base y peso
	 * 
	 * @param valorBase Precio base de la televisión
	 * @param pesoProducto       Peso de la televisión
	 */
	public Television(double valorBase, double pesoProducto) {
		super(valorBase, pesoProducto);
	}

	/**
	 * Constructor con los parámetros heredados, resolución y sintonizador
	 * 
	 * @param precioBase        Precio base de la televisión
	 * @param color             Color de la televisión
	 * @param consumoEnergetico Consumo energético de la televisión
	 * @param peso              Peso de la televisión
	 * @param resolucion        Resolución de la televisión
	 * @param sintonizador      Sintonizador de la televisión
	 */
	public Television(double valorBase, String color, char consumoEnergetico, double pesoProducto, double resolucion,
			boolean sintonizador) {
		super(valorBase, color, consumoEnergetico, pesoProducto);

		// Comprobamos que la resolución sea mayor que 0
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}

		// Asignamos el sintonizador
		this.sintonizador = sintonizador;
	}

	/**
	 * Obtiene la resolución de la televisión
	 * 
	 * @return Devuelve la resolución de la televisión
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * Obtiene el sintonizador de la televisión
	 * 
	 * @return Devuelve el sintonizador de la televisión
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

	/**
	 * Método que incrementa el precio base si la resolución es mayor que 40 y/o si
	 * tiene sintonizador TDT incorporado
	 */
	public void precioFinal() {
		// Implementamos el método padre
		super.precioFinal();

		// Comprobamos si tiene una resolución mayor a 40 pulgadas
		if (this.resolucion > 40) {
			// Aumentamos el precio un 30%
			super.valorBase += (super.valorBase * 0.3);
		}

		// Comprobamos si tiene un sintonizador TDT incorporado
		if (this.sintonizador) {
			// Aumentamos el prcio 50 €
			super.valorBase += 50;
		}
	}

	/**
	 * Método que devuelve la información de la televisión como cadena
	 * 
	 * @return Devuelve la información del electrodomestico
	 */
	
	public String toString() {
		// Variable donde se almacenará la información
		String infoDelProducto = "";

		// Almacenamos la información
		infoDelProducto += super.toString() + "\nResolución: " + this.resolucion + " pulgadas" + "\nSintonizador: "
				+ this.sintonizador;

		// Devolvemos la información
		return infoDelProducto;
	}

}
