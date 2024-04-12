package boletin1.ejercicio04;

public class Main {

	public static void main(String[] args) {
		// Array de electrodomésticos de 10 posiciones
		Electrodomestico[] elec = new Electrodomestico[10];

		double suma = 0;
		double lavadoras = 0;
		double television = 0;

		// Electrodomestico 1
		Electrodomestico elec1 = new Electrodomestico(100, "azul", 'A', 25);
		elec[0] = elec1;
		Electrodomestico elec2 = new Electrodomestico(250, "rojo", 'E', 40);
		elec[1] = elec2;
		Electrodomestico elec3 = new Electrodomestico(120, "gris", 'F', 25);
		elec[2] = elec3;

		Lavadora lavadora1 = new Lavadora(75, "negro", 'A', 34, 19);
		elec[3] = lavadora1;
		Lavadora lavadora2 = new Lavadora(225, "azul", 'B', 42, 67);
		elec[4] = lavadora2;
		Lavadora lavadora3 = new Lavadora(110, "rojo", 'F', 71, 11);
		elec[5] = lavadora3;

		Television televisor1 = new Television(250, "rojo", 'D', 27, 40, true);
		elec[6] = televisor1;
		Television televisor2 = new Television(525, "gris", 'C', 32, 26, true);
		elec[7] = televisor2;
		Television televisor3 = new Television(700, "blanco", 'E', 17, 33, true);
		elec[8] = televisor3;
		Television televisor4 = new Television(475, "negro", 'D', 40, 53, false);
		elec[9] = televisor4;

		for (Electrodomestico ed : elec) {
			ed.precioFinal();

			System.out.println("Precio: " + ed.getValorBase() + " €");

			if (ed instanceof Lavadora) {
				lavadoras = lavadoras + ed.getValorBase();
			}

			if (ed instanceof Television) {
				television = television + ed.getValorBase();
			}

			if (ed instanceof Electrodomestico) {
				suma = suma + ed.getValorBase();
			}
		}

		System.out.println("Lavadoras: " + lavadoras + " €");
		System.out.println("Televisiones: " + television + " €");

		System.out.println("Total: " + suma + " €");

	}

}
