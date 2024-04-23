package boletin2.ejercicio02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Futbolista[] array = new Futbolista[] { new Futbolista(12, "Amaro", 19, 10), new Futbolista(3, "Rubén", 18, 5),
				new Futbolista(5, "Jenri", 18, 0), new Futbolista(2, "Manati", 43, 20),
				new Futbolista(14, "Beluga", 8, 1) };

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
	}

}