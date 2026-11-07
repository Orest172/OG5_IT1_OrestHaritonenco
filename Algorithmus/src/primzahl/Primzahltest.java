
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

    		    
    		    97L, 100L, 997L, 999L, 1000L,

    		   
    		    9973L, 9999L, 10000L, 10007L, 10009L,

    		    
    		    99991L, 99999L, 100000L, 100003L, 100019L,

    		    
    		    999983L, 999999L, 1000000L, 1000003L, 1000033L,

    		    
    		    9999991L, 9999999L, 10000000L, 10000019L, 10000079L,

    		    
    		    99999989L, 99999999L, 100000000L, 100000007L, 100000037L,

    		    
    		    999999937L, 999999999L, 1000000000L,
    		    1000000007L, 1000000009L,

    		    
    		    9999999967L, 9999999999L, 10000000000L,
    		    10000000019L, 10000000033L,

    		    
    		    99999999977L, 99999999999L, 100000000000L,
    		    100000000003L, 100000000019L,

    		    
    		    999999999989L, 999999999999L, 1000000000000L,
    		    1000000000039L, 1000000000061L,

    		    
    		    99999999999991L, 99999999999999L,
    		    100000000000003L, 100000000000031L,
    		    100000000000037L
    		};

        PrimzahlAlgorithmus algo = new PrimzahlAlgorithmus();

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("messungen.csv"))) {

            writer.write("Eingabezahl;Primzahl;Laufzeit (ns)");
            writer.newLine();

            for (long zahl : zahlen) {

                long start = System.nanoTime();

                boolean prim = algo.isPrim(zahl);

                long ende = System.nanoTime();

                long laufzeit = ende - start;

                writer.write(zahl + ";" + prim + ";" + laufzeit);
                writer.newLine();
            }

            System.out.println("Excel-Export erfolgreich!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
