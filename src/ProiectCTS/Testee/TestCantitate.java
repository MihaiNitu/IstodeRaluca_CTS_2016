package ProiectCTS.Testee;

import static org.junit.Assert.*;

import org.junit.Test;

import ProiectCTS.Command.Autoturisme;


public class TestCantitate {

	@Test
	public void testValAberante() {
		Autoturisme a = new Autoturisme("",99999999);
		Teste test = new Teste();
		boolean result = test.testCantitate(a.getCantitate());
		assertFalse(result);
	}
	
	@Test
	public void testNegative() {
		Autoturisme a = new Autoturisme("",-13);
		Teste test = new Teste();
		boolean result = test.testCantitate(a.getCantitate());
		assertFalse(result);
	}
	@Test
	public void testZero() {
		Autoturisme a = new Autoturisme("",0);
		Teste test = new Teste();
		boolean result = test.testCantitate(a.getCantitate());
		assertFalse(result);
	}
	@Test
	public void testNormalValue() {
		Autoturisme a = new Autoturisme("",210);
		Teste test = new Teste();
		boolean result = test.testCantitate(a.getCantitate());
		assertTrue(result);
	}

}
