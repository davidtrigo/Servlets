package com.countvowels.main;

import java.util.ArrayList;

public class CountVowels {
	
		
	
	private String word;

	public CountVowels(String word) {
	
		this.word = word;
	}
	
	
	
	

	public ArrayList<Vowel> arrayListVowels (){
		
		ArrayList<Vowel> listVowels = new ArrayList<Vowel>();
		char[] vocales ={ 'a', 'e', 'i', 'o', 'u' }; 
		
		int cont=0;
		
		char[] wordLower = word.toLowerCase().toCharArray();
				

		for (int i = 0; i < wordLower.length; i++) {
			char ch = wordLower[i];
			cont++;
			for (int x = 0; x < wordLower.length; x++) {

				if (ch==vocales[x]) {
					cont++;
		
				}
			}
		
			if(cont>0){
				
				listVowels.add(new Vowel(ch,cont));
				
			}
			
		}
		
		
		
	 return listVowels;
	 
	
	}

	public static class Vowel{
		
		
		
		final private char c;
		final private int n;
		
		

		public Vowel(char c, int n) {
		
			this.c = c;
			this.n = n;
		}
		
		
		
		public char getC() {
			return c;
		}
		public int getN() {
			return n;
		}
		
	
	}
	

}
