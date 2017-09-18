package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.LibroElectronico;
import com.ipartek.formacion.javalibro.pojo.Participante;

/**
 * Creamos una Lista para contener Participantes y Libro
 * 
 * @author Administrador
 *
 */
public class ListaInterfaz {

	public static void main(String[] args) throws ParticipanteException {

		ArrayList<Imprimible> lista = new ArrayList<Imprimible>();

		// Creamos objetos de diferentes clases
		Libro l = new Libro("100 años de soledad");

		Libro l2 = new Libro("Años Salvajes");

		Participante p = new Participante("William", 50);

		// añadimos en la lista
		lista.add(l);
		lista.add(l2);
		lista.add(p);

		// recorremos la lista y mostramos

		for (Imprimible elem : lista) {

			if (elem instanceof Libro) {
				Libro libro = (Libro) elem;
				System.out.println("Libro: "+libro.getTitulo());

			} else if (elem instanceof Participante) {

				Participante participante = (Participante) elem;
				System.out.println("Participante: "+participante.getNombre());
				
			} else {

				System.out.println("No conocemos esta clase");
			}

		}

	}

}
