package ejercicio03;

public class Productos {

	/**
	 * Atributo donde guardaremos el nombre del producto
	 */
	protected String nombre;

	/**
	 * Atributo donde guardaremos el precio del producto
	 */
	protected double precio;

	/**
	 * Constructor vacío
	 */
	public Productos() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, double precio) {
		super();

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (precio > -1) {
			this.precio = precio;

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > -1) {
			this.precio = precio;

		}
	}

	public String toString() {
		String infoProducto = "";
		infoProducto = "\nNombre: " + this.nombre + "\nPrecio:" + this.precio;
		return infoProducto;
	}

	public double calcular(int cantidad) {
		return precio * cantidad;
	}
}
