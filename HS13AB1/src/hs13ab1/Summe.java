package hs13ab1;
/**
 *
 * @author Yannik Enz
 * @version 0.1
 * Erstelle ein Programm, welches alle Zahlen von 100 bis 200 summiert und 
 * das Resultat auf der Console ausgibt.
 */
public class Summe {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main() {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        * @param iSumme     Gefordertes Resultat
        * @param sSumme     Formatiertes Resultat fuer Ausgabe
        */
        int     i;
        int     iSumme  =   0;
        String  sSumme;
        
        for (i = 100; i <= 200; i++) {
            iSumme += i;
        }
        // Formatierung von iSumme fuer Ausgabe in Konsole, speichern in sSumme
        sSumme = String.format("%,d", iSumme);
        
        // Ausgabe iSumme in Konsole
        System.out.println("Die Summe aller Zahlen von 100 bis 200 ist: " +sSumme ); 
    }
}