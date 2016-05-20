package ProiectCTS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClient {

	@Test
	public void testSetPrenume() {
		UtilizatorObj obj = new UtilizatorObj();
		obj.setPrenume("andrei");
		assertTrue(obj.getPrenume()=="andrei");
	}
	@Test
	public void testSetNume() {
		UtilizatorObj obj = new UtilizatorObj();
		obj.setNume("andrei");
		assertTrue(obj.getNume()=="andrei");
	}
	@Test
	public void testSetCnp() {
		UtilizatorObj obj = new UtilizatorObj();
		obj.setCnp("1234586685");
		assertTrue(obj.getCnp()=="1234586685");
	}
	@Test
	public void testSetSalariu() {
		UtilizatorObj obj = new UtilizatorObj();
		obj.setSalariu(120);
		assertTrue(obj.getSalariu()== 120);
	}
}
