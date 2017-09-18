package com.ipartek.formacion.javalibro.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;

public class Participante implements Imprimible {

	// Atributos

	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;

	// Constructores

	public Participante() {
		super();
		this.nombre = "";
		this.usuarioGit = "";
		this.email = "";
		this.trabajador = false;
		this.edad = 0;
	}

	public Participante(String nombre, String usuarioGit) {
		this();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;

	}

	public Participante(String nombre, int edad) throws ParticipanteException {
		this();
		this.nombre = nombre;
		this.setEdad(edad);

	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getUsuarioGit() {
		return usuarioGit;
	}

	void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	boolean isTrabajador() {
		return trabajador;
	}

	void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

	// otros metodos

	String getLinkGitHub() {

		String resul = "https://github.com/" + this.usuarioGit;

		return resul;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws ParticipanteException {

		if (edad < 0) {

			throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_CERO);
		}

		if (edad > 100) {

			throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_CIEN);
		}

		this.edad = edad;

	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email + ", trabajador="
				+ trabajador + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (trabajador ? 1231 : 1237);
		result = prime * result + ((usuarioGit == null) ? 0 : usuarioGit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		if (edad != other.edad)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (trabajador != other.trabajador)
			return false;
		if (usuarioGit == null) {
			if (other.usuarioGit != null)
				return false;
		} else if (!usuarioGit.equals(other.usuarioGit))
			return false;
		return true;
	}

}
