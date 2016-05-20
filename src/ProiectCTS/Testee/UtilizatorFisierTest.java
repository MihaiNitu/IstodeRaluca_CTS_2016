package ProiectCTS.Testee;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;


public class UtilizatorFisierTest {

	@Test
	public void testUtilizator() {
		Teste teste = new Teste();
		File f = new File("utilizator.txt");
		assertEquals(3, teste.CitireFisier(f));
	}

	@Test
	public void testManageri() {
		Teste teste = new Teste();
		File f = new File("manageri.txt");
		assertEquals(2, teste.CitireFisier(f));
	}
		
	@Test
	public void testReprezentanti() {
		Teste teste = new Teste();
		File f = new File("reprezentanti.txt");
		assertEquals(1, teste.CitireFisier(f));
	}
	
	@Test
	public void testFisierNull() {
		Teste teste = new Teste();
		File f = new File("repdasasdafgagadgsarezentanti.txt");
		assertEquals(-1, teste.CitireFisier(f));
	}
}
