import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {

	public void testConstructor() {

		Participante p1 = new Participante("Ander", "anderuraga");
		p1.setEmail( "auraga@ipartek.com");

		assertEquals("Ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/"+p1.getUsuarioGit(), p1.getLinkGitHub());
		
	}
	
	public void testConstructorVacio() {
		
		Participante p= new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
		assertEquals("https://github.com/", p.getLinkGitHub());
		
	}

}
