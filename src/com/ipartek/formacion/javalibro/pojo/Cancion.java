package com.ipartek.formacion.javalibro.pojo;
import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {

	private String titulo;
	private String artista;
	private String minutos;
	private long id;
	
	
	
	
	public Cancion(String titulo, String artista, String minutos) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.minutos = minutos;
		this.id=-1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getMinutos() {
		return minutos;
	}

	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String mostrarDetalles() {
		
		String resul="Titulo\t"+this.getTitulo()+"\tArtista\t\t"+this.getArtista()+"\tDuracion\t"+this.minutos;
		
		return resul;
	}
	
	public String listarCanciones() {
		
		String resul="Titulo\t"+this.getTitulo()+ "\treproduciendo...";
		
		return resul;
	}
	
	public void anadirCanciones(Cancion cancion) {
		
		
	}
	
	int eliminarCanciones() {
		
		int resul=0;
		
		return resul;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", minutos=" + minutos + ", id=" + id + "]";
	}
	
}
