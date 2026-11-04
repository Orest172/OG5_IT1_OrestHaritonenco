package primzahl;

import java.util.*;

public class Timer {

	private long timerStart;
	
	public void start() {
		timerStart = System.currentTimeMillis();
	}
	
	public String stop() {
		long endZeit = System.currentTimeMillis();
		long dauer = endZeit - timerStart;
		
		long sekunden = dauer / 1000;
		long milliSekunden = dauer % 1000;
		
		return "Dauer: " + sekunden + " Sekunden und " + milliSekunden + " Millisekunden";
	}
}
