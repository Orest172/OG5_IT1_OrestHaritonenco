package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	
	
	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list        Liste der Codes im Long-Format
	 * @param searchValue Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, int von, int bis, long searchValue) {
		
		if (von <= bis) {
			int mB = von + (bis - von) / 2;
			int mI = von + (int) ((bis - von) * ((double) (searchValue - list[von]) / (list[bis] - list[von])));
			
			if (mB > mI) {
				int temp = mB;
				mB = mI;
				mI = temp;
			}
			
			if (searchValue == list[mB]) {
				return mB;
			} else if (searchValue == list[mI]) {
				return mI;
			} else if (searchValue < list[mB]) {
				return findPromoCode(list, von, mB - 1, searchValue);
			} else if (searchValue < list[mI]) {
				return findPromoCode(list, mB + 1, mI - 1, searchValue);
			} else {
				return findPromoCode(list, mI + 1, bis, searchValue);
			}
		}
		
		
		return NOT_FOUND;
	}

	
}