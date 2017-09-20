package com.ipartek.formacion.javalibro.excepciones;

public class PersonaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public final static String EXCEPTION_EDAD_MENOR = "La edad no puede ser menor que 18";
	public final static String EXCEPTION_EMAIL_ERROR = "El email tiene formato incorrecto";
	public final static String EXCEPTION_DNI_ERROR = "El dni es incorrecto";

	public PersonaException(String messageException) {

		super(messageException);

	}

}
