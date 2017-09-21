package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Cancion;

/**
 * Ejercicio para Aprender a leer o parsear un documento .XML
 * 
 * @author Administrador
 *
 */
public class LeerCancionesXML {

	static final String CANCIONES_XML = "data\\canciones.xml";
	static ArrayList<Cancion> canciones = null;

	public static void main(String[] args) {

		canciones = new ArrayList<Cancion>();

		System.out.println("Listado Canciones");
		System.out.println("-----------------");

		// parsear el fichero XML
		try {
			
			//abrir documento xml
			File file = new File(CANCIONES_XML);
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factoria.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());

			
			//cojemos todos los elementos por el nombre del tag
			NodeList nCanciones = doc.getElementsByTagName("cancion");
			Cancion c = null;
			Element element = null;
			
			//recorremos la lista
			for (int i = 0; i < nCanciones.getLength(); i++) {
				
				//de cada nodo,lo convierto en un elemento
				element = (Element) nCanciones.item(i);
				//System.out.println(element.getAttribute("id"));
				String idString=(element.getAttribute("id"));
				String nombre = element.getElementsByTagName("nombre")
						.item(0).getTextContent();
				String artista = element.getElementsByTagName("artista")
						.item(0).getTextContent();
				String duracion = element.getElementsByTagName("duracion")
						.item(0).getTextContent();
				
				long id= Long.parseLong(idString);
				
				c=new Cancion(nombre,artista,duracion);
				c.setId(id);
				canciones.add(c);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		// mostrar Cancion por pantalla
		for (Cancion c : canciones) {

			System.out.println("Cancion " + c.getId());
			System.out.println("    Nombre: " + c.getTitulo());
			System.out.println("    Artista: " + c.getArtista());
			System.out.println("    Duracion: " + c.getMinutos());
			System.out.println("");
		}

	}

}
