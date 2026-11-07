package primzahl;

public class PrimzahlAlgorithmus {

    private Timer timer = new Timer();

    public PrimzahlAlgorithmus() {}

    public boolean isPrim(long zahl) {

        timer.start();

        boolean prim = true;

        if (zahl < 2) {
            prim = false;
        } else {
            for (long i = 2; i <= zahl / i; i++) {
                if (zahl % i == 0) {
                    prim = false;
                    break;
                }
            }
        }
        if (prim) {
        	System.out.println("Die Zahl " + zahl + " ist EINE Primzahl");
		} else {
			System.out.println("Die Zahl " + zahl + " ist KEINE Primzahl");
		}
        System.out.println(timer.stop());

		return prim;
	}
}