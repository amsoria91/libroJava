package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class ReescribirPersonasEstado {

	static final String PATH_FICHERO_PERSONAS = "data\\personasSimpleEjer1.txt";
	static final String PATH_FICHERO_PERSONASOK = "C:\\desarrolloNuevo\\personasOk.txt";
	static final String PATH_FICHERO_PERSONASERROR = "C:\\desarrolloNuevo\\personasError.txt";
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	static final int NUM_CAMPOS_LINEA = 7;
	static int persOk;
	static int persError;
	static int contLineas;
	static int lineasIncompletas;

	private static void escribirTxt() {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fwOk = null;
		FileWriter fwMal = null;
		BufferedWriter bwOk = null;
		BufferedWriter bwMal = null;

		try {
			
			//LEEMOS FICHERO DE PERSONAS
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			
			//FILE Y BUFFER READER PARA ESCRIBIR EN DISTINTOS FICHEROS
			fwOk = new FileWriter(PATH_FICHERO_PERSONASOK);
			bwOk = new BufferedWriter(fwOk);
			fwMal = new FileWriter(PATH_FICHERO_PERSONASERROR);
			bwMal = new BufferedWriter(fwMal);
			
			String linea = "";
			
			String[] campos;
			Persona p=null;

			while ((linea = br.readLine()) != null) {
				
				contLineas++;
				campos = linea.split(",");
				try {
					
					if (campos.length == NUM_CAMPOS_LINEA) {

						p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2],
								Integer.parseInt(campos[CAMPOS_EDAD]), campos[CAMPOS_MAIL], campos[CAMPOS_DNI],
								campos[CAMPOS_ROL]);
						
						bwOk.write(linea + "\r\n");
						bwOk.flush();
						persOk++;
						
					}//FIN DEL IF
					
					else {
						bwMal.write(linea + "\r\n");
						bwMal.flush();
						bwMal.newLine();
						lineasIncompletas++;
					} 
					
				} // FIN TRY PERSONA
				catch (PersonaException | NumberFormatException e) {
						
						
						bwMal.write(linea + "\r\n");
						bwMal.flush();
						persError++;
						// TODO Auto-generated catch block
						e.printStackTrace();
						
						
					
				} // FIN CATCH PERSONA

			} // FIN DEL WHILE

		} // FIN TRY FILES
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // FIN CATCH FILES

	}

	public static void main(String[] args) {

		escribirTxt();
		System.out.println("Numero de lineas = "+contLineas);
		System.out.println("Numero de lineas OK = "+persOk);
		System.out.println("Numero de lineas ERROR = "+persError);
		System.out.println("Numero de lineas INCOMPLETAS = "+lineasIncompletas);
		
	}

}
