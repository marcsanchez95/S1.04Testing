package n1ex03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ErrorGeneratorTest {

	@DisplayName("The IndexOutOfBoundsException ocurred")
	@Test
	void exceptionTest() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> ErrorGenerator.IndexOutOfBounds());
	}
}