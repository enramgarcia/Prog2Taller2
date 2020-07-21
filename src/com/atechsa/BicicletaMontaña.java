package com.atechsa;

/**
 * Clase que controla una bicicleta de monta�a.
 * 
 * @author Enrique R. Garc�a A <enramgarcia@gmail.com>
 *
 */
public class BicicletaMonta�a extends Bicicleta {
	
	protected int suspension;
	
	public BicicletaMonta�a(
			int velocidadActual,
			int platoActual,
			int pi�onActual,
			int suspension
			) {
		super(velocidadActual, platoActual, pi�onActual);
		this.suspension = suspension;
	}
	
	public BicicletaMonta�a(){
		super();
		this.suspension = 1;
	}
	
	/**
	 * Llamar al m�todo de acelarar original.
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
	 * M�todo hace la misma funci�n que el setter.
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
				"VelocidadActual = %d, PlatoActual = %d, Pi�onActual = %d, Suspension = %d.",
				this.velocidadActual,
				this.platoActual,
				this.pi�onActual,
				this.suspension
				);
	}
	
}
