package Multiples;

public class Solution {

	public int Solution(int number) {
	    int sum=0;
	    
	    for (int i=0; i < number; i++){
	      if (i%3==0 || i%5==0){sum+=i;}
	    }
	    return sum;
	  }
	
//	int sum = 0;
//	int sumMultiples3 = 0;
//	int sumMultiples5 = 0;
//	int auxMulti3[] = new int [number];
//	int auxMulti5[] = new int [number];
//
//	if (number > 0) {
//
//		for (int i = 0; i < number; i++) {
//			if (3 * i < number) {
//				auxMulti3[i] = 3 * i;
//			}
//			if (5 * i < number) {
//				auxMulti5[i] = 5 * i;
//			}
//		}
//
//		for (int i = 0; i < number; i++) {
//			for (int j = 0; j < number; j++) {
//
//				if (auxMulti3[i] == auxMulti5[j]) {
//					auxMulti5[j] = 0;
//				}
//			}
//		}
//
//		for (int i = 0; i < number; i++) {
//			sumMultiples3 += auxMulti3[i];
//			sumMultiples5 += auxMulti5[i];
//		}
//
//		sum = sumMultiples3 + sumMultiples5;
//		return sum;
//	} else {
//		return 0;
//	}
	

	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.Solution(16));

	}

}
