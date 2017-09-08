import java.util.ArrayList;
import java.util.Scanner;

public class MenuCanciones {

	static Scanner sc = new Scanner(System.in);
	static Cancion cancion;
	static ArrayList<Cancion> canciones = new ArrayList<Cancion>();

	public static void anadirCanciones(Cancion cancion) {

		canciones.add(cancion);
		listarCanciones();
	}

	public static void eliminarCanciones(int indice) {

		canciones.remove(indice);
	}

	public static void listarCanciones() {

		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(i + 1 + "-" + canciones.get(i).listarCanciones());
		}
	}

	public static void mostrarDetalles() {

		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(i + 1 + "-" + canciones.get(i).mostrarDetalles());
		}
	}

	public static void main(String[] args) {

		canciones.add(new Cancion("c1", "c1", "c1"));
		canciones.add(new Cancion("c2", "c2", "c2"));
		canciones.add(new Cancion("c3", "c3", "c3"));
		canciones.add(new Cancion("c4", "c4", "c4"));
		canciones.add(new Cancion("c5", "c5", "c5"));
		canciones.add(new Cancion("c6", "c6", "c6"));
		canciones.add(new Cancion("c7", "c7", "c7"));
		canciones.add(new Cancion("c8", "c8", "c8"));
		canciones.add(new Cancion("c9", "c9", "c9"));
		canciones.add(new Cancion("c10", "c10", "c10"));

		//Añade una cancion nueva y lista todas las canciones disponibles
		System.out.println("Teclee Titulo,Artista y duracion");
		anadirCanciones(cancion = new Cancion(sc.next(), sc.next(), sc.next()));

		System.out.println();
		
		//Seleccionas el numero de pista que quieras eliminar
		System.out.println("Seleccione el numero de cancion que desea eliminar");
		eliminarCanciones(sc.nextInt() - 1);
		
		//Muestra los detalles de las canciones(Artista y Duración)
		System.out.println();
		System.out.println("Mostramos los detalles de todas las canciones");
		mostrarDetalles();
		
		sc.close();

	}
	
}
