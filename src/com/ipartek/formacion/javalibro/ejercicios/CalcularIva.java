package com.ipartek.formacion.javalibro.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float importe = 0;
		boolean importeCorrecto = false;

		System.out.println("\t\t\t\tCalculadora IVA 21%");
		System.out.println("\t\t\t-----------------------------------");

		System.out.println("Por favor dame el importe en €");

		// comprobar que sea un numero correcto

		do {
			try {
				
				//TODO hacer lo que querais pero que pase por las otras excepciones
				/*
				sc = new Scanner(System.in);
				importe = sc.nextFloat();
				 */
				
				//Arithmetic Exception
				
				importe = 9/0;
				
				sc=null;
				sc.next();
				importeCorrecto = true;

				
			} catch (NullPointerException e) {

				System.out.println("Ya me diras como has metido un null");

			} catch (InputMismatchException e) {

				System.out.println("Valor incorrecto, introduce un numero correcto, por ejemplo: 123.33");

			} catch (Exception e) {

				System.out.println("Que has hecho para que falle?");
			}

		} while (!importeCorrecto);

		// Calculo del iva
		System.out.println("iva repercutido: " + importe * 0.21);

		// Si queremos repetir la operacion
		System.out.println("¿Quieres volver a teclear el importe?");

		String respuesta = sc.next();

		System.out.println(respuesta);

		while ("s".equalsIgnoreCase(respuesta)) {

			System.out.println("Por favor dame el importe en €");

			importe = sc.nextFloat();

			System.out.println("iva repercutido: " + importe * 0.21);

			System.out.println("¿Quieres volver a teclear el importe?");

			respuesta = sc.next();
		}

		System.out.println("Gracias por venir");

		sc.close();

	}
}
