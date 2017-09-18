package com.ipartek.formacion.javalibro.pojo;

public class LibrosRecomendados {

	public static void main(String[] args) {
		
		Libro l=new Libro("100 años de soledad");
		l.setAutor("Gabriel Garcia");
		l.setNumPaginas(307);
		l.getPrecio();
		l.metodoProtegido();
		
		
		LibroElectronico le = new LibroElectronico("Años Salvajes");

		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setNumPaginas(523);
		le.getPrecio();
		le.metodoProtegido();
				
		LibroPapel lp= new LibroPapel("Papillón");
		
		lp.setAutor("Henri Charriere");
		lp.setTapaBlanda(true);
		lp.setNumPaginas(789);
		lp.getPrecio();
		
		LibroElectronico precioIncorrecto= new LibroElectronico("Precio Malo");
		precioIncorrecto.setNumPaginas(0);
		
		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		System.out.println(precioIncorrecto);
		
		le.imprimir();
		
	}

}
