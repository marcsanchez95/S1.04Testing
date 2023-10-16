package n1ex02;

import java.util.ArrayList;

public class DniCalculator {

	public char calculateLetter(int numDni) {
		
		ArrayList<Character> letters = new ArrayList<Character>();

		letters.add('T');
		letters.add('R');
		letters.add('W');
		letters.add('A');
		letters.add('G');
		letters.add('M');
		letters.add('Y');
		letters.add('F');
		letters.add('P');
		letters.add('D');
		letters.add('X');
		letters.add('B');
		letters.add('N');
		letters.add('J');
		letters.add('Z');
		letters.add('S');
		letters.add('Q');
		letters.add('V');
		letters.add('H');
		letters.add('L');
		letters.add('C');
		letters.add('K');
		letters.add('E');

		int check;

		check = numDni % 23;

		char correctLetter = letters.get(check);

		return correctLetter;

	}

}
