package com.entornos.PabloJesusCalventeRamirez.array;

import java.util.Arrays;

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

	/**
	 * Calcula la mediana de la lista pasada por parametros. Si es impar se
	 * seleccionara el elemento que este justo en medio y si es par se calcula la
	 * media de los dos numeros centrales
	 * 
	 * @param array Array de numeros
	 * @return mediana del array
	 */
	public static double mediana(int[] array) {
		Arrays.sort(array);

		double med = 0.0;
		int mitad = array.length / 2;
		if (array.length % 2 == 0) {
			med = (array[mitad - 1] + array[mitad]) / 2;
		} else {
			med = array[mitad];
		}
		return med;
	}
	
	/**
	 * Calcula el numero maximo de un array
	 * @param array Array de numeros
	 * @return Maximo del array
	 */
	public static int maximo(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
