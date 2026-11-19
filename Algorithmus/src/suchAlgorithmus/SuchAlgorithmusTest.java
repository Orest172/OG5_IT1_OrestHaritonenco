package suchAlgorithmus;

import listengenerator.SortedListGenerator;

public class SuchAlgorithmusTest {
	
	public static void main(String[] args) {
		
		
		long[] liste = SortedListGenerator.getSortedList(20000000);
		long gesuchteZahl = 1L;
		
		for (int i = 1; i <= 5; i++) {
			FastSearch.fastsearch(liste, 0, liste.length - 1, gesuchteZahl);
		}
		
	}
}
