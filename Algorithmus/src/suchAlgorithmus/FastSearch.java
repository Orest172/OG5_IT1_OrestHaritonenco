
package suchAlgorithmus;

import primzahl.Timer;

public class FastSearch {

	public static long fastsearch(long[] liste, int von, int bis, long gesuchteZahl) {

		Timer timer = new Timer();
		timer.start();

		long ergebnis = fastsearchIntern(liste, von, bis, gesuchteZahl);

		System.out.println("Die Zahl: " + gesuchteZahl + " wurde an der Stelle " + ergebnis + " gefunden. Dauer: "
				+ timer.stop() + " Nanosekunden!");

		return ergebnis;
	}

	private static long fastsearchIntern(long[] liste, int von, int bis, long gesuchteZahl) {

		if (von <= bis) {
			int mB = von + (bis - von) / 2;
			int mI = von + (int) ((bis - von) * ((double) (gesuchteZahl - liste[von]) / (liste[bis] - liste[von])));

			if (mB > mI) {
				int temp = mB;
				mB = mI;
				mI = temp;
			}

			if (gesuchteZahl == liste[mB]) {
				return mB;
			} else if (gesuchteZahl == liste[mI]) {
				return mI;
			} else if (gesuchteZahl < liste[mB]) {
				return fastsearchIntern(liste, von, mB - 1, gesuchteZahl);
			} else if (gesuchteZahl < liste[mI]) {
				return fastsearchIntern(liste, mB + 1, mI - 1, gesuchteZahl);
			} else {
				return fastsearchIntern(liste, mI + 1, bis, gesuchteZahl);
			}
		}

		return -1;
	}
}
