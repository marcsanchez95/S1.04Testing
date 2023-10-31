package n1ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DniCalculatorTest {

	@Test
	void test() {
	
		char letter1 = new DniCalculator().calculateLetter(23245426);
		char letter2 = new DniCalculator().calculateLetter(534627482);
		char letter3 = new DniCalculator().calculateLetter(258727482);
		char letter4 = new DniCalculator().calculateLetter(254876482);
		char letter5 = new DniCalculator().calculateLetter(254678382);
		char letter6 = new DniCalculator().calculateLetter(66653724);
		char letter7 = new DniCalculator().calculateLetter(55627482);
		char letter8 = new DniCalculator().calculateLetter(354627482);
		char letter9 = new DniCalculator().calculateLetter(234627482);
		char letter10 = new DniCalculator().calculateLetter(22145482);

		assertAll(() -> assertEquals('Q', letter1), () -> assertEquals('A', letter2), () -> assertEquals('E', letter3),
				() -> assertEquals('G', letter4), () -> assertEquals('A', letter5), () -> assertEquals('T', letter6),
				() -> assertEquals('G', letter7), () -> assertEquals('G', letter8), () -> assertEquals('C', letter9),
				() -> assertEquals('R', letter10));
	}
}
