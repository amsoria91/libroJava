package com.ipartek.formacion.javalibro.ejercicios;

public class UtilidadesString {

	/**
	 * 
	 * Cuenta las palabras que esten contenidas dentro del 'texto'
	 * @param texto String donde buscar las palabras
	 * @param cadena String secuencia de caracteres que buscamos
	 * @return int 0 si no encuentra, numero de palabras encontradas
	 */
	static int buscarPalabra(String texto,String busqueda) {
		
		int resul = 0;
		int pos = 0;
		char [] caracteresValidos = {' ','.',',',';',':','-','(',')'};
		
		if(texto==null||busqueda==null) {
			
			resul=0;
			
		}else {
			
			do {
				
				
				//buscando hasta la posicion -1, donde ya no encuentra mas palabras(indexOf)
				
				//a,3,c,x,c   2=texto.infexOf("c")---->  resultado ++ ----> texto=texto.substring(2) para que siga
				
				//sumar uno al resultado
				
				//recortar el texto
				
				pos=texto.indexOf(busqueda);
				
				if(pos != -1) {
					
					resul++;
					
					texto=texto.substring(pos+busqueda.length());
				}
			}while(pos!=-1);

			}
			
		
		//TODO implementar despues del Test
		
		return resul;
		
	}
	
	
}
