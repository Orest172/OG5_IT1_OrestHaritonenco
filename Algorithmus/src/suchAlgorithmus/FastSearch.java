package suchAlgorithmus;

public class FastSearch {

	public static int fastsearch(int[] liste, int von, int bis, int gesuchteZahl) {

		if (von <= bis) {
			int mB = von - (bis - von) / 2;
			int mI = von + (bis - von) * ((gesuchteZahl - liste[von]) / (liste[bis] - liste[von]));

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
				return fastsearch(liste, von, mB - 1, gesuchteZahl);
			} else if (gesuchteZahl < liste[mI]) {
				return fastsearch(liste, mB + 1, mI - 1, gesuchteZahl);
			} else {
				return fastsearch(liste, mI + 1, bis, gesuchteZahl);
			}
		}

		return -1;
	}

}
