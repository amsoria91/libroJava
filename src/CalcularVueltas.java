/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {
	
	final static float [] BILLETES_MONEDAS= {50f,20f,10f,5f,2f,1f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
	static float compraTotal=1326.24f;
	static float vueltas=673.76f;
	
	static int []numDineroUsado= {0,0,0,0,0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			
			while(vueltas-BILLETES_MONEDAS[i]>=0) {
				
				vueltas=vueltas-BILLETES_MONEDAS[i];
				numDineroUsado[i]++;
			}
		}
		
		System.out.println("Billetes de 50: " +numDineroUsado[0]);
		System.out.println("Billetes de 20: " +numDineroUsado[1]);
		System.out.println("Billetes de 10: " +numDineroUsado[2]);
		System.out.println("Billetes de 5: " +numDineroUsado[3]);
		System.out.println("Monedas de 2: "+numDineroUsado[4]);
		System.out.println("Monedas de 1: "+numDineroUsado[5]);
		System.out.println("Monedas de 0.50: "+numDineroUsado[6]);
		System.out.println("Monedas de 0.20: "+numDineroUsado[7]);
		System.out.println("Monedas de 0.10: "+numDineroUsado[8]);
		System.out.println("Monedas de 0.5: "+numDineroUsado[9]);
		System.out.println("Monedas de 0.02: "+numDineroUsado[10]);
		System.out.println("Monedas de 0.01: "+numDineroUsado[11]);
		
	}
	
}
