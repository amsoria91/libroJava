
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hellow World");
		
		String [] alumnos= {
				
							"Ander",
							"Arkaitz",
							"Erlantz",
							"Fran",
							"Cristian",
							"Leire",
							"Mikel",
							"Josu",
							"Alberto",
							"Jon",
							"Lander",
							"German"};
		
		System.out.println("--------Listado Alumn@s--------");
		for (int i = 0; i < alumnos.length; i++) {
		
			System.out.println(i+1+" - "+alumnos[i]);
			
		}

	}

}
