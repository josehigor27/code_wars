package Strings;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 
 * char[] array = aux.toCharArray();
		Set<String> set = new HashSet<>();
		if(aux.chars().distinct().count() == aux.length()) {
			Arrays.sort(array);
			return String.valueOf(array);
		} else {
			Arrays.sort(array);
			
			set.addAll(Arrays.asList(array));
		
				
			return Arrays.;
 * 
 * 
 * Solução mais simples
 * 
 * String s = s1 + s2;
   return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
 * 
 * 
 * 
 * Solução mais simples
 * 
 * 
 *  StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
 * 
 * 
 * 
 * */

public class TwoToOne {
	
	
	public static String longest(String s1, String s2) {
		String aux = s1+s2;
		ArrayList<Character> list = new ArrayList<Character>();
		char[] array = aux.toCharArray();
		SortedSet<Character> set = new TreeSet<Character>();
		for(char i: array) {
			list.add(i);
		}
		set.addAll(list);
		//aux = set.toString().replaceAll("[^a-zZ-Z1-9]","");
		return  set.toString().replaceAll("[^a-zZ-Z1-9]","");
		
		//str.toLowerCase().chars().distinct().count() == str.length();
	}
	
	
	
	public static void main(String[]args) {
		
		TwoToOne solution = new TwoToOne();
		
		System.out.println(solution.longest("asddf", "qwert"));
		System.out.println(solution.longest("aaaaaaa", "q"));
		System.out.println(solution.longest("adfgb", "aawert"));
		
	}

}
