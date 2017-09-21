package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.ipartek.formacion.javalibro.pojo.Persona;

/**
 * Leer linea a linea el fichero "data/personas.txt" y mostrar por pantalla.<br>
 * Contar el total de personas leidas.
 * 
 * 
 * @author ur00
 *
 */
public class ListarPersonas {

	static int contPers = 0;
	static FileReader fr = null;
	static BufferedReader br = null;

	public static void main(String[] args) {

		try {

			ArrayList<String> persona = new ArrayList<String>();
			fr = new FileReader("C:\\desarrolloNuevo\\personas.txt");
			br = new BufferedReader(fr);
			String linea = "";

			try {
				while ((linea = br.readLine()) != null) {

					persona.add(linea);
					contPers++;

				}

				for (int i = 0; i < persona.size(); i++) {

					System.out.println(persona.get(i));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("------------------------------------");
			System.out.println(contPers + " linea leidas");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} finally {

			try {

				br.close();
				fr.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}// fin main

	public static ArrayList getArrayListPersonas() {

		ArrayList<String> resul = new ArrayList<String>();

		if (resul != null) {
			try {

				fr = new FileReader("C:\\desarrolloNuevo\\personas.txt");
				br = new BufferedReader(fr);
				String linea = "";

				try {
					while ((linea = br.readLine()) != null) {

						resul.add(linea);

					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} finally {

				try {

					br.close();
					fr.close();

				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}
		return resul;

	}

}
