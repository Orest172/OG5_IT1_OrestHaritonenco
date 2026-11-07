
package primzahl;

public class PrimzahlAlgorithmus {

    public PrimzahlAlgorithmus() {}

    public boolean isPrim(long zahl) {

        if (zahl < 2) {
            return false;
        }

        for (long i = 2; i <= zahl / i; i++) {

            if (zahl % i == 0) {
                return false;
            }
        }

        return true;
    }
}
