package Strings;

public class FakeBinary {
	
	public static String fakeBin(String number) {
//		int count = 0;
//		String aux="";
//		
//		while(count < number.length()) {
//			if(number.charAt(count) < '5'){
//				aux +=""+0;
//			} else if (number.charAt(count) >= '5') {
//				aux +=""+1;
//			}
//			count++;
//		}
//		
//		return aux;
		
		return number.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
	}
	

	public static void main(String[] args) {
		
		FakeBinary solution = new FakeBinary();
		System.out.println(solution.fakeBin("55226611"));
		
		

	}

}
