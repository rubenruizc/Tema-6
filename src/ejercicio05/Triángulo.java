package ejercicio05;

public class Triángulo extends Polígono {

	private double base;
	
	private double altura;
	
	
	
	
	@Override
	double area() {
		double area;
		
		area = (this.altura * this.base)/2;
		
		return area;
	}

}
