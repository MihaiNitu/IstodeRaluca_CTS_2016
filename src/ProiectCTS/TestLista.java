package ProiectCTS;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestLista {

	@Test
	public void test() {
		Teste t = new Teste();
		ArrayList<UtilizatorObj> lista = new ArrayList<UtilizatorObj>();
		UtilizatorObj u1 = new UtilizatorObj();
		UtilizatorObj u2 = new UtilizatorObj();
		lista.add(u1);
		lista.add(u2);
		assertTrue (t.testObjInLista(lista));
		
	}
	@Test
	public void test2() {
		Teste t = new Teste();
		ArrayList<UtilizatorObj> lista = new ArrayList<UtilizatorObj>();
		assertFalse (t.testObjInLista(lista));
		
	}
	@Test
	public void test3() {
		Teste t = new Teste();
		assertFalse (t.testObjInLista(null));
		
	}

}
