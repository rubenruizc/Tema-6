package boletin1.ejercicio05;

public class Array {

	static Polígono[] arrayInfo = new Polígono[10];

	static int posicionLibre() {
		int indice = 0;

		boolean encontrado = false;

		int posicion = -1;

		while (indice < arrayInfo.length && !encontrado) {
			if (arrayInfo[indice] == null) {
				posicion = indice;
				encontrado = true;
			}
			indice++;
		}
		return posicion;
	}

	static void muestraInfo() {
		for (Polígono poligono1 : arrayInfo) {
			if (poligono1 != null) {
				System.out.println(poligono1);
				System.out.println("Área: " + poligono1.area());
			}
		}
	}
}
