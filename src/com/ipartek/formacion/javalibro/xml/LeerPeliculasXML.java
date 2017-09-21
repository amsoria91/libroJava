package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Cancion;
import com.ipartek.formacion.javalibro.pojo.Pelicula;

public class LeerPeliculasXML {
	static final String PELICULAS_XML = "data\\peliculas.xml";
	static ArrayList<Pelicula> peliculas = null;

	public static void main(String[] args) {

		peliculas = new ArrayList<Pelicula>();

		System.out.println("Listado Peliculas");
		System.out.println("-----------------");

		// parsear el fichero XML
		try {
			
			//abrir documento xml
			File file = new File(PELICULAS_XML);
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factoria.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());

			
			//cojemos todos los elementos por el nombre del tag
			NodeList nPelicula = doc.getElementsByTagName("pelicula");
			Pelicula p = null;
			Element element = null;
			
			//recorremos la lista
			for (int i = 0; i < nPelicula.getLength(); i++) {
				
				//de cada nodo,lo convierto en un elemento
				element = (Element) nPelicula.item(i);
				//System.out.println(element.getAttribute("id"));
				String idString=(element.getAttribute("id"));
				String titulo = element.getElementsByTagName("titulo")
						.item(0).getTextContent();
				String escritor = element.getElementsByTagName("writer")
						.item(0).getTextContent();
				
				
				long id= Long.parseLong(idString);
				
				p=new Pelicula(titulo,escritor);
				p.setId(id);
				peliculas.add(p);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		// mostrar Cancion por pantalla
		for (Pelicula p: peliculas) {

			System.out.println("Pelicula " + p.getId());
			System.out.println("    Titulo: " + p.getTitulo());
			System.out.println("    Escritor: " + p.getEscritor());
			System.out.println("");
		}

	}

}