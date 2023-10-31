package n1ex03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorGeneratorTest {

	@Test
	void test() {

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> ErrorGenerator.IndexOutOfBounds());

	}

}
