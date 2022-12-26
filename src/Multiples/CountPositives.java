package Multiples;

public class CountPositives {
	
	public static int [] count (int[]input ) {
		int count = 0;
		int sum = 0;
		if(input != null || input.length > 0) {
			for(int i: input) {
				if(i > 0) {
					count++;
				} else if (i<0) {
					sum += i;
				}				
			}
			System.out.println(count + "/" + sum);
			return new int []{count,sum};
		}	
		return new int [] {};
	}
	
	
	public static void main (String [] args) {
			
		CountPositives solution = new CountPositives();
		System.out.println(solution.count(new int []{-1,2,-3,4,-5,6,-7,8,-9}));
		
		
	}

}
