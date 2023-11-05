package n1ex02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class DniCalculatorTest {

	static HashMap<Integer, Character> testList = new HashMap<Integer, Character>();

	private static void addTestValues() {

		testList.put(23245426, 'Q');
		testList.put(53462748, 'F');
		testList.put(25872748, 'W');
		testList.put(25487648, 'Z');
		testList.put(25467838, 'F');
		testList.put(66653724, 'T');
		testList.put(55627482, 'G');
		testList.put(35462748, 'Z');
		testList.put(23462748, 'B');
		testList.put(22145482, 'R');
	}

	static {
		addTestValues();
	}

	static Set<Integer> methodSourceArgs() {
		return testList.keySet();
	}

	@ParameterizedTest
	@MethodSource("methodSourceArgs")
	@DisplayName("The vaulues generated are the expected")
	void parameterizedTest(Integer num) {
		assertEquals(DniCalculator.calculateLetter(num), testList.get(num));
	}
}