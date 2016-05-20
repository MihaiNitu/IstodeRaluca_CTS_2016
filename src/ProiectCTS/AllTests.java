package ProiectCTS;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAvans.class, TestClient.class, TestCnp.class,
		TestLista.class, TestNume.class, TestSalariu.class,
		UtilizatorFisierTest.class })
public class AllTests {

}
