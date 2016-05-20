package ProiectCTS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNume {

	@Test
	public void test() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String nume =t.testNume("Popa");
		assertEquals("Popa",nume);
		
	}
	@Test
	public void test2() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String nume =t.testNume("Po");
		assertEquals("Incorect",nume);
		
	}
	@Test
	public void test3() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String nume =t.testNume("Po129");
		assertEquals("Incorect",nume);
		
	}
	@Test
	public void test4() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String nume =t.testNume("");
		assertEquals("Incorect",nume);
		
	}
	@Test
	public void test5() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String nume =t.testNume("Po pa");
		assertEquals("Incorect",nume);
		
	}

}
