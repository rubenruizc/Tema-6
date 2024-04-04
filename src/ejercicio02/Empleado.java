package ejercicio02;

public class Empleado {

	/**
	 * Atributo donde guardaremos el nombre del empleado
	 */
	protected String nombre;

	/**
	 * Constructor vacío
	 */
	protected Empleado() {

	}

	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	// GET/SET del atributo nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	public String toString() {
		String nombreEmpleado = "Empleado: " + this.nombre;
		return nombreEmpleado;
	}

}
