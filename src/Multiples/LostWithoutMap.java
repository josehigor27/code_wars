package Multiples;

import java.util.Arrays;

public class LostWithoutMap {
	
	
	public static int[] map(int [] map) {
//		int mapDouble [] = new int [map.length];
//		
//		for(int i =0; i < map.length; i++) {
//			mapDouble[i] = map[i]*2;
//		}
//		
//		return mapDouble;
		// Metodo acima desenvolvido por mim
		// metodo abaixo mais simples de fazer
		return Arrays.stream(map).map(x->x*2).toArray();
	}
	
	

	public static void main(String[] args) {
		
		LostWithoutMap solution = new LostWithoutMap();
		System.out.println(solution.map(new int [] {2,1,2}));

	}

}
