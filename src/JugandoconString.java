
public class JugandoconString {

	public static void main(String[] args) {

		String manolo= "Manolo Kabezabolo";
		
		//convertir a minusculas 
		
		System.out.println(manolo.toLowerCase());
		
		//convertir a mayusculas
		
		System.out.println(manolo.toUpperCase());
		
		//mostrar numero de caracteres
		
		System.out.println(manolo.length());
		
		//mostrar posicion de la letra "K"(7)
		
		System.out.println(manolo.indexOf('K'));
		
		
		//separar en dos variables el nombre y el 'apellido' con substring
		
		
		String nombre=manolo.substring(0, 6);//Manolo
		System.out.println(nombre);
		String apellido=manolo.substring(7, 17);//Kabezabolo
		System.out.println(apellido);
		
		
		/*	Comparando	*/
		
		String c1= "casa";
		String c2= "Casa";
		
		//comparar c1 y c2 con equals y equalsIgnoreCase(Strings no se comparan con == o !=)
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsIgnoreCase(c2));
		
		
		/*	Limpiando entradas de datos	*/
		
		String c3= "perro";
		String c4="      perro     ";
		
		System.out.println(c3);
		System.out.println(c4.trim());
		
		//las dos variables deben ser igual(usar trim)
		
		String lorem="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique magna non elementum facilisis. Suspendisse ultricies finibus massa, at ullamcorper felis aliquet a. Aliquam gravida volutpat purus nec faucibus. Ut sodales enim ac gravida fermentum. Aenean id est at mauris vehicula tincidunt et sit amet erat. Morbi et tincidunt massa, scelerisque maximus quam. Sed hendrerit fermentum venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin faucibus hendrerit sem. Aliquam erat volutpat. Ut in condimentum eros. Praesent molestie justo quis porta finibus. Etiam laoreet, odio at auctor sodales, arcu arcu finibus ligula, a facilisis elit tellus laoreet turpis. Nulla mattis mattis mi sed aliquet. Duis dignissim commodo vulputate.";
		int contadorVocales = 0;
		char vocalA='a';
		char vocalE='e';
		char vocalI='i';
		char vocalO='o';
		char vocalU='u';
		char vocala='A';
		char vocale='E';
		char vocali='I';
		char vocalo='O';
		char vocalu='U';
		
		//mostrar longitud 
		
		System.out.println(lorem.length());
		
		//contar todas las vocales
		
		for (int i = 0; i < lorem.length(); i++) {
			
			if ((lorem.charAt(i)==vocalA) || (lorem.charAt(i)==vocalE) || (lorem.charAt(i)==vocalI) || (lorem.charAt(i)==vocalO) || (lorem.charAt(i)==vocalU)||(lorem.charAt(i)==vocala) || (lorem.charAt(i)==vocale) || (lorem.charAt(i)==vocali) || (lorem.charAt(i)==vocalo) || (lorem.charAt(i)==vocalu)){
				contadorVocales++;
			  }
			
		}
		
		System.out.println(contadorVocales+ " vocales");
		
		
		//contar palabras
		
		
		System.out.println(lorem.split(" ").length +" palabras");
		
		//indicar el numero de veces que aparece 'at'
		
		int contadorAt=0;
		char constantT='t';
		String palabraAt="at";
		int index=0;
		
		
		while(index!=-1) {
			
			index=lorem.indexOf(palabraAt);
			
			if(index!=-1) {
				
				contadorAt++;
				lorem = lorem.substring(index);
			}
			
			
			}
			
		System.out.println(contadorAt);
		
	
	}

	
}
