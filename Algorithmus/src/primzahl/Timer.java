package primzahl;

public class Timer {

    private long timerStart;

    public void start() {
        timerStart = System.nanoTime();
    }

    public String stop() {
        long endZeit = System.nanoTime();
        long dauer = endZeit - timerStart;

        long sekunden = dauer / 1000000000;
        long milliSekunden = (dauer / 1000000) % 1000;
        long nanoSekunden = dauer % 1000000;

        return "Dauer: " + sekunden + " Sekunden, "
                + milliSekunden + " Millisekunden und "
                + nanoSekunden + " Nanosekunden";
    }
}