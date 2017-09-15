package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

	static File carpeta;
	static FileWriter fw = null;
	static BufferedWriter bw = null;
	static FileReader fr = null;
	static BufferedReader br = null;
	static String linea = "";
	static Scanner sc = new Scanner(System.in);
	static File rutaFichero = null;

	public static void crearFichero() {

		System.out.println("Escribe la ruta de la carpeta con formato: 'C:\\\\yyyyyy'");
		carpeta = new File(sc.nextLine());

		if (carpeta.exists()) {

			System.out.println("Ya existe una carpeta con ese nombre y en esa ruta");

		} else {

			carpeta.mkdir();

		}

	}

	public static void escribirFichero() {

		try {
			System.out.println();
			System.out.println("Escribe el nombre del txt(sin escribir ruta ni .txt)");

			rutaFichero = new File(carpeta + "\\" + sc.nextLine() + ".txt");

			if (rutaFichero.exists()) {

				System.out.println("Ya existe un fichero con ese nombre");
			} else {
				fw = new FileWriter(rutaFichero);
				bw = new BufferedWriter(fw);// Siempre vamos a trabajar con el Buffer
				
				System.out.println();
				System.out.println("Escribe dentro del txt");
				bw.write(sc.nextLine());

				System.out.println("Fichero creado con exito");
				System.out.println("------------------------");

			}
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

	public static void main(String[] args) {

		crearFichero();
		escribirFichero();
	}

}
