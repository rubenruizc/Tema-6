package boletin1.ejercicio03;

public class NoPerecedero extends Productos {

	private String tipo;

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;

		}
	}

	public String getDiasCaducar() {
		return tipo;
	}

	public void setDiasCaducar(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;

		}
	}

	public String toString() {
		String infoNoPerecedero = "";

		infoNoPerecedero = super.toString() + "\nTipo: " + this.tipo;

		return infoNoPerecedero;
	}

	public double calcular(int cantidad) {

		return super.calcular(cantidad);
	}
}
