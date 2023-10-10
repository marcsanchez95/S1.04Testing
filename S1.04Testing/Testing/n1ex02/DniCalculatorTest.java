package n1ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DniCalculatorTest {

	@Test
	void test() {
		int DniNum1 = 23245426;int DniNum2 = 534627482;int DniNum3 = 258727482;int DniNum4 = 254876482;int DniNum5 = 254678382;
		int DniNum6 = 66653724;int DniNum7 = 55627482;int DniNum8 = 354627482;int DniNum9 = 234627482;int DniNum10 = 2145482;		
		char result1 = DniCalculator.calculateLetter(DniNum1);char result2 = DniCalculator.calculateLetter(DniNum2);
		char result3 = DniCalculator.calculateLetter(DniNum3);char result4 = DniCalculator.calculateLetter(DniNum4);
		char result5 = DniCalculator.calculateLetter(DniNum5);char result6 = DniCalculator.calculateLetter(DniNum6);
		char result7 = DniCalculator.calculateLetter(DniNum7);char result8 = DniCalculator.calculateLetter(DniNum8);
		char result9 = DniCalculator.calculateLetter(DniNum9);char result10 = DniCalculator.calculateLetter(DniNum10);
		assertAll(
				() -> assertEquals('Q',result1),
				() -> assertEquals('A',result2),
				() -> assertEquals('E',result3),
				() -> assertEquals('G',result4),
				() -> assertEquals('A',result5),
				() -> assertEquals('T',result6),
				() -> assertEquals('G',result7),
				() -> assertEquals('G',result8),
				() -> assertEquals('C',result9),
				() -> assertEquals('L',result10)
				);		
	}

}
