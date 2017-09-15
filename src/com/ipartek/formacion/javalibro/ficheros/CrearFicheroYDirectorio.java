package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYDirectorio {

	static File carpeta = new File("C:\\Directorio");
	static FileWriter fw = null;
	static BufferedWriter bw = null;
	static FileReader fr = null;
	static BufferedReader br = null;
	static String linea = "";
	static String fichero="\\prueba.txt";
	;

	public static void crearFichero() {

		carpeta.mkdir();
	}

	public static void escribirFichero() {

		try {
			fw = new FileWriter(carpeta + fichero);
			bw = new BufferedWriter(fw);// Siempre vamos a trabajar con el Buffer

			bw.write("Esto se escribe");

			System.out.println("Fichero creado con exito");
			System.out.println("------------------------");

		} catch (IOException e) {

			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {

			try {
				bw.close();
				fw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void leerFichero() {

		try {

			fr = new FileReader(carpeta + "\\prueba.txt");
			br = new BufferedReader(fr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (linea != null) {

				linea = br.readLine();

				if (linea != null) {
					
					System.out.println("Texto a leer");
					System.out.println("------------");
					System.out.println("Carpeta: "+carpeta.getName());
					System.out.println("------------");
					System.out.println("Fichero: prueba.txt");
					System.out.println("------------");
					System.out.println("Texto en fichero: "+linea);

				}
			}

			br.close();
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		crearFichero();
		escribirFichero();
		leerFichero();
	}

}
