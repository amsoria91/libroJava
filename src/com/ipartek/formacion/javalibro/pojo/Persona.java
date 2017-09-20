package com.ipartek.formacion.javalibro.pojo;

import java.util.regex.Pattern;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	public static int EDAD_MINIMA=18;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String email;
	private String dni;
	private String puesto;

	public Persona(String nombre, String apellido1, String apellido2, int edad, String email, String dni,
			String puesto) throws PersonaException{
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		setEdad(edad);
		setEmail(email);
		setDni(dni);
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}
	
	/**
	 * Setea la edad de la Persona
	 * @param edad int a�os de la Persona
	 * @throws PersonaException edad<18
	 */
	public void setEdad(int edad) throws PersonaException{

		if (edad < EDAD_MINIMA) {

			throw new PersonaException(PersonaException.EXCEPTION_EDAD_MENOR);

		}
		
		this.edad=edad;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws PersonaException {

		if(!Validaciones.email(email)) {
			
			throw new PersonaException(PersonaException.EXCEPTION_EMAIL_ERROR);

		}
		this.email=email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni)  throws PersonaException{
		
		if(!Validaciones.dni(dni)) {
			
			throw new PersonaException(PersonaException.EXCEPTION_DNI_ERROR);		
		
		}
		this.dni = dni;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", email=" + email + ", dni=" + dni + ", puesto=" + puesto + "]";
	}

}
