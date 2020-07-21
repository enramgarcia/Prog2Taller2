package com.atechsa;

/**
 * Clase que controla una bicicleta.
 * 
 * @author Enrique R. García A <enramgarcia@gmail.com>
 *
 */
public class Bicicleta {
	
	protected int velocidadActual;
	protected int platoActual;
	protected int piñonActual;
	
	/**
	 * Constructor
	 * @param velocidadActual
	 * @param platoActual
	 * @param piñonActual
	 */
	public Bicicleta(
			int velocidadActual,
			int platoActual,
			int piñonActual
			) {
		
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	
	/**
	 * Constructor
	 */
	public Bicicleta() {
		this.velocidadActual = 0;
		this.cambiarPiñon();
		this.cambiarPlato();
	}
	
	/**
	 * 
	 * @param velocidadActual
	 */
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	/**
	 * 
	 * @return int
	 */
	public int getVelocidadActual() {
		return this.velocidadActual;
	}
	
	/**
	 * 
	 * @param platoActual
	 */
	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}
	
	/**
	 * 
	 * @return int
	 */
	public int getPlatoActual() {
		return this.platoActual;
	}
	
	/**
	 * 
	 * @param piñonActual
	 */
	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPiñonActual() {
		return this.piñonActual;
	}
	
	/**
	 * Cambia el valor de la veclodiad actual al doble
	 * @param null
	 * @return void
	 */
	public void acelerar() {
		this.velocidadActual *= 2;
	}
	
	/**
	 * Cambia el valor de la velocidad actual en la mitad. 
	 * @param null
	 * @return void
	 */
	public void frenar() {
		// No ha necesidad de calcular nada si la velocidad ya es cero.
		if (this.velocidadActual == 0) {
			return;
		}
		
		// La velocidad no debe de ser negativa.
		if (this.velocidadActual / 2 < 0) {
			this.velocidadActual = 0;
			return;
		}
		
		this.velocidadActual /= 2;
	}
	
	/**
	 * Cambiar el valor de plato actual (redundante con un setter).
	 * 
	 * @param plato Valor del plato actual.
	 * @return void
	 */
	public void cambiarPlato(int plato) {
		this.platoActual = plato;
	}
	
	/**
	 * Inicia el plato actual a un valor de 1.
	 * 
	 * @param null
	 * @return void
	 */
	public void cambiarPlato() {
		this.cambiarPlato(1);
	}
	
	/**
	 * Cambia el valor del piñon actual (redundante con un setter).
	 * 
	 * @param piñon Valor del piñon actual.
	 * @return void
	 */
	public void cambiarPiñon(int piñon) {
		this.piñonActual = piñon;
	}
	
	/**
	 * Inicia el piñon actual a un valor de 1.
	 * 
	 * @param null
	 * @return void
	 */
	public void cambiarPiñon() {
		this.cambiarPiñon(1);
	}
	
	/**
	 * Convierte la clase a una cadena que contiene los valores de las propiedades de la clase.
	 * 
	 * @param null
	 * @return String 
	 */
	public String toString() {
		return String.format(
				"VelocidadActual = %d, PlatoActual = %d, PiñonActual = %d.",
				this.velocidadActual,
				this.platoActual,
				this.piñonActual
				);
	}
}
