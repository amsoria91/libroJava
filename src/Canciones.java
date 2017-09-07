import java.util.ArrayList;
import java.util.Scanner;

public class Canciones {

	private String titulo;
	private String artista;
	private String minutos;
	
	
	
	
	public Canciones(String titulo, String artista, String minutos) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.minutos = minutos;
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
	
	String listarCanciones() {
		
		String resul="Canciones: Titulo-> "+this.getTitulo()+" Artista-> "+this.getArtista()+" Minutos->"+this.minutos;
		
		return resul;
	}
	
	public void anadirCanciones(Canciones cancion) {
		
		
	}
	
	int eliminarCanciones() {
		
		int resul=0;
		
		return resul;
	}
	public static void main(String[] args) {
	
	}
}
