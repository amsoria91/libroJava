
public class Participante {

	// Atributos

	
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;

	// Constructores

	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email = " ";
		this.trabajador = false;
	}

	public Participante() {
		super();
		this.nombre="";
		this.usuarioGit = "";
		this.email = "";
		this.trabajador = false;
	}

	// getters y setters

	String getNombre() {
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

	public String toString() {
		return "Participante [nombre=" + this.nombre + ", usuarioGit=" + this.usuarioGit + ", email=" + this.email + ", trabajador="
				+ this.trabajador + "]";
	}

}
