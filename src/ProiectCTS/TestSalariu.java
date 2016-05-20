package ProiectCTS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalariu {

	@Test
	public void test() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		assertTrue(t.testSalariu(200));
	}
	@Test
	public void test2() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		assertFalse(t.testSalariu(99));
		
	}
	@Test
	public void test3() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		assertFalse(t.testSalariu(1500));
	}
	@Test
	public void test4() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		assertFalse( t.testSalariu(0));
	}
	@Test
	public void test5() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		assertFalse(t.testSalariu(-5));
	}
}
