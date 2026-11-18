
package suchAlgorithmus;

import primzahl.Timer;

public class FastSearch {

	public static long fastsearch(long[] liste, int von, int bis, long gesuchteZahl) {

		Timer timer = new Timer();
		timer.start();

		if (von <= bis) {
			int mB = von + (bis - von) / 2;
			int mI = von + (int) ((bis - von) * ((double) (gesuchteZahl - liste[von]) / (liste[bis] - liste[von])));

			if (mB > mI) {
				int temp = mB;
				mB = mI;
				mI = temp;
			}

			if (gesuchteZahl == liste[mB]) {
				System.out.println(timer.stop());
				return mB;
			} else if (gesuchteZahl == liste[mI]) {
				System.out.println(timer.stop());
				return mI;
			} else if (gesuchteZahl < liste[mB]) {
				return fastsearch(liste, von, mB - 1, gesuchteZahl);
			} else if (gesuchteZahl < liste[mI]) {
				return fastsearch(liste, mB + 1, mI - 1, gesuchteZahl);
			} else {
				return fastsearch(liste, mI + 1, bis, gesuchteZahl);
			}
		}
		
		System.out.println("Die Zahl: " + gesuchteZahl + " wurde an der " + von + " und hat " + timer.stop() + "Nanosekunden gedauert!");
		return -1;
	}
}
