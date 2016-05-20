package ProiectCTS.Testee;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;



public class TestAvans {

	@Test
	@Ignore
	public void testAvans() {
		Teste teste= new Teste();
		assertFalse(teste.avansMare(20));
		
	}
	@Test
	public void testAvans2() {
		Teste teste= new Teste();
		assertTrue(teste.avansMare(60));
		
	}
	
	@Test
	public void testAvans3() {
		Teste teste= new Teste();
		assertFalse(teste.avansMare(0));
		
	}
	@Test
	public void testAvans4() {
		Teste teste= new Teste();
		assertFalse(teste.avansMare(150));
		
	}
	@Test
	public void testAvans5() {
		Teste teste= new Teste();
		assertFalse(teste.avansMare(-5));
		
	}
}
