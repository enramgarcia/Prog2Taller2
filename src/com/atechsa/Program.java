package com.atechsa;

/**
 * Inicio del programa.
 * 
 * @author Enrique R. Garc�a A <enramgarcia@gmail.com>
 *
 */
public class Program {
	
	public static void main(String[] args) {
		Ejercicio ejercicio = new Ejercicio();
		
		ejercicio.aceleracionOriginal();
		System.err.println("\n-------------------------------------------\n");
		ejercicio.acelerarBicicletas();
	}
}
