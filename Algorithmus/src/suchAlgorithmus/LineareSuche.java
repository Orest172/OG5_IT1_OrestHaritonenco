package suchAlgorithmus;

public class LineareSuche {

	public static int lineareSuche(long[] liste, long gesuchteZahl) {

		for (int i = 0; i < liste.length; i++) {

			if (liste[i] == gesuchteZahl) {
				return i; // Position der Zahl zurückgeben
			}

			// Da die Liste geordnet ist:
			// Wenn die aktuelle Zahl größer ist,
			// kann die gesuchte Zahl nicht mehr kommen.
			if (liste[i] > gesuchteZahl) {
				return -1;
			}
		}

		return -1; // Zahl nicht gefunden
	}
}