package com.atechsa;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase para exponer los ejercicios.
 * 
 * @author Enrique R. García A <enramgarcia@gmail.com>
 *
 */
public class Ejercicio {
	
	/** Clase para generar números random. */
	protected Random random = new Random();

	/**
	 * Usar la aceleración de la bicicleta normal y no de la bicicleta de montaña.
	 * 
	 * @param null
	 * @return void
	 */
	public void aceleracionOriginal() {
		BicicletaMontaña bici = agregarBicicletaMontaña();
		
		System.out.println("Iniciar la aceleración de la bicicleta de montaña.\n");
		System.out.println(String.format("Valor incial %s", bici));
		
		bici.acelerarOriginal();
		System.out.println(String.format("Valor despues de usar la aceleración original %s", bici));
	}
	
	/**
	 * Ejercicio 7.
	 * En vez de un array usé un arraylist para que fuera dinamico, en caso tal
	 * a futuro se desee agregar más valores de forma sencilla.
	 * 
	 * @param null
	 * @return void
	 */
	public void acelerarBicicletas() {
		System.out.println("Iniciar la aceleración de diferente tipo de bicicletas.\n");
		
		ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
		
		bicicletas.add(new Bicicleta());
		
		for (int i = 0; i < 2; i++) {
			bicicletas.add(agregarBicicletaMontaña());
			bicicletas.add(agregarBicicletaTandem());
		}
		
		for (Bicicleta bici : bicicletas) {
			System.out.println(
					String.format("Valor inicial de %s %s", bici.getClass().getSimpleName(), bici)
					);
			
			bici.acelerar();
			System.out.println(String.format("Valor final %s\n", bici));
		}
	}
	
	/**
	 * Generar valores random enteros del 0-9.
	 * 
	 * @param null
	 * @return int
	 */
	public int rInt() {
		return random.nextInt(10);
	}
	
	/**
	 * Agregar los valores de una bicicleta de montaña con valores random.
	 * 
	 * @param null
	 * @return BicicletaMontaña
	 */
	public BicicletaMontaña agregarBicicletaMontaña() {
		return new BicicletaMontaña(rInt(), rInt(), rInt(), rInt());
	}
	
	/**
	 * Agregar los valores de una bicicleta tandem, con valores random.
	 * 
	 * @param null
	 * @return BicicletaTandem
	 */
	public BicicletaTandem agregarBicicletaTandem() {
		return new BicicletaTandem(rInt(), rInt(), rInt(), rInt());
	}
}
