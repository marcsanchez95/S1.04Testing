package n1ex01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonthTest {

	Months months;
		@BeforeEach
		void setUp() {
			months = new Months();
		}
		
		@Test
		@DisplayName ("The list is not null")
		void testNull() {
			assertNotNull(months.returnMonths());
		}
		
		@Test
		@DisplayName ("The list have 12 positions")
		void testPositions() {
			assertEquals(12, months.returnMonths().size());
		}
		
		@Test
		@DisplayName ("August it's at 7 position of the list")
		void testAugust() {
			assertEquals("August", months.returnMonths().get(7));
		}
		
	}