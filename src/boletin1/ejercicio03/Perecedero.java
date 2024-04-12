package boletin1.ejercicio03;

public class Perecedero extends Productos {

	private int diasACaducar;

	public Perecedero(String nombre, double precio, int díasACaducar) {
		super(nombre, precio);

		if (diasACaducar > 0) {
			this.diasACaducar = díasACaducar;

		}
	}

	public int getDiasCaducar() {
		return diasACaducar;
	}

	public void setDiasCaducar(int díasACaducar) {
		if (diasACaducar > 0) {
			this.diasACaducar = díasACaducar;

		}
	}

	public String toString() {
		String infoProducto = "";
		infoProducto = super.toString() + "\nDias para caducar: " + this.diasACaducar;
		return infoProducto;
	}

	public double calcular(int cantidad) {
		double precioFinal = super.calcular(cantidad);
		if (diasACaducar == 1) {
			precioFinal /= 4;
		} else if (diasACaducar == 2) {
			precioFinal /= 3;
		} else if (diasACaducar == 3) {
			precioFinal /= 2;
		}
		return precioFinal;
	}

}
