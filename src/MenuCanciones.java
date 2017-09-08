import java.util.ArrayList;
import java.util.Scanner;

public class MenuCanciones {

	static Scanner sc = new Scanner(System.in);
	static Cancion cancion;
	static ArrayList<Cancion> canciones;//=new ArrayList<Cancion>();
	static final int OP_LISTAR = 1;
	static final int OP_ELIMINAR = 2;
	static final int OP_CREAR = 3;
	static final int OP_DETALLE = 4;
	static final int OP_SALIR = 5;

	static int opcionSeleccionada = 1;

	

	public static void main(String[] args) {

		inicializarCanciones();
		mostrarMenu();
		pedirOpcion();
		
		while(opcionSeleccionada!=OP_SALIR) {
			
			switch (opcionSeleccionada) {
			case OP_LISTAR:
				listarCanciones();
				mostrarMenu();
				pedirOpcion();

				break;

			case OP_ELIMINAR:

				System.out.println("Seleccione numero de pista a eliminar");
				eliminarCanciones(sc.nextInt() - 1);
				listarCanciones();
				mostrarMenu();
				pedirOpcion();

				break;

			case OP_CREAR:

				System.out.println("Teclee Titulo,Artista y duracion");
				anadirCanciones(cancion = new Cancion(sc.next(), sc.next(), sc.next()));
				mostrarMenu();
				pedirOpcion();

				break;

			case OP_DETALLE:

				System.out.println("Mostramos los detalles de todas las canciones");
				mostrarDetalles();
				mostrarMenu();
				pedirOpcion();

				break;
				
				default:
				break;
			}
		}
		
		sc.close();

	}
	
	private static void inicializarCanciones() {

		canciones = new ArrayList<Cancion>();
		
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
	}

	private static void pedirOpcion() {

		Scanner sc = new Scanner(System.in);
		opcionSeleccionada = sc.nextInt();

	}

	private static void mostrarMenu() {

		System.out.println("Gestor Canciones");
		System.out.println("---------------------------");
		System.out.println(" 1. Listar ");
		System.out.println(" 2. Eliminar ");
		System.out.println(" 3. Crear ");
		System.out.println(" 4. Detalle ");
		System.out.println(" 5. Salir ");
		System.out.println("---------------------------");
		System.out.println("Selecciona una opcion del 1 al 5");

	}

	public static void anadirCanciones(Cancion cancion) {
		
		Scanner sc = new Scanner(System.in);

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

}
