package com.ipartek.formacion.javalibro.pojo;

public class Libro {

	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "anonimo";
		this.numPaginas = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
	
	/*Sin especificar == packages como calificador de acceso*/
	void imprimir() {
		
		System.out.println("Imprimiendo...");
	}
	
	
	
	
}
