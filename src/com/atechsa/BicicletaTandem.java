package com.atechsa;

/**
 * Clase que controla una bicicleta.
 * 
 * @author Enrique R. García A <enramgarcia@gmail.com>
 *
 */
public class BicicletaTandem extends Bicicleta {
	
	/** Número de asientos en la bicicleta */
	protected int numAsientos;
	
	/**
	 * Constructor
	 * @param velocidadActual
	 * @param platoActual
	 * @param piñonActual
	 * @param numAsientos
	 */
	public BicicletaTandem(
			int velocidadActual,
			int platoActual,
			int piñonActual,
			int numAsientos
			) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}
	
	/**
	 * Constructor default
	 */
	public BicicletaTandem() {
		super();
		this.numAsientos = 2;
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
		this.velocidadActual *= 4;
	}
	
	/**
	 * 
	 * @param numAsientos
	 * return void
	 */
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	/**
	 * 
	 * @param null
	 * @return int
	 */
	public int getNumAsientos() {
		return this.numAsientos;
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
				"VelocidadActual = %d, PlatoActual = %d, PiñonActual = %d, NumAsientos = %d.",
				this.velocidadActual,
				this.platoActual,
				this.piñonActual,
				this.numAsientos
				);
	}
}
