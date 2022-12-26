package Strings;

import java.util.Arrays;

public class Isograms {
	
	public static boolean isIsogram(String str) {
//		String  aux = str.toLowerCase();
//		char vetAux[] = new char [aux.length()];
//		
//		for(int i=0; i<aux.length();i++) {
//			vetAux[i] = aux.charAt(i);
//		}
//		
//		Arrays.sort(vetAux);
//		
//		for(int i=0;i<vetAux.length;i++) {
//			if(i != vetAux.length-1) {
//				if(vetAux[i] == vetAux[i+1]) {
//					return false;
//				}
//			}
//		}
//		
//		return true;
		/*
		 * 
		 * toLowerCase transforma os caracteres em letras minusculas
		 * chars transforma a string em um chars
		 * distinct retorna uma nova string de todos os elementos distintos
		 * count retorna a contagem de elementos da string distinta
		 * 
		 * e ao final, compara se essa contagem é igual ao tamanho da string original
		 * */
		
		return str.toLowerCase().chars().distinct().count() == str.length();
	}
	
	public static void main(String [] args) {
		
		Isograms solution = new Isograms();
		System.out.println(solution.isIsogram("focau"));
		
		
	}

}
