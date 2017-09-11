
public class Participante {

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

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) throws ParticipanteException {

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

}
