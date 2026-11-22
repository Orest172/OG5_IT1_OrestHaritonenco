
package suchAlgorithmus;

import listengenerator.SortedListGenerator;

public class SuchAlgorithmusTest {

    private static final int WIEDERHOLUNGEN = 5;

    public static void main(String[] args) {

        int[] arrayGroessen = {
            15_000_000,
            16_000_000,
            17_000_000,
            18_000_000,
            19_000_000,
            20_000_000
        };

        for (int groesse : arrayGroessen) {

            System.out.println("\n========================================");
            System.out.println("ARRAY-GROESSE: " + groesse);
            System.out.println("========================================");

            long[] liste = SortedListGenerator.getSortedList(groesse);

            // Best Case: Erstes Element
            long bestCase = liste[0];

            // Average Case: Mittlere Position
            long averageCase = liste[liste.length / 2];

            // Worst Case: Letztes Element
            long worstCase = liste[liste.length - 1];

            testeSuchfall(liste, "Best Case", bestCase);
            testeSuchfall(liste, "Average Case", averageCase);
            testeSuchfall(liste, "Worst Case", worstCase);

            // Suche nach einer nicht vorhandenen Zahl
            Long nichtGefunden = findeFehlendeZahl(liste);

            if (nichtGefunden != null) {
                testeSuchfall(liste, "Nicht gefunden", nichtGefunden);
            } else {
                System.out.println(
                    "\nKeine fehlende Zahl innerhalb des Wertebereichs gefunden."
                );
            }
        }
    }

    private static void testeSuchfall(
            long[] liste,
            String testName,
            long gesuchteZahl) {

        System.out.println("\n----------------------------------------");
        System.out.println("TEST: " + testName);
        System.out.println("Gesuchte Zahl: " + gesuchteZahl);
        System.out.println("----------------------------------------");

        // FastSearch
        System.out.println("\nFastSearch:");

        long gesamtZeitFastSearch = 0;

        for (int i = 1; i <= WIEDERHOLUNGEN; i++) {

            long start = System.nanoTime();

            long ergebnis = FastSearch.fastsearch(
                liste, 0, liste.length - 1, gesuchteZahl
            );

            long ende = System.nanoTime();

            long laufzeit = ende - start;
            gesamtZeitFastSearch += laufzeit;

            System.out.println(
                "Durchlauf " + i
                + " | Position: " + ergebnis
                + " | Laufzeit: " + laufzeit + " ns"
            );
        }

        long durchschnittFastSearch =
            gesamtZeitFastSearch / WIEDERHOLUNGEN;

        System.out.println(
            "Durchschnitt FastSearch: "
            + durchschnittFastSearch + " ns"
        );

        // Lineare Suche
        System.out.println("\nLineare Suche:");

        long gesamtZeitLinearSearch = 0;

        for (int i = 1; i <= WIEDERHOLUNGEN; i++) {

            long start = System.nanoTime();

            int ergebnis = LineareSuche.lineareSuche(
                liste, gesuchteZahl
            );

            long ende = System.nanoTime();

            long laufzeit = ende - start;
            gesamtZeitLinearSearch += laufzeit;

            System.out.println(
                "Durchlauf " + i
                + " | Position: " + ergebnis
                + " | Laufzeit: " + laufzeit + " ns"
            );
        }

        long durchschnittLinearSearch =
            gesamtZeitLinearSearch / WIEDERHOLUNGEN;

        System.out.println(
            "Durchschnitt Linear Search: "
            + durchschnittLinearSearch + " ns"
        );

        System.out.println("\n========== VERGLEICH ==========");
        System.out.println(
            "FastSearch Durchschnitt: "
            + durchschnittFastSearch + " ns"
        );
        System.out.println(
            "Linear Search Durchschnitt: "
            + durchschnittLinearSearch + " ns"
        );
    }

    private static Long findeFehlendeZahl(long[] liste) {

        for (int i = 0; i < liste.length - 1; i++) {

            if (liste[i] != Long.MAX_VALUE
                    && liste[i] + 1 < liste[i + 1]) {

                return liste[i] + 1;
            }
        }

        return null;
    }
}
