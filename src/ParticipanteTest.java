import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {

	public void testConstructor() {

		Participante p1 = new Participante("Ander", "anderuraga");
		p1.setEmail("auraga@ipartek.com");

		assertEquals("Ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/" + p1.getUsuarioGit(), p1.getLinkGitHub());

		try {
			Participante matusalem = new Participante("Matu", 235);
			fail("Deberia haber lanzado Excepcion");
		} catch (Exception e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}

	}

	public void testConstructorVacio() {

		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
		assertEquals("https://github.com/", p.getLinkGitHub());

	}

	public void testExceptionEdad() {

		Participante p1 = new Participante("Ander", "anderuraga");
		try {
			p1.setEdad(88);
		} catch (ParticipanteException e) {
			fail("No deberia lanzar Excepcion con edad 88");
			// e.printStackTrace();
		}
		try {
			p1.setEdad(-3);
			fail("Deberia haber lanzado Excepcion");
		} catch (ParticipanteException e) {

			assertEquals(ParticipanteException.EXCEPTION_MENOR_CERO, e.getMessage());
			assertTrue(true);
			// e.printStackTrace();
		}

		try {
			p1.setEdad(101);
		} catch (ParticipanteException e) {

			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());

		}

	}

}
