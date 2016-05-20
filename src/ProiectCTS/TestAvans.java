package ProiectCTS;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestAvans {

	@Test
	public void testAvans() {
		Teste teste= new Teste();
		SingletonCerere cerere = SingletonCerere.getCerere();
		assertFalse(teste.avansMare(20));
		
	}
	@Test
	public void testAvans2() {
		Teste teste= new Teste();
		SingletonCerere cerere = SingletonCerere.getCerere();
		assertTrue(teste.avansMare(60));
		
	}
	
	@Test
	public void testAvans3() {
		Teste teste= new Teste();
		SingletonCerere cerere = SingletonCerere.getCerere();
		assertFalse(teste.avansMare(0));
		
	}
	@Test
	public void testAvans4() {
		Teste teste= new Teste();
		SingletonCerere cerere = SingletonCerere.getCerere();
		assertFalse(teste.avansMare(150));
		
	}
	@Test
	public void testAvans5() {
		Teste teste= new Teste();
		SingletonCerere cerere = SingletonCerere.getCerere();
		assertFalse(teste.avansMare(-5));
		
	}
}
