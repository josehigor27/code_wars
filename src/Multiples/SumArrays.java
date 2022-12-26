package Multiples;

import java.util.Arrays;

public class SumArrays {
	
	public static double sum(double [] numbers) {
//		double soma=0.0;
//		if (numbers != null) {
//			for (double i: numbers) {
//				soma += i;
//			}
//			
//			return soma;
//		}
//		Solução em comentario desenvolvida por mim. Solução abaixo mais simples.
//		return 0.0;
		
		
		return Arrays.stream(numbers).sum();
	}
	
	
	

	public static void main (String [] args) {
		
		SumArrays solution = new SumArrays();
		System.out.println(solution.sum(new double [] {1,2.3,5,9.8}));
		
		
	}
}
