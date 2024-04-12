package boletin2.ejercicio01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio arraySocios [] = new Socio [] {
				new Socio(1, "Rubén", 18),
				new Socio(14, "Rubén", 18),
				new Socio(24, "Rubén", 18),
				new Socio(2, "Rubén", 18),
				new Socio(3, "Rubén", 18),
				
		};
		
		Arrays.sort(arraySocios);
		
		System.out.println(Arrays.toString(arraySocios));

	}

}
