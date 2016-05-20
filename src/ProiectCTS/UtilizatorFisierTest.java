package ProiectCTS;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class UtilizatorFisierTest {

	@Test
	public void testEmptyUtilizator() {
		Teste teste = new Teste();
		File f = new File("utilizator.txt");
		assertFalse(teste.fileEmpty(f));
	}

	@Test
	public void testEmptyManageri() {
		Teste teste = new Teste();
		File f = new File("manageri.txt");
		assertFalse(teste.fileEmpty(f));
	}
		
	@Test
	public void testEmptyReprezentanti() {
		Teste teste = new Teste();
		File f = new File("reprezentanti.txt");
		assertFalse(teste.fileEmpty(f));
	}
	
	@Test
	public void testFisierNull() {
		Teste teste = new Teste();
		File f = null;
		assertFalse(teste.fileEmpty(f));
	}
}
