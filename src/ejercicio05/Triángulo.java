package ejercicio05;

public class Triángulo extends Polígono {

	/**
	 * Atributo donde se almacenará el lado 1
	 */
	private double lado1;

	/**
	 * Atributo donde se almacenará el lado 2
	 */
	private double lado2;

	/**
	 * Atributo donde se almacenará el lado 3
	 */
	private double lado3;

	/**
	 * Constructor vacío
	 */
	public Triángulo() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param lado1 Parámetro que almacena el lado 1
	 * @param lado2 Parámetro que almacena el lado 2
	 * @param lado3 Parámetro que almacena el lado 3
	 */
	public Triángulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Método que calcula el área del triángulo
	 */
	@Override
	double area() {
		double area;
		double semiperimetro;

		semiperimetro = (lado1 + lado2 + lado3) / 2;

		area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

		return area;
	}

	/**
	 * Método que muestra la información del triángulo
	 */
	public String toString() {
		String info = "";
		info += "Triángulo";
		info += " Lado 1: " + this.lado1;
		info += " Lado 2: " + this.lado2;
		info += " Lado 3: " + this.lado3;

		return info;
	}
}
