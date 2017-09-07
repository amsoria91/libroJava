import java.util.ArrayList;

public class MenuCanciones {

	static Canciones cancion;
	static ArrayList<Canciones> canciones = new ArrayList<Canciones>();

	public static void anadirCanciones(Canciones cancion) {

		canciones.add(cancion);
		listarCanciones();
	}

	public static void eliminarCanciones(int indice) {

		canciones.remove(indice);
	}

	public static void listarCanciones() {

		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(i+"-"+canciones.get(i).listarCanciones());
		}
	}
	
	public static void mostrarDetalles() {
		
		
	}

	public static void main(String[] args) {

		canciones.add(new Canciones("c1", "c1", "c1"));
		canciones.add(new Canciones("c2", "c2", "c2"));
		canciones.add(new Canciones("c3", "c3", "c3"));
		canciones.add(new Canciones("c4", "c4", "c4"));
		canciones.add(new Canciones("c5", "c5", "c5"));
		canciones.add(new Canciones("c6", "c6", "c6"));
		canciones.add(new Canciones("c7", "c7", "c7"));
		canciones.add(new Canciones("c8", "c8", "c8"));
		canciones.add(new Canciones("c9", "c9", "c9"));
		canciones.add(new Canciones("c10", "c10", "c10"));

		anadirCanciones(cancion = new Canciones("c11", "c11", "c11"));
		eliminarCanciones(8);
		System.out.println();
		listarCanciones();

	}

}
