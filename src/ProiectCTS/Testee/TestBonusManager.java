package ProiectCTS.Testee;

import static org.junit.Assert.*;

import org.junit.Test;

import ProiectCTS.Factory.Utilizator;
import ProiectCTS.Factory.UtilizatorFactory;

public class TestBonusManager {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		UtilizatorFactory factory= new UtilizatorFactory();
		Utilizator m = factory.getUtilizator("Manager");
		float salariu = 5000; // formula bonus este salariu * 15 / 100 (15% din salariu)
		assertEquals(750, m.calculateBonus(salariu), 750);
	}
	
	@Test
	public void test2() {
		UtilizatorFactory factory= new UtilizatorFactory();
		Utilizator m = factory.getUtilizator("Manager");
		float salariu = -500; // formula bonus este salariu * 15 / 100 (15% din salariu)
		assertEquals(0, m.calculateBonus(salariu),0);
	}
	@Test
	public void test3() {
		UtilizatorFactory factory= new UtilizatorFactory();
		Utilizator m = factory.getUtilizator("Manager");
		float salariu = 999999999; // formula bonus este salariu * 15 / 100 (15% din salariu)
		assertEquals(0, m.calculateBonus(salariu),0);
	}
}
