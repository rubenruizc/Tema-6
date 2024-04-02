package boletin01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hora;
		int minutos;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una cantidad de horas");
		hora = sc.nextInt();
		System.out.println("Introduzca una cantidad de minutos");
		minutos = sc.nextInt();

		Hora h = new Hora(hora, minutos);

		h.inc();

		System.out.println(h.toString());

		sc.close();
	}

}
