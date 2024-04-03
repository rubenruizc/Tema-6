package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la cantidad de horas
		int hora;
		
		// Variable donde guardaremos la cantidad de minutos
		int minutos;
		
		// Variable donde guardaremos la cantidad de segundos
		int segundos;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca las horas y las leemos
		System.out.println("Introduzca una cantidad de horas");
		hora = sc.nextInt();
		
		// Le pedimos al usuario que introduzca los minutos y los leemos
		System.out.println("Introduzca una cantidad de minutos");
		minutos = sc.nextInt();

		// Creamos el objeto con los valores correpondientes
		Hora h = new Hora(hora, minutos);

		// Llamamos al método para incrementar un minuto
		h.inc();

		// Imprimimos la hora
		System.out.println(h.toString());

		// Le pedimos al usuario que introduzca los segundos y los leemos
		System.out.println("Introduzca los segundos: ");
		segundos = sc.nextInt();
		
		// Creamos el objeto con los valores correspondientes
		HoraExacta he = new HoraExacta(hora,minutos,segundos);
		
		// Llamamos al método para incrementar los segundos
		he.inc();
		
		// Imprimimos la hora exacta
		System.out.println(he.toString());
		
		// Cerramos el Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase
