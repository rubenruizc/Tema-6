package boletin1.ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto para el empleado
		Empleado E1 = new Empleado ("Rafa");
		
		// Creamos el objeto para el directivo
		Directivo D1 = new Directivo ("Mario");
		
		// Creamos el objeto para el operario
		Operario O1 = new Operario ("Alfonso");
		
		// Creamos el objeto para el técnico
		Tecnico T1 = new Tecnico ("Jenri");
		
		// Creamos el objeto para el oficial
		Oficial OF1 = new Oficial ("Rubén");
		
		// Imprimimos los nombres
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(O1);
		System.out.println(T1);
		System.out.println(OF1);

	}

}
