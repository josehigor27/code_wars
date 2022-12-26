package SubtractTheSum;

public class SubtractTheSum {
	
	String fruits[]={"kiwi","pear","kiwi","banana","melon","banana","melon","pineapple"
		,"apple","pineapple","cucumber","pineapple","cucumber","orange","grape","orange"
		,"grape","apple","grape","cherry","pear","cherry","pear","kiwi","banana","kiwi"
		,"apple","melon","banana","melon","pineapple","melon","pineapple","cucumber","orange"
		,"apple","orange","grape","orange","grape","cherry","pear","cherry","pear","apple"
		,"pear","kiwi","banana","kiwi","banana","melon","pineapple","melon","apple","cucumber"
		,"pineapple","cucumber","orange","cucumber","orange","grape","cherry","apple"
		,"cherry","pear","cherry","pear","kiwi","pear","kiwi","banana","apple","banana"
		,"melon","pineapple","melon","pineapple","cucumber","pineapple","cucumber"
		,"apple","grape","orange","grape","cherry","grape","cherry","pear","cherry"
		,"apple","kiwi","banana","kiwi","banana","melon","banana","melon","pineapple"
		,"apple","pineapple"}; 
	
	public String subtractSum(int n) {
		int number = n;
		String auxNumber = Integer.toString(n);
		int sum = 0;
		
		for(int i = 0; i<auxNumber.length();i++) {
			String auxString = ""+auxNumber.charAt(i);
			sum += Integer.parseInt(auxString);
		}
		return null;
	
	}
	


	public static void main(String[] args) {
		
		SubtractTheSum subtract = new SubtractTheSum();
		System.out.println(subtract.subtractSum(325));

	}

}
