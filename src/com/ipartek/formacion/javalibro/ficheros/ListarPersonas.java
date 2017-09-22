package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
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
	static int contPersArray = 0;
	static int contPersArrayCatch = 0;
	static FileReader fr = null;
	static BufferedReader br = null;
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	static final int NUM_CAMPOS_LINEA = 7;
	static String[] campos = null;

	public static void main(String[] args) throws NumberFormatException, PersonaException {

		try {

			ArrayList<Persona> aPersona = new ArrayList<Persona>();
			fr = new FileReader("C:\\desarrolloNuevo\\personas.txt");
			br = new BufferedReader(fr);
			String linea = "";
			String[] campos = null;

			try {

				while ((linea = br.readLine()) != null) {

					Persona p = null;
					campos = linea.split(",");
					contPers++;

					try {
						// contPersArray++;
						p = mapeoLinea(campos);
						aPersona.add(p);
					} // FIN TRY PERSONAS

					catch (Exception e) {

						// contPersArrayCatch++;
						// aPersona.add(p);
					} // FIN CATCH PERSONAS

				} // FIN WHILE

			} // FIN TRY BUFFEREDREADER

			catch (Exception e) {
				// TODO: handle exception
			} // FIN CATCH BUFFEREDREADER

			/*
			 * for (int i = 0; i < aPersona.size(); i++) {
			 * 
			 * System.out.println(aPersona.get(i));
			 * 
			 * }
			 */

		} // FIN TRY FILES
		catch (FileNotFoundException e) {
			e.printStackTrace();

		} // FIN CATCH FILES
		finally {

			try {

				br.close();
				fr.close();

			} // FIN TRY CERRAR
			catch (IOException e) {

				e.printStackTrace();
			} // FIN CATCH CERRAR
		} // FIN FINALLY
	}// fin main

	public static ArrayList<Persona> getArrayListPersonas() {

		ArrayList<Persona> resul = new ArrayList<Persona>();
		String[] campos;

		if (resul != null) {
			try {

				fr = new FileReader("data\\personasSimple.txt");
				br = new BufferedReader(fr);
				String linea = "";

				try {

					while ((linea = br.readLine()) != null) {

						Persona p = null;
						campos = linea.split(",");
						contPers++;

						try {
							// contPersArray++;
							p = mapeoLinea(campos);
							resul.add(p);
						} // FIN TRY PERSONAS

						catch (Exception e) {

							// contPersArrayCatch++;
							// aPersona.add(p);
						} // FIN CATCH PERSONAS

					} // FIN WHILE

				} // FIN TRY BUFFEREDREADER

				catch (Exception e) {
					// TODO: handle exception
				} // FIN CATCH BUFFEREDREADER

			} // FIN TRY FILES
			catch (FileNotFoundException e) {
				e.printStackTrace();

			} // FIN CATCH FILES
			finally {

				try {

					br.close();
					fr.close();

				} // FIN TRY CERRAR
				catch (IOException e) {

					e.printStackTrace();
				} // FIN CATCH CERRAR
			}

		}
		return resul;

	}

	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2],
				Integer.parseInt(campos[CAMPOS_EDAD]), campos[CAMPOS_MAIL], campos[CAMPOS_DNI], campos[CAMPOS_ROL]);
		return p;
	}

}
