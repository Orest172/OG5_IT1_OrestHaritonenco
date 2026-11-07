package primzahl;

import java.lang.Thread;

public class Primzahltest {

    public static void main(String[] args) {

        long zahl = 1;
        PrimzahlAlgorithmus prim = new PrimzahlAlgorithmus();
        
        
        while(zahl <= 9223372036854775807L) {
        	System.out.println(prim.isPrim(zahl));
        	
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}