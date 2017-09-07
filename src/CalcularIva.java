import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t\t\tCalculadora IVA 21%");
		System.out.println("\t\t\t-----------------------------------");

		System.out.println("Por favor dame el importe en €");

		float importe = sc.nextFloat();

		System.out.println("iva repercutido: " + importe * 0.21);
		
		System.out.println();
		
		System.out.println("¿Quieres volver a teclear el importe?");

		String respuesta = sc.next();

		System.out.println(respuesta);

		while ("s".equalsIgnoreCase(respuesta)) {

			System.out.println();
			
			System.out.println("Por favor dame el importe en €");
			
			importe = sc.nextFloat();

			System.out.println();

			System.out.println("iva repercutido: " + importe * 0.21);
			
			System.out.println();

			System.out.println("¿Quieres volver a teclear el importe?");
			
			respuesta = sc.next();
		}
		System.out.println();

		System.out.println("Gracias por venir");
		
		sc.close();

	}
}
