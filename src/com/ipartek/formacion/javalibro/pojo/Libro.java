package com.ipartek.formacion.javalibro.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;
import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class Libro implements Imprimible, Vendible {

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

		if (numPaginas > 0) {
			this.numPaginas = numPaginas;

		} else {

			this.numPaginas = 0;
		}
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", getPrecio()="
				+ getPrecio() + "€]";
	}

	/* Sin especificar == packages como calificador de acceso */
	void imprimir() {

		System.out.println("Imprimiendo...");
	}

	public float getPrecio() {

		float resul = 0;

		resul = (float) (numPaginas * 0.2);

		if (resul < Vendible.PRECIO_MINIMO) {

			resul = 0;
		}

		return resul;

	}
	/*
	 *  Se puede acceder desde la propia clase, desde el mismo "package" o desde otro (siendo clase hija o subclase) y desde cualquier "subclase" o "clase hija", pero no se puede ver desde una clase de otro "package".
	 */
	protected void metodoProtegido() {
		
		System.out.println("Soy un metodo protegido");
	}
	
	
	

}
