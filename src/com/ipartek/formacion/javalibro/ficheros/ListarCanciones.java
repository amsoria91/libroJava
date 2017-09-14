package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/**
 * Listar todas las canciones de la carpeta "x"
 * 
 * @author Administrador
 *
 */
public class ListarCanciones {

	public static void main(String[] args) {
		/*
		 * 
		 * No funciona si es compleja la estructura de carpetas
		 * Hay que hacerlo mediante una funcion recursiva
		 * 
		 */
		File f = new File("c:\\desarrollo Nuevo\\Music");
		File[] carpetas = f.listFiles();
		System.out.println("Listado canciones");
		System.out.println("----------------------");

		for (File c : carpetas) {
			File[] canciones = c.listFiles();
			System.out.println("[" + canciones.length + " canciones] " + c.getName());
			System.out.println();

			for (File cancion : canciones) {
				System.out.println("    " + cancion.getName() + " " + (cancion.length() / 1024) + " Kb");
			}
		}

	}

}
