package com.ipartek.formacion.javalibro.pojo;

import junit.framework.TestCase;

public class LibroTest extends TestCase {

	public void testGetPrecio() {

		Libro l = new Libro("100 años de soledad");
		l.setAutor("Gabriel Garcia");
		l.setNumPaginas(307);
		l.getPrecio();

		LibroElectronico le = new LibroElectronico("Años Salvajes");

		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setNumPaginas(523);
		le.getPrecio();

		LibroPapel lp = new LibroPapel("Papillón");

		lp.setAutor("Henri Charriere");
		lp.setTapaBlanda(true);
		lp.setNumPaginas(789);
		lp.getPrecio();

		LibroPapel lp2 = new LibroPapel("Papillón");

		lp2.setAutor("Henri Charriere");
		lp2.setTapaBlanda(false);
		lp2.setNumPaginas(789);
		lp2.getPrecio();

		LibroElectronico precioIncorrecto = new LibroElectronico("Precio Malo");
		precioIncorrecto.setNumPaginas(0);

		Libro paginasIncorrectas = new Libro("Paginas mal");
		paginasIncorrectas.setNumPaginas(0);

		// prueba
		assertEquals(true, true);

		// precios esperados
		assertEquals(61.4f, l.getPrecio());
		assertEquals(99.6f, le.getPrecio());
		assertEquals(159.3f, lp.getPrecio());
		assertEquals(157.8f, lp2.getPrecio());

		// precio negativo
		assertEquals(0f, precioIncorrecto.getPrecio());

		// paginas negativas
		assertEquals(0, paginasIncorrectas.getNumPaginas());

	}

}
