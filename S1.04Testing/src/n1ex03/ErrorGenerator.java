package n1ex03;


@SuppressWarnings("serial")
public class ErrorGenerator extends Exception {
		public static void IndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
