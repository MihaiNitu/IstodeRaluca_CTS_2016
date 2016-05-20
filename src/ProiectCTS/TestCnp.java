package ProiectCTS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCnp {

	@Test
	public void test() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String cnp = t.testCnp("1234567891253");
		assertEquals("1234567891253", cnp);
	}
	@Test
	public void test2() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String cnp = t.testCnp("12345891253");
		assertEquals("Incorect", cnp);
	}
	@Test
	public void test3() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String cnp = t.testCnp("");
		assertEquals("Incorect", cnp);
	}
	@Test
	public void test4() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String cnp = t.testCnp("123abc");
		assertEquals("Incorect", cnp);
	}
	/*@Test
	public void test5() {
		Teste t = new Teste();
		UtilizatorObj obj = new UtilizatorObj();
		String cnp = t.testCnp("1912 45672584");
		assertEquals("Incorect", cnp);
	}*/
}
