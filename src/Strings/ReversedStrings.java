package Strings;

public class ReversedStrings {
	
//	public String solution(String str) {
//		String aux = "";
//		int count = str.length();	
//		while(count!=0) {
//			count--;
//			aux += ""+str.charAt(count);
//			//System.out.println(aux);
//		}
//		
//		return aux;
//	}

	public String solution(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String [] args) {
		ReversedStrings solution = new ReversedStrings();
		
		System.out.println(solution.solution("world"));
		
		
		
	}	
}
