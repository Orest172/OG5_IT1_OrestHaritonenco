
package primzahl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primzahltest {

    private static final int ANZAHL_TESTS = 5;

    public static void main(String[] args) {
        Primzahltest test = new Primzahltest();
        test.exportMessungen();
    }

    public void exportMessungen() {

        long[] zahlen = {
            97L, 997L, 9973L, 99991L, 999983L,
            1000003L, 1000033L, 10000019L,
            10000079L, 99999989L,
            1000000007L, 1000000009L,
            1000000021L, 1000000033L, 1000000087L,
            1000000000039L, 1000000000061L,
            1000000000063L, 1000000000091L,
            1000000000093L,
            1000000000000037L, 1000000000000061L,
            1000000000000063L, 1000000000000091L,
            1000000000000159L,
            10000000000000061L,
            10000000000000069L,
            10000000000000079L,
            10000000000000099L,
            9223372036854775783L,
            1000000000L, 10000000000L,
            1000000000000L, 1000000000000000L,
            Long.MAX_VALUE
        };

        PrimzahlAlgorithmus algo = new PrimzahlAlgorithmus();
        Timer timer = new Timer();

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("messungen.csv"))) {

            writer.write(
                "Eingabezahl;Primzahl;" +
                "Test 1 (ns);Test 2 (ns);Test 3 (ns);" +
                "Test 4 (ns);Test 5 (ns);Durchschnitt (ns);" +
                "Durchschnitt (µs);Durchschnitt (ms);Durchschnitt (s)"
            );

            writer.newLine();

            for (long zahl : zahlen) {

                long gesamtzeit = 0;
                long[] messungen = new long[ANZAHL_TESTS];

                boolean prim = false;

                // Fünf Messungen
                for (int i = 0; i < ANZAHL_TESTS; i++) {

                    timer.start();
                    prim = algo.isPrim(zahl);
                    messungen[i] = timer.stop();

                    gesamtzeit += messungen[i];
                }

                // Durchschnitt berechnen
                double durchschnitt = gesamtzeit / 5.0;

                double mikrosekunden = durchschnitt / 1000.0;
                double millisekunden = durchschnitt / 1000000.0;
                double sekunden = durchschnitt / 1000000000.0;

                writer.write(
                    "=\"" + zahl + "\";" +
                    prim + ";" +
                    messungen[0] + ";" +
                    messungen[1] + ";" +
                    messungen[2] + ";" +
                    messungen[3] + ";" +
                    messungen[4] + ";" +
                    durchschnitt + ";" +
                    mikrosekunden + ";" +
                    millisekunden + ";" +
                    sekunden
                );

                writer.newLine();
            }

            System.out.println("Messungen erfolgreich exportiert!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
