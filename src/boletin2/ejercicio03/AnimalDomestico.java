package boletin2.ejercicio03;

public abstract class AnimalDomestico implements Animal {
	/**
	 * Atributo que almacena el nombre
	 */
	private String nombre = "";
	
	/**
	 * Atributo que almacena la raza
	 */
	private String raza = "";
	
	/**
	 * Atributo que almacena el peso
	 */
	private double peso;
	
	/**
	 * Atributo que almacena el color
	 */
	private String color = "";
	
	/**
	 * Constructor con los parámetros nombre, raza y color
	 * 
	 * @param nombre Nombre del animal doméstico
	 * @param raza Raza del animal doméstico
	 * @param peso Peso del animal doméstico
	 * @param color Color del animal doméstico
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		// Comprobamos que nombre no sea ni null ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Comprobamos que raza no sea ni null ni vacío
		if (raza != null && !raza.equals("")) {
			this.raza = raza;
		}
		
		// Comprobamos que peso sea mayor que 0
		if (peso > 0) {
			this.peso = peso;
		}
		
		// Comprobamos que color no sea ni null ni vacío
		if (color != null && !color.equals("")) {
			this.color = color;
		}
	}

	/**
	 * Método que indica la acción de comer
	 */
	@Override
	public void comer() {
		System.out.println("ñam");
		this.peso += 0.1;
	}

	/**
	 * Método que indica la acción de dormir
	 */
	@Override
	public void dormir() {
		System.out.println("Zzzzz");
	}
	
	/**
	 * Método abstracto que indica la acción de hacer ruido
	 */
	@Override
	public abstract void hacerRuido();
	
	/**
	 * Método que indica la acción de vacunarse
	 */
	public void vacunar() {
		System.out.println("Vacunado");
	}
	
	/**
	 * Método que indica la acción de hacer caso
	 */
	public abstract boolean hacerCaso();
	
}
