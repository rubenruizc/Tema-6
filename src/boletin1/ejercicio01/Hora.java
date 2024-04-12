package boletin1.ejercicio01;

public class Hora {

	/**
	 * Atributo privado donde almacenaremos las horas
	 */
	protected int hora;

	/**
	 * Atributo privado donde almacenaremos los minutos
	 */
	protected int minutos;

	/**
	 * Constructor con los parámetros de hora y minutos
	 * 
	 * @param hora    Parámetro donde se recurrira a la hora
	 * @param minutos Parámetro donde se recurrira a los minutos
	 */
	public Hora(int hora, int minutos) {

		// Comprobamos si podemos atribuir el valor al atributo hora
		if (hora > -1 && hora <= 23) {
			this.hora = hora;
		}

		// Comprobamos si podemos atribuir el valor al atributo minutos
		if (minutos > -1 && minutos <= 59) {
			this.minutos = minutos;
		}
	}

	// GET de los atributos hora y minutos
	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	/**
	 * Método que suma uno a los minutos
	 */
	public void inc() {
		this.minutos++;

		if (this.minutos == 60) {
			this.minutos = 0;
			this.hora++;
		}

		if (this.hora == 24) {
			this.hora = 0;
		}
	}

	/**
	 * Método para establecer los minutos
	 * 
	 * @param minutos
	 * @return
	 */
	public boolean setMinutos(int minutos) {
		boolean sePuede = false;

		if (minutos > -1 && minutos <= 59) {
			this.minutos = minutos;
			sePuede = true;
		}

		if (this.minutos > 59) {
			this.minutos = 0;
			this.hora++;
		}

		return sePuede;
	}

	/**
	 * Método para establecer las horas
	 * 
	 * @param hora
	 * @return
	 */
	public boolean setHora(int hora) {
		boolean sePuede = false;

		if (hora > -1 && hora <= 23) {
			this.hora = hora;
		}

		if (this.hora > 23) {
			this.hora = 0;
		}

		return sePuede;
	}

	/**
	 * Método toString para obtener la representación de la hora exacta
	 */
	public String toString() {
		String horaCompleta = "";

		if (this.hora < 10 && this.minutos < 10) {
			horaCompleta = "0" + this.hora + ":" + "0" + this.minutos;

		} else if (this.hora < 10) {
			horaCompleta = "0" + this.hora + ":" + this.minutos;

		} else if (this.minutos < 10) {
			horaCompleta = this.hora + ":" + "0" + this.minutos;

		} else {
			horaCompleta = this.hora + ":" + this.minutos;
		}

		return horaCompleta;
	}
}
