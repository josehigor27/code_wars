package Multiples;

import java.util.Arrays;
import java.util.Collections;

public class Descending {

	public static int sortDesc(final int num) {
		String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
	
	}

	public static void main(String[] args) {
		
		Descending solution = new Descending();
		
		System.out.println(solution.sortDesc(45116));

	}

}
