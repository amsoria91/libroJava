package com.ipartek.formacion.javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {

		long tInicio = System.currentTimeMillis();

		HashSet<String> listaNombres = new HashSet<String>();

		listaNombres.add("Manolo");
		listaNombres.add("Manola");
		listaNombres.add("Manolito");
		listaNombres.add("Manolita");
		listaNombres.add("Manuel");

		Iterator<String> it = listaNombres.iterator();
		String nombre = null;

		while (it.hasNext()) {

			nombre = (String) it.next();
			System.out.println("Nombre: " + nombre);
		}

		System.out.println("\nTiempo de ejecudion " + tInicio + " ms.");
		// para ordenar

	}

}
