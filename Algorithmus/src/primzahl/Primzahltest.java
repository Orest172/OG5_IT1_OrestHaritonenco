
package primzahl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primzahltest {

    public static void main(String[] args) {

        Primzahltest test = new Primzahltest();
        test.exportMessungen();
    }

    public void exportMessungen() {

        long[] zahlen = {

            // Kleine Zahlen
            97L,
            997L,
            9973L,
            99991L,
            999983L,

            // Millionen
            1000003L,
            1000033L,
            10000019L,
            10000079L,
            99999989L,

            // Milliarden
            1000000007L,
            1000000009L,
            1000000021L,
            1000000033L,
            1000000087L,

            // Billionen
            1000000000039L,
            1000000000061L,
            1000000000063L,
            1000000000091L,
            1000000000093L,

            // Billiarden
            1000000000000037L,
            1000000000000061L,
            1000000000000063L,
            1000000000000091L,
            1000000000000159L,

            // Sehr groﬂe Zahlen
            10000000000000061L,
            10000000000000069L,
            10000000000000079L,
            10000000000000099L,

            // Nahe dem long-Maximum
            9223372036854775783L,
            9223372036854775643L,
            9223372036854775507L,
            9223372036854775463L,

            // Zusammengesetzte Zahlen
            1000000000L,
            10000000000L,
            1000000000000L,
            1000000000000000L,
            9223372036854775807L
        };

        PrimzahlAlgorithmus algo = new PrimzahlAlgorithmus();
        Timer timer = new Timer();

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("messungen.csv"))) {

            writer.write(
                "Eingabezahl;Primzahl;Nanosekunden;" +
                "Mikrosekunden;Millisekunden;Sekunden"
            );

            writer.newLine();

            for (long zahl : zahlen) {

                timer.start();

                boolean prim = algo.isPrim(zahl);

                long laufzeit = timer.stop();

                double mikrosekunden = laufzeit / 1_000.0;
                double millisekunden = laufzeit / 1_000_000.0;
                double sekunden = laufzeit / 1_000_000_000.0;

                writer.write(
                    zahl + ";" +
                    prim + ";" +
                    laufzeit + ";" +
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
