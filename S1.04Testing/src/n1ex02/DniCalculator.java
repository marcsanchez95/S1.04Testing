package n1ex02;

import java.util.ArrayList;

public class DniCalculator {
	
	public static char calculateLetter(int numDni) {
		
	    ArrayList<Character> letras = new ArrayList<Character>();
	    
	    letras.add('T');letras.add('R');letras.add('W');letras.add('A');letras.add('G');letras.add('M');letras.add('Y');letras.add('F');letras.add('P');letras.add('D');letras.add('X');
	    letras.add('B');letras.add('N');letras.add('J');letras.add('Z');letras.add('S');letras.add('Q');letras.add('V');letras.add('H');letras.add('L');letras.add('C');letras.add('K');letras.add('E');
						
		int check;						
					
		check = numDni % 23;
		
		char correctLetter = letras.get(check);	
		
		return correctLetter;
		
	}

}
