package n1ex01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MonthTest {

	@Test
	void test() {
		ArrayList<String> months = new Months().returnMonths();
	
		assertAll(() -> assertEquals(12, months.size()), () -> assertEquals("August", months.get(8)), () -> assertNotNull((months.get(0))));
	}

}
