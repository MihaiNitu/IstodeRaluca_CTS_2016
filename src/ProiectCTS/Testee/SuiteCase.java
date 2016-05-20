package ProiectCTS.Testee;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAvans.class, TestBonusManager.class, TestCantitate.class,
		TestClient.class, TestCnp.class, TestConstructor.class,
		TestLista.class, TestNume.class, TestSalariu.class,
		TestSingleton.class, UtilizatorFisierTest.class })
public class SuiteCase {

}
