package ProiectCTS.Testee;

import static org.junit.Assert.*;

import org.junit.Test;

import ProiectCTS.Singleton.SingletonCerere;

public class TestSingleton {

	@Test
	public void testInstantaNotNull() {
		SingletonCerere sc = SingletonCerere.getCerere();
		assertNotNull(sc);
	}

	@Test
	public void testSingletonSame() {
		SingletonCerere sc = SingletonCerere.getCerere();
		assertSame(SingletonCerere.getCerere(), sc);
	}

	
	@Test
	public void testSameInstance() {
		SingletonCerere sc1 = SingletonCerere.getCerere();
		SingletonCerere sc2 = SingletonCerere.getCerere();
		
		Teste test = new Teste();

		assertTrue(test.TestSingletton(sc1, sc2));
	}

}
