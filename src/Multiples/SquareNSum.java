package Multiples;

import java.util.Arrays;

public class SquareNSum {
	
	public static int squareSum(int[]n) {
		
		return Arrays.stream(n).map(x->x*x).sum();
	}
	
	public static void main(String[]args) {
		
		SquareNSum solution = new SquareNSum();
		System.out.println(solution.squareSum(new int[]{1,2,2}));
		System.out.println(solution.squareSum(new int[]{1,2}));
		System.out.println(solution.squareSum(new int[]{5,-3,4}));
		System.out.println(solution.squareSum(new int[]{}));
		
	}

}
