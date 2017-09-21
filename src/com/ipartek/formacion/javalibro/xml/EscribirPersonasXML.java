package com.ipartek.formacion.javalibro.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.ficheros.ListarPersonas;

/**
 * Ejercicio para convertir un data\personas.txt a data\personas.xml
 * 
 * Estructura del TXT:<br>
 * 
 * Ted,Upton,Sant Andreu De La
 * Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 * 
 * Estructura del XML:<br>
 * 
 * <peronas> <persona> <nombre>Ted</nombre> <apellido1>Upton</apellido1>
 * <apellido2>Sant Andreu De La Barca</apellido2> <edad>8</edad>
 * <email>tedfupton@mailinator.com</email> <dni>12277015Y</dni>
 * <rol>TRABAJADOR</rol> </persona> <persona> ... </persona> </personas>
 * 
 * @author Administrador
 *
 */
public class EscribirPersonasXML {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// crear nodo raiz
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);

			// conseguir un ArrayList<Personas> a partir del fichero de texto
			// un bucle para todas las personas
			// añadir Elementos Persona al nodo raiz
			Element ePersona = doc.createElement("persona");
			Element eNombre = doc.createElement("nombre");
			Element eApel1 = doc.createElement("apellido1");
			Element eApel2 = doc.createElement("apellido2");
			Element edad = doc.createElement("edad");
			Element email = doc.createElement("email");
			Element dni = doc.createElement("dni");
			Element rol = doc.createElement("rol");

			for (int i = 0; i < ListarPersonas.getArrayListPersonas().size(); i++) {

				eNombre.setTextContent("Ted");
				eApel1.setTextContent("Upton");
				eApel2.setTextContent("Sant Andreu De La Barca");
				edad.setTextContent("8");
				email.setTextContent("tedfupton@mailinator.com");
				dni.setTextContent("12277015Y");
				rol.setTextContent("TRABAJADOR");

			}

			// TODO resto de campos o elementos
			ePersona.appendChild(eNombre);
			ePersona.appendChild(eApel1);
			ePersona.appendChild(eApel2);
			ePersona.appendChild(edad);
			ePersona.appendChild(email);
			ePersona.appendChild(dni);
			ePersona.appendChild(rol);
			rootElement.appendChild(ePersona);

			// guardar en el fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("data\\personas.xml"));
			transformer.transform(source, result);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
