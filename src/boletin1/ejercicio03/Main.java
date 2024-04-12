package boletin1.ejercicio03;

public class Main {

	public static void main(String[] args) {
		Productos producto = new Productos("Manzana", 1.5);
		Perecedero perecedero = new Perecedero("Leche", 2.0, 2);
		NoPerecedero noPerecedero = new NoPerecedero("Arroz", 2.0, "Grano");

		System.out.println("Producto: " + producto);
		System.out.println("Precio total del producto: " + producto.calcular(5));
		System.out.println();
		System.out.println("Perecedero: " + perecedero);
		System.out.println("Precio total del producto perecedero: " + perecedero.calcular(3));
		System.out.println();
		System.out.println("NoPerecedero: " + noPerecedero);
		System.out.println("Precio total del producto no perecedero: " + noPerecedero.calcular(2));
	}

}
