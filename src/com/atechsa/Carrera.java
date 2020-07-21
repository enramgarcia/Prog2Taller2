package com.atechsa;

/**
 * Clase que simula una carrera de dos bicicletas e imprime los valores.
 * 
 * @author Enrique R. García A <enramgarcia@gmail.com>
 */
public class Carrera {

	/** Objeto de mi bicicleta. */
	private Bicicleta miBicicleta;
	/** Objeto de la bicicleta con la que se compite. */
	private Bicicleta tuBicicleta;
	
	/**
	 * Inicia una carrera, que es solamente los valores iniciales acelerando
	 * en 3 ciclos.
	 * 
	 * @param null
	 * @return void
	 */
	public void comenzar() {
		miBicicleta = new Bicicleta(2, 3, 4);
		tuBicicleta = new Bicicleta();
		
		Imprimir();
		tuBicicleta.setVelocidadActual(1);
		
		System.out.println("Comienza la carrera.");
		
		for(int i = 0; i < 3; i++) {
			miBicicleta.acelerar();
			tuBicicleta.acelerar();
			Imprimir();
		}
		
		miBicicleta.frenar();
		tuBicicleta.frenar();
		
		System.out.println("Se acabo la carrera, resultado final.\n%s");
		Imprimir();
	}

	/**
	 * Imprime los valores de miBicicleta y tuBicicleta.
	 * 
	 * @param null
	 * @return void
	 */
	public void Imprimir() {
		System.out.println(
				String.format(
						"Mi Bicicleta: %s\nTu Bicicleta: %s",
						miBicicleta,
						tuBicicleta
					)
				);
	}
}
