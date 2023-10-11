package n1ex01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MonthTest {

	@Test
	void test() {		
		ArrayList<String> months1 = new ArrayList<>();
		months1 = months.returnMonths();
		final int monthsNum = months1.size();
		String eighthMonth = months1.get(7);		

		assertAll(() -> assertEquals(12, monthsNum), () -> assertEquals("August", eighthMonth), () -> assertNotNull((eighthMonth)));
	}

}
