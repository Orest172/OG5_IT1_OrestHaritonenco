package primzahl;

import java.util.Scanner;

public class Primzahltest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long primzahl = scan.nextLong();

		PrimzahlAlgorithmus primZahl = new PrimzahlAlgorithmus();
		
		
		
		System.out.println(primZahl.isPrim(primzahl));
	}

}
