package com.atechsa;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase para exponer los ejercicios.
 * 
 * @author Enrique R. Garc�a A <enramgarcia@gmail.com>
 *
 */
public class Ejercicio {
	
	/** Clase para generar n�meros random. */
	protected Random random = new Random();

	/**
	 * Usar la aceleraci�n de la bicicleta normal y no de la bicicleta de monta�a.
	 * 
	 * @param null
	 * @return void
	 */
	public void aceleracionOriginal() {
		BicicletaMonta�a bici = agregarBicicletaMonta�a();
		
		System.out.println("Iniciar la aceleraci�n de la bicicleta de monta�a.\n");
		System.out.println(String.format("Valor incial %s", bici));
		
		bici.acelerarOriginal();
		System.out.println(String.format("Valor despues de usar la aceleraci�n original %s", bici));
	}
	
	/**
	 * Ejercicio 7.
	 * En vez de un array us� un arraylist para que fuera dinamico, en caso tal
	 * a futuro se desee agregar m�s valores de forma sencilla.
	 * 
	 * @param null
	 * @return void
	 */
	public void acelerarBicicletas() {
		System.out.println("Iniciar la aceleraci�n de diferente tipo de bicicletas.\n");
		
		ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
		
		bicicletas.add(new Bicicleta());
		
		for (int i = 0; i < 2; i++) {
			bicicletas.add(agregarBicicletaMonta�a());
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
	 * Agregar los valores de una bicicleta de monta�a con valores random.
	 * 
	 * @param null
	 * @return BicicletaMonta�a
	 */
	public BicicletaMonta�a agregarBicicletaMonta�a() {
		return new BicicletaMonta�a(rInt(), rInt(), rInt(), rInt());
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
