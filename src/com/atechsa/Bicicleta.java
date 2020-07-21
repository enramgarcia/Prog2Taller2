package com.atechsa;

/**
 * Clase que controla una bicicleta.
 * 
 * @author Enrique R. Garc�a A <enramgarcia@gmail.com>
 *
 */
public class Bicicleta {
	
	protected int velocidadActual;
	protected int platoActual;
	protected int pi�onActual;
	
	/**
	 * Constructor
	 * @param velocidadActual
	 * @param platoActual
	 * @param pi�onActual
	 */
	public Bicicleta(
			int velocidadActual,
			int platoActual,
			int pi�onActual
			) {
		
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.pi�onActual = pi�onActual;
	}
	
	/**
	 * Constructor
	 */
	public Bicicleta() {
		this.velocidadActual = 0;
		this.cambiarPi�on();
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
	 * @param pi�onActual
	 */
	public void setPi�onActual(int pi�onActual) {
		this.pi�onActual = pi�onActual;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPi�onActual() {
		return this.pi�onActual;
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
	 * Cambia el valor del pi�on actual (redundante con un setter).
	 * 
	 * @param pi�on Valor del pi�on actual.
	 * @return void
	 */
	public void cambiarPi�on(int pi�on) {
		this.pi�onActual = pi�on;
	}
	
	/**
	 * Inicia el pi�on actual a un valor de 1.
	 * 
	 * @param null
	 * @return void
	 */
	public void cambiarPi�on() {
		this.cambiarPi�on(1);
	}
	
	/**
	 * Convierte la clase a una cadena que contiene los valores de las propiedades de la clase.
	 * 
	 * @param null
	 * @return String 
	 */
	public String toString() {
		return String.format(
				"VelocidadActual = %d, PlatoActual = %d, Pi�onActual = %d.",
				this.velocidadActual,
				this.platoActual,
				this.pi�onActual
				);
	}
}
