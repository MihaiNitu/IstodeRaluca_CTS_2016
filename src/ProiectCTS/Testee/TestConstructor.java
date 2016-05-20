package ProiectCTS.Testee;

import static org.junit.Assert.*;

import org.junit.Test;

import ProiectCTS.Factory.UtilizatorObj;

public class TestConstructor {

	@SuppressWarnings("deprecation")
	@Test
	public void testConstructor(){
		String nume = "Mutu";
		String prenume = "AnaMaria";
		String cnp = "176120514675";
		float salariu = 12;
		UtilizatorObj u = new UtilizatorObj(nume, prenume,cnp,salariu);
		assertEquals("Mutu",u.getNume());
		assertEquals("AnaMaria",u.getPrenume());
		assertEquals("176120514675",u.getCnp());
		assertEquals(12,u.getSalariu(),12);

		}

}
