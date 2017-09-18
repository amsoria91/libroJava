package com.ipartek.formacion.javalibro.pojo;

public class LibrosRecomendados {

	public static void main(String[] args) {
		
		Libro l=new Libro("100 años de soledad");
		l.setAutor("Gabriel Garcia");
		l.setNumPaginas(307);
		
		
		LibroElectronico le = new LibroElectronico("Años Salvajes");

		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setNumPaginas(523);
		
		LibroPapel lp= new LibroPapel("Papillón");
		
		lp.setAutor("Henri Charriere");
		lp.setTapaBlanda(false);
		lp.setNumPaginas(789);
		
		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		
		le.imprimir();
		
	}

}
