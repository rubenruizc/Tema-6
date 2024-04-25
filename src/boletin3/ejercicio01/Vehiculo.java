package boletin3.ejercicio01;

public class Vehiculo {
	
	private String marca = "";
	
	private String modelo = "";
	
	private String color = "";
	
	private String matricula = "";
	
	private boolean motorEncendido;
	
	private int marcha;
	
	private double velocidad = 0.0;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		super();
		
		if(marca != null && !marca.equals("")) {
			this.marca = marca;			
		}
		
		if(modelo != null && !modelo.equals("")) {
			this.modelo = modelo;			
		}
		
		if(color != null && !color.equals("")) {
			this.color = color;			
		}
		
		if(matricula != null && !matricula.equals("")) {
			this.matricula = matricula;			
		}
	}
	
	
	
}
