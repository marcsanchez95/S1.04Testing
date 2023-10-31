package n2ex01;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

class LenghtTest {

	@Test
	public void lenghtTest() {
		assertThat("Mordor", length(is(6)));
	}

	public static Matcher<String> length(Matcher<? super Integer> matcher) {

		return new FeatureMatcher<String, Integer>(matcher, "the lenght of string that ", "length") {
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}
}