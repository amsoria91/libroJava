package com.ipartek.formacion.javalibro.pojo;

public class Pelicula {

	long id;
	String titulo;
	String escritor;
	
	public Pelicula(String titulo, String escritor) {
		super();
		this.id = -1;
		this.titulo = titulo;
		this.escritor = escritor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEscritor() {
		return escritor;
	}
	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}
}
