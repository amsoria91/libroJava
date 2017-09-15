package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma
 * recursiva los ficheros, hasta encontrar dentro de un .txt la palabra
 * "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * 
 * @author ur00
 *
 */
public class BuscarPalabra {

	public static void main(String[] args) {

		File f = new File("C:\\desarrolloNuevo\\buscatesoro");
		buscarPalabra(f, "osobuko");
	}

	private static void buscarPalabra(File f, String busqueda) {

		// recursos para lectura de ficheros de caracteres

		File[] ficheros = f.listFiles();
		FileReader fr = null;
		BufferedReader br = null;

		for (File fichero : ficheros) {// recorremos todos los ficheros que hay en la carpeta

			if (fichero.isDirectory()) {// es un directorio. Si es directorio que vuelva a buscar en la siguiente hasta
										// que no sea directorio(que sea fichero)

				buscarPalabra(fichero, busqueda);

			} else { // si no es directorio, es fichero y buscamos la palabra

				try {

					fr = new FileReader(fichero);
					br = new BufferedReader(fr);
					String linea = "";

					while ((linea = br.readLine()) != null) { // leeemos linea a linea todo el fichero de texto

						linea.indexOf(busqueda);
						if (linea.indexOf(busqueda) != -1) { // IndexOf devuelve -1 si no encuentra la palabra, por se
																// busca como diferente

							System.out.println("Hemos encontrado la palabra " + busqueda + " en fichero " + fichero);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

					try {
						br.close();
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} // finally
			} // end else

		} // end for ficheros

	}// end buscar palabra

}// end clase
