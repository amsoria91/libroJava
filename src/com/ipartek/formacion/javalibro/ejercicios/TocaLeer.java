package com.ipartek.formacion.javalibro.ejercicios;
import com.ipartek.formacion.javalibro.pojo.Participante;


public class TocaLeer {

	/**
	 * @param args
	 */
	
	/*static String [] alumnos= {"Arkaitz",
				            "Erlantz",
				            "Fran",
				            "Cristian",
				            "Leire" ,
				            "Mikel",
				            "Josu",
				            "Alberto",
				            "Jon",
				            "Arantza",
				            "Naiara",
				            "Lander",
				            "Yeray",
				            "German"};*/
	
	 static Participante[]alumnos = new Participante[15];
	
	
	public static void main(String[] args) {
		
		alumnos[0]= new Participante("Arkaitz", "arkaitzgl");
		alumnos[1]= new Participante("Erlantz1", "erliglesias");
		alumnos[2]= new Participante("Fran", "FranPerez92");
		alumnos[3]= new Participante("Cristhian", "CristianVar");
		alumnos[4]= new Participante("Erlantz2", "-Erlantzcabrejas ");
		alumnos[5]= new Participante("Leire", "LeireBustin");
		alumnos[6]= new Participante("mikel", "zoroa84");
		alumnos[7]= new Participante("Josu Larrazabal", "Katakume");
		alumnos[8]= new Participante("Alberto", "amsoria91");
		alumnos[9]= new Participante("Jon alarcon", "alarconsolis");
		alumnos[10]= new Participante("", "");
		alumnos[11]= new Participante("Naiara Mateos", "naiaramateos");
		alumnos[12]= new Participante("Lander", "LanderAB");
		alumnos[13]= new Participante("Yeray", "LordBlacKhiin");
		alumnos[14]= new Participante("", "");
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length);
		
		//generar numero aleatorio
		
		System.out.println("El afortunad@ es: "+alumnos[numAleatorio].getNombre());
		
		
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

