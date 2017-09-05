
public class TocaLeer {

	/**
	 * @param args
	 */
	
	static String [] alumnos= {"Arkaitz",
								"Erlantz",
								"Fran",
								"Cristian",
								"Leire",
								"Mikel",
								"Josu",
								"Alberto",
								"Jon",
								"Naiara",
								"Lander",
								"German"};
	
	public static void main(String[] args) {
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length);
		
		//generar numero aleatorio
		
		System.out.println("El afortunad@ es: "+alumnos[numAleatorio]);
		
		
	}
	
	/**
	 * Metodo que genera un numero aleatorio entre el numero 0 y <code>max</code>
	 * @param max int numero maximo que puede generar
	 * @return int aleatorio
	 */
	
	public static int generarNumeroAleatorio( int max ){
		
	//TODO falta implementar logica
		
		int resul = -1;
		
		resul=(int) (Math.random()*max);
		
		return resul;
		
	}

}
