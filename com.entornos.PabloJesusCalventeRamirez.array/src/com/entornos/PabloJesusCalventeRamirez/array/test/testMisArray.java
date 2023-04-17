package com.entornos.PabloJesusCalventeRamirez.array.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.PabloJesusCalventeRamirez.array.MisArrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testMisArray {

	int array1[], array2[], array3[];

	@BeforeAll
	void iniciar() {
		array1 = new int[] { 2, 5, 8, 6, 9, 10 };
		array2 = new int[] { 1, 5, 9 };
		array3 = new int[] { 10, 5, 9, 5, 9, 5, 6 };
	}

	@Test
	void testMedia() {
		assertEquals(6.0, Math.round(MisArrays.media(array1)));
		assertEquals(5.0, Math.round(MisArrays.media(array2)));
		assertEquals(7.0, Math.round(MisArrays.media(array3)));
	}

	@Test
	void testMediana() {
		assertEquals(7, MisArrays.mediana(array1));
		assertEquals(5, MisArrays.mediana(array2));
		assertEquals(6, MisArrays.mediana(array3));
	}
}
