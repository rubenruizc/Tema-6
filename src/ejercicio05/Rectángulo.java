package ejercicio05;

public class Rectángulo extends Polígono {

	/**
	 * Atributo que almacena el ancho del rectángulo
	 */
	private double ancho;

	/**
	 * Atributo que almacena la altura del rectángulo
	 */
	private double altura;

	/**
	 * Constructor vacío
	 */
	public Rectángulo() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param ancho  parámetro que almacena el ancho del rectángulo
	 * @param altura parámetro que almacena la altura del rectángulo
	 */
	public Rectángulo(double ancho, double altura) {
		super();

		if (ancho > 0) {
			this.ancho = ancho;
		}

		if (altura > 0) {
			this.altura = altura;
		}
			
	}
	
	

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Método que calcula y devuelve el área
	 * 
	 * @return
	 */
	@Override
	public double area() {
		double area;
		
		area = this.altura * this.ancho;
		
		return area;
	}
	
	/**
	 * Método que muestra la información del rectángulo
	 */
	public String toString() {
		String info = "";
		info += "Rectángulo";
		info += "Alto: " + this.altura;
		info += "Ancho: " + this.ancho;
		info += "Área: " + area();
		
		
		return info;
	}

}
