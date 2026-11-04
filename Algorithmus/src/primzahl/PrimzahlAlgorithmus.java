package primzahl;

public class PrimzahlAlgorithmus {

	public boolean isPrim(long zahl) {
		for (int i = 2; i <= 10; i++) {
			if (zahl % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

}
