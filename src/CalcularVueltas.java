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
	
	
	
	public static void main(String[] args) {
		
		double compraTotal=1326.24;
		double [] billetes = {500,50,20,10,5};
		double [] monedas = {2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		double vueltas=(billetes[0]*4)-compraTotal;
		
		int []numBilletesUsados= {0,0,0,0,0};
		int []numMonedasUsados= {0,0,0,0,0,0,0,0};
		
		while(vueltas-billetes[1]>0) {
			
			vueltas=vueltas-billetes[1];
			numBilletesUsados[1]++;
		}while(vueltas-billetes[2]>0) {
			
			vueltas=vueltas-billetes[2];
			numBilletesUsados[2]++;
		}while(vueltas-billetes[3]>0) {
			
			vueltas=vueltas-billetes[3];
			numBilletesUsados[3]++;
		}while(vueltas-billetes[4]>0) {
			
			vueltas=vueltas-billetes[4];
			numBilletesUsados[4]++;
		}while(vueltas-monedas[0]>0) {
			
			vueltas=vueltas-monedas[0];
			numMonedasUsados[0]++;
		}while(vueltas-monedas[1]>0) {
			
			vueltas=vueltas-monedas[1];
			numMonedasUsados[1]++;
		}while(vueltas-monedas[2]>0) {
			
			vueltas=vueltas-monedas[2];
			numMonedasUsados[2]++;
		}while(vueltas-monedas[3]>0) {
			
			vueltas=vueltas-monedas[3];
			numMonedasUsados[3]++;
		}while(vueltas-monedas[4]>0) {
			
			vueltas=vueltas-monedas[4];
			numMonedasUsados[4]++;
		}while(vueltas-monedas[5]>0) {
			
			vueltas=vueltas-monedas[5];
			numMonedasUsados[5]++;
		}while(vueltas-monedas[6]>0) {
			
			vueltas=vueltas-monedas[6];
			numMonedasUsados[6]++;
		}while(vueltas-monedas[7]>0) {
			
			vueltas=vueltas-monedas[7];
			numMonedasUsados[7]++;
		}
		
		
		System.out.println(vueltas);
		System.out.println("Billetes de 50 " +numBilletesUsados[1]);
		System.out.println("Billetes de 20 " +numBilletesUsados[2]);
		System.out.println("Billetes de 10 " +numBilletesUsados[3]);
		System.out.println("Billetes de 5 " +numBilletesUsados[4]);
		System.out.println("Monedas de 2 "+numMonedasUsados[0]);
		System.out.println("Monedas de 1 "+numMonedasUsados[1]);
		System.out.println("Monedas de 0.50 "+numMonedasUsados[2]);
		System.out.println("Monedas de 0.20 "+numMonedasUsados[3]);
		System.out.println("Monedas de 0.10 "+numMonedasUsados[4]);
		System.out.println("Monedas de 0.5 "+numMonedasUsados[5]);
		System.out.println("Monedas de 0.2 "+numMonedasUsados[6]);
		System.out.println("Monedas de 0.1 "+numMonedasUsados[7]);
		
	}
	
}
