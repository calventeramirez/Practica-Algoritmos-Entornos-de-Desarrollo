package com.entornos.PabloJesusCalventeRamirez.algoritmos;

/**
 * Representa algunos metodos matematicos. Metodos fibonacci, primo y factorial
 * 
 * @author Pablo Jesús Calvente Ramírez
 * 
 * @version 1.0
 * 
 */

public abstract class algoritmo {
	/**
	 * Calcula el número de fibonacci de manera iterativa
	 * 
	 * @param numero Introducido para calcular dicho factorial
	 * @return el fibonacci del numero pasado por parametros
	 */
	public static int fibonacci(int numero) {
		int siguiente = 1, actual = 0, temp = 0;
		for (int i = 0; i <= numero; i++) {
			temp = actual;
			actual = siguiente;
			siguiente += temp;
		}
		return actual;
	}
}
