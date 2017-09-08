import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {

	private String titulo;
	private String artista;
	private String minutos;
	
	
	
	
	public Cancion(String titulo, String artista, String minutos) {
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
	
	String mostrarDetalles() {
		
		String resul="Titulo\t"+this.getTitulo()+"\tArtista\t\t"+this.getArtista()+"\tDuracion\t"+this.minutos;
		
		return resul;
	}
	
	String listarCanciones() {
		
		String resul="Titulo\t"+this.getTitulo()+ "\treproduciendo...";
		
		return resul;
	}
	
	public void anadirCanciones(Cancion cancion) {
		
		
	}
	
	int eliminarCanciones() {
		
		int resul=0;
		
		return resul;
	}
	
}
