package com.atechsa;

/**
 * Clase que controla una bicicleta de montaña.
 * 
 * @author Enrique R. García A <enramgarcia@gmail.com>
 *
 */
public class BicicletaMontaña extends Bicicleta {
	
	protected int suspension;
	
	public BicicletaMontaña(
			int velocidadActual,
			int platoActual,
			int piñonActual,
			int suspension
			) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}
	
	public BicicletaMontaña(){
		super();
		this.suspension = 1;
	}
	
	/**
	 * Llamar al método de acelarar original.
	 * 
	 * @param null
	 * return void
	 */
	public void acelerarOriginal() {
		super.acelerar();
	}
	
	/**
	 * Acelera la bicicleta al triple de la velocidad actual.
	 * 
	 * @override 
	 * @param null
	 * @return void
	 */
	public void acelerar() {
		this.velocidadActual *= 3;
	}
	
	/**
	 * 
	 * @param suspension
	 * @return void
	 */
	public void setSuspension(int suspension) {
		this.suspension = suspension;
	}

	/**
	 * 
	 * @param null
	 * @return void
	 */
	public int getSuspension() {
		return this.suspension;
	}
	
	/**
	 * Método hace la misma función que el setter.
	 * 
	 * @param suspension
	 * return void
	 */
	public void cambiarSuspension(int suspension) {
		this.setSuspension(suspension);
	}
	
	/**
	 * Convierte la clase a una cadena que contiene los valores de las propiedades de la clase.
	 * 
	 * @override
	 * @param null
	 * @return String 
	 */
	public String toString() {
		return String.format(
				"VelocidadActual = %d, PlatoActual = %d, PiñonActual = %d, Suspension = %d.",
				this.velocidadActual,
				this.platoActual,
				this.piñonActual,
				this.suspension
				);
	}
	
}
