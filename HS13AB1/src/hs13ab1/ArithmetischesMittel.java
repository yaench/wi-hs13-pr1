package hs13ab1;
import java.util.Arrays;
/**
 *
 * @author Yannik Enz
 * @version 0.1
 * Erstelle ein Programm, welches für die (beliebig vielen) übergebenen Parameter 
 * das arithmetische Mittel berechnet 
 * und eine entsprechende Meldung auf der Konsole ausgibt.
 * 
 * application.args=123 123 12 9124 21
 * 
 */
public class ArithmetischesMittel {
    /**
     * 
     * @param args          Uebergebene Parameter
     */
    public static void main(String[] args) {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        * @param dSumme     Summe der uebergebenen Parameter
        */
        int     i;
        double  dSumme  =   0.0;
        
        for (i = 0; i < args.length; i++) {
            dSumme  +=  Double.parseDouble(args[i]);
        }
        
        // Uebergebene Parameter zur Kontrolle ausgeben.
        System.out.println("Es wurden " +args.length+ " Parameter uebergeben: " +Arrays.toString(args)+ "\n");
        // Ausgabe der Resultate
        System.out.printf("%-30s %-30s\n", "Summe", dSumme);
        System.out.printf("%-30s %-30s\n", "Arithmetisches Mittel", dSumme / args.length);
    }
}