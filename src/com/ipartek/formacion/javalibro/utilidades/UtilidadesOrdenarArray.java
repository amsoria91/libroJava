package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesOrdenarArray {

	
	/**
	 * Ordena un Array con el metodo bubble-sort
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado Array desordenado
	 * @param orden true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray(int[] aDesordenado, boolean orden) {

		int[] resul = aDesordenado;
		int numeroApoyo = 0;
		
		if(orden=false) {
			for (int i = 0; i < resul.length; i++) {

				for (int j = 0; j < resul.length-1; j++) {

					if (resul[j] > resul[j + 1]) {

						numeroApoyo = resul[j];
						resul[j] = resul[j + 1];
						resul[j + 1] = numeroApoyo;

					}

				}

			}
		}else {
			
			for (int i = resul.length-1; i >=0; i--) {

				for (int j = resul.length-1; j >0; j--) {

					if (resul[j] > resul[j-1]) {

						numeroApoyo = resul[j];
						resul[j] = resul[j -1];
						resul[j- 1] = numeroApoyo;

					}

				}

			}
			
		}
		
			

		

		return resul;
	}
	
}
