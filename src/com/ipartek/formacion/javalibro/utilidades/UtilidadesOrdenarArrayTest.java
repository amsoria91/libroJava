package com.ipartek.formacion.javalibro.utilidades;



import junit.framework.TestCase;

public class UtilidadesOrdenarArrayTest extends TestCase {

	
	public void testOrdenacionArray() {
		
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		
		int[] ordenadorMenorMayor = UtilidadesOrdenarArray.ordenarArray(aDesordando, false);
		
		for (int i = 0; i < ordenadorMenorMayor.length; i++) {
			assertEquals(i, ordenadorMenorMayor[i]);
		}
		
		int[] ordenadorMayorMenor = UtilidadesOrdenarArray.ordenarArray(aDesordando, true);
		
		for (int i = ordenadorMayorMenor.length-1; i >0; i--) {
			assertEquals(i, ordenadorMayorMenor[i]);
		}
		
		for (int i = 0; i < ordenadorMenorMayor.length; i++) {
			assertEquals(i, ordenadorMenorMayor[i]);
		}
		
		
		
	}
	
}