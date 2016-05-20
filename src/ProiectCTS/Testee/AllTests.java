package ProiectCTS.Testee;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBonusManager.class, TestCantitate.class,
		TestConstructor.class, TestSingleton.class, UtilizatorFisierTest.class })
public class AllTests {

}
