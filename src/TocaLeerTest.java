import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGenerarNumeroAleatorio() {
		int numeroAleatorio = -1;
		boolean [] aCheck= new boolean[15];
		
		for (int i = 0; i < 1000; i++) {
			
			
			numeroAleatorio= TocaLeer.generarNumeroAleatorio(15);
			aCheck[numeroAleatorio]=true;
			
		}
		
		//Comporbar que todas las posiciones sean true
		
		for (int i = 0; i < aCheck.length; i++) {
			
			assertTrue(aCheck[i]);
			
		}
		
		
	}

}
