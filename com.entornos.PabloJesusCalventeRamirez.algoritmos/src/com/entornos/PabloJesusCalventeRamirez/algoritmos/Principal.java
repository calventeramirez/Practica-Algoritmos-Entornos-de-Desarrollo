package com.entornos.PabloJesusCalventeRamirez.algoritmos;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// Instancio la clase Random para generar los numeros aleatorios
		Random alea = new Random();
		// Creo el array
		int[] numeros = new int[5];

		// Relleno el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = alea.nextInt(20) + 1;
		}

		// Calculo el fibonacci y lo guardo en resultadoFibonacci
		int[] resultadoFibonacci = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmo.fibonacci(numeros[i]);
		}

		// Calculo el factorial y lo guardo en resultadoFactorial
		long[] resultadoFactorial = new long[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmo.factorial(numeros[i]);
		}

		// Calculo el primo y lo guardo en resultadoPrimo
		boolean[] resultadoPrimo = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimo[i] = algoritmo.primo(numeros[i]);
		}
	}

}
