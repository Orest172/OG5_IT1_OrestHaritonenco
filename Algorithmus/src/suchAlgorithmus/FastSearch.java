package suchAlgorithmus;
import primzahl.Timer;

public class FastSearch {

	public static long fastsearch(long[] liste, long von, long bis, long gesuchteZahl) {
		
		Timer timer = new Timer();
		timer.start();
		
		if (von <= bis) {
			long mB = von - (bis - von) / 2;
			long mI = von + (bis - von) * ((gesuchteZahl - liste[(int) von]) / (liste[(int) bis] - liste[(int) von]));

			if (mB > mI) {
				long temp = mB;
				mB = mI;
				mI = temp;
			}

			if (gesuchteZahl == liste[(int) mB]) {
				return mB;
			} else if (gesuchteZahl == liste[(int) mI]) {
				return mI;
			} else if (gesuchteZahl < liste[(int) mB]) {
				return fastsearch(liste, von, mB - 1, gesuchteZahl);
			} else if (gesuchteZahl < liste[(int) mI]) {
				return fastsearch(liste, mB + 1, mI - 1, gesuchteZahl);
			} else {
				return fastsearch(liste, mI + 1, bis, gesuchteZahl);
			}
		}
		System.out.println(timer.stop());
		return -1;
		
	}

}
