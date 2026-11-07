
package primzahl;

public class Timer {

    private long timerStart;

    public void start() {
        timerStart = System.nanoTime();
    }

    public long stop() {
        long endZeit = System.nanoTime();
        return endZeit - timerStart;
    }

    public String getFormattedTime(long dauer) {

        long sekunden = dauer / 1_000_000_000;
        long milliSekunden = (dauer / 1_000_000) % 1000;
        long nanoSekunden = dauer % 1_000_000;

        return "Dauer: " + sekunden + " Sekunden, "
                + milliSekunden + " Millisekunden und "
                + nanoSekunden + " Nanosekunden";
    }
}
