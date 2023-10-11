package n1ex03;

import java.util.ArrayList;

public class ErrorGenerator {

	public static void IndexOutOfBounds() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(14);

		for (int i = -1; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}

}
