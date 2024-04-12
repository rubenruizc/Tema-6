package boletin1.ejercicio05;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;

		menu();
		System.out.println("Elija una opción:");
		opcion = sc.nextInt();
		do {
			switch (opcion) {
			case 1:
				double lado1Tri;
				double lado2Tri;
				double lado3Tri;
				int posTri;

				System.out.println("Introduce el lado 1: ");
				lado1Tri = sc.nextDouble();
				System.out.println("Introduce el lado 2: ");
				lado2Tri = sc.nextDouble();
				System.out.println("Introduce el lado 3: ");
				lado3Tri = sc.nextDouble();

				Triángulo tri = new Triángulo(lado1Tri, lado2Tri, lado3Tri);

				posTri = Array.posicionLibre();

				if (posTri != -1) {
					Array.arrayInfo[posTri] = tri;
					System.out.println("Introducido");
				} else {
					System.out.println("Error");
				}

				break;

			case 2:
				double lado1Rec;
				double lado2Rec;

				int posRec;

				System.out.println("Introduce el lado 1: ");
				lado1Rec = sc.nextDouble();
				System.out.println("Introduce el lado 2: ");
				lado2Rec = sc.nextDouble();

				Rectángulo rec = new Rectángulo(lado1Rec, lado2Rec);

				posRec = Array.posicionLibre();

				if (posRec != -1) {
					Array.arrayInfo[posRec] = rec;
					System.out.println("Introducido");
				} else {
					System.out.println("Error");
				}
				break;

			case 3:
				Array.muestraInfo();
				break;
			}

			menu();
			System.out.println("Elija una opción:");
			opcion = sc.nextInt();
		} while (opcion != 4);

	}

	static private void menu() {
		System.out.println(
				"1.Introducir triángulo." + "\n2. Introducir rectángulo." + "\n3.Mostrar contenido del array.");
	}
}
