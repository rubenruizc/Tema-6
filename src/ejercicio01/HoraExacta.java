package ejercicio01;

public class HoraExacta extends Hora {

	/**
	 * Atributo donde guardaremos los segundos
	 */
	private int segundos;

	/**
	 * Constructor
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundos > -1 && segundos <= 59) {
			this.segundos = segundo;

		}
	}

	/**
	 * Método para establecer los segundos
	 * @param segundos
	 * @return
	 */
	public boolean setSegundo(int segundos) {

		boolean sePuede = false;

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
			sePuede = true;
		}
		return sePuede;
	}

	/**
	 * Método para incrementar la hora en un segundo
	 */

	public void inc() {
		
		// Llama al método inc() de la superclase para incrementar la hora en un minuto
		super.inc(); 
		if (this.segundos < 59) {
			this.segundos++;
		} else {
			this.segundos = 0;
			super.inc(); 
		}
	}

	/**
	 * Método toString para obtener la representación de la hora exacta
	 */
	public String toString() {
		
		// Obtiene la representación de la hora de la superclase
		String horaStr = super.toString(); 
		
		// Formatea los segundos para que siempre tengan dos dígitos
		String segundoStr = (this.segundos < 10) ? "0" + this.segundos : String.valueOf(this.segundos);
 
		return horaStr + ":" + segundoStr;
	}
}
