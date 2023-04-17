package com.entornos.PabloJesusCalventeRamirez.array;

/**
 * 
 * @author Pablo Jesús Calvente Ramírez
 * @version 1.0
 */
public abstract class MisArrays {
	/**
	 * Calcula la media aritmetica de la lista pasado por parametros
	 * 
	 * @param array Arrays de numeros
	 * @return media artimetica
	 */
	public static double media(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}
