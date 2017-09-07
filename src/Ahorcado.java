import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Numeros del 1 al 10 aleatorios
 * 3 vidas para acertar el numnero
 * Si gana enhorabuena, sino lastima
 */

public class Ahorcado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numAdivinar = (int) (Math.random() * 9 + 1);
		int numTecleado = 0;
		int vidas = 3;
		boolean numCorrecto = false;


		while (vidas > 0) {

			System.out.println("Teclee el numero a adivinar");

			do {
				try {

					sc = new Scanner(System.in);

					numTecleado = sc.nextInt();

					numCorrecto = true;

				} catch (InputMismatchException e) {

					System.out.println("Valor incorrecto, introduce un numero entero, por ejemplo: 123");
				} catch (Exception e) {

					System.out.println("Que has hecho para que falle?");
				}

			} while (!numCorrecto);


			if (numTecleado == numAdivinar) {

				System.out.println("Enhorabuena has ganado!");
				
				System.out.println("¿Quieres jugar otra vez? (S/N)");
				
				String respuesta = sc.next();
				
				if ("s".equalsIgnoreCase(respuesta)) {
					
					vidas=3;
					numAdivinar = (int) (Math.random() * 10 + 1);
					
				}else {
					
					vidas=0;
				}

			} else {

				vidas--;
				if (vidas != 0) {

					System.out.println("Intentalo otra vez, te quedan " + vidas + " vidas");
				}
				
				if (vidas == 0) {

					System.out.println("Has Perdido!!");
					
					System.out.println("¿Quieres jugar otra vez? (S/N)");
					
					String respuesta = sc.next();
					
					if ("s".equalsIgnoreCase(respuesta)) {
						
						vidas=3;
						numAdivinar = (int) (Math.random() * 10 + 1);
						
					}
				}

			}
			
		}

		System.out.println("Fin de la partida");
		sc.close();
	}

}
