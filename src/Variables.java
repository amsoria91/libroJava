import java.text.NumberFormat;

import javax.swing.plaf.OptionPaneUI;

/*
 * Ejercicio para probar las variables de Java
 */
public class Variables {
	
	/**
	 * Metodo obtiene simbolo ASCII de 'chech' o 'cross'
	 * @param valor boolean 
	 * @return si valor true check,si false cross
	 */
	public static char dameSimbolo(boolean valor) {
	
		char simbolo='\u2716';
		
		if (valor==true) {
			
			simbolo='\u2713';
			
		}
		
		return simbolo;
		
	}

	public static void main(String[] args) {

		
		System.out.println("Ejercicio con Variables");
		System.out.println();
		
		System.out.println("1.Enteros");
		System.out.println("2.Reales");
		System.out.println("3.Boolean");
		System.out.println("4.Char/Caracteres");
		System.out.println();
		

		
		System.out.println("1.Enteros: ");
		System.out.println();
		
		//TODO terminar de poner el resto
		System.out.println("byte "+Byte.BYTES+" bytes byte "+Byte.MIN_VALUE+" a "+Byte.MAX_VALUE);
		System.out.println("short "+Short.BYTES+" bytes short "+Short.MIN_VALUE+" a "+Short.MAX_VALUE);
		System.out.println("int " +Integer.BYTES+" bytes entero "+Integer.MIN_VALUE+" a "+Integer.MAX_VALUE);
		System.out.println("long "+Long.BYTES+" bytes long "+Long.MIN_VALUE+" a "+Long.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("2.Reales: ");
		System.out.println();
		
		float sueldoMesGerman=1200.25f;
		float sueldoMesLander=(float)2400.50;
		
		double nuevoDouble;
		
		System.out.println("double "+Double.BYTES+" bytes double "+Double.MIN_VALUE+" a "+Double.MAX_VALUE);
		System.out.println("float "+Float.BYTES+" bytes float "+Float.MIN_VALUE+" a "+Float.MAX_VALUE);
		System.out.println();
		
		System.out.println("German cobra "+NumberFormat.getInstance().format(sueldoMesGerman)+"� al mes");
		
		String sSueldoGerman= String.valueOf(sueldoMesGerman);
		
		sSueldoGerman = sSueldoGerman.replace(".", ",");
		
		System.out.println("German cobra "+sSueldoGerman+"� al mes");
		
		System.out.println();
		
		//TODO declarar una variable primitiva de cada tipo y usar su Wraper
		
		System.out.println("3.Boolean: ");
		
		boolean nuevoBoolean=true;
		boolean nuevoBoolean2=false;
		
		System.out.println();
		
		System.out.println("4.Caracteres: ");
		System.out.println();
		
		char [] chars= {'a','F','3','j'};
	
		char cruz = '\u2717';
		String cross = "\ud800\udc35";
		
		System.out.println("\tDigito\tLetra\tMayus\tMinus");
		System.out.println();
		
		for (int i = 0; i < chars.length; i++) {
			
			System.out.println(chars[i]+ "\t"+
			dameSimbolo(Character.isDigit(chars[i]))+ "\t"+
			dameSimbolo(Character.isLetter(chars[i]))+ "\t"+
			dameSimbolo(Character.isUpperCase(chars[i]))+ "\t"+
			dameSimbolo(Character.isLowerCase(chars[i]))+ "\t");
			
			
		}
		
	}

}
