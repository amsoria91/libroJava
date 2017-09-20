package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Nos conectaremos a una pagina Web http:\\http://www.example.com/ para
 * descargar el codigo fuente.
 * 
 * @author Administrador
 *
 */
public class ConectarPaginaWeb {

	final static String PAGINA_WEB = "http://www.example.com/";
	static URL url;
	static URLConnection con;
	static InputStreamReader isR;
	static BufferedReader br;
	static String linea;
	static String lineaGuardada[];

	public static void main(String[] args) {

		try {

			// CREANMOS URL
			url = new URL(PAGINA_WEB);

			// ABRIMOS CONEXION
			con = url.openConnection();

			// CREAMOS INTPUTSTREAMREADER Y BUFFERREADER ASOCIADOs
			isR = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isR);
			linea = "";

			// LEEMOS LINEA A LINEA
			while ((linea = br.readLine()) != null) {

				// CONSEGUIR H1
				if (linea.indexOf("<a") != -1) {

					lineaGuardada = linea.split("<p><a href=\"");
					//lineaGuardada = linea.split("\">More information...</a></p>");
					System.out.println(linea);
				}

			}

			for (int i = 0; i < lineaGuardada.length; i++) {

				System.out.println(lineaGuardada[i]);
			}

		} // FIN TRY
		catch (MalformedURLException e) {

			System.out.println("URL mal escrita " + PAGINA_WEB);
			e.printStackTrace();
		} // FIN CATCH1
		catch (IOException e) {

			System.out.println("No podemos establecer conexion");
			e.printStackTrace();
		} // FIN CATCH2

	}

}
