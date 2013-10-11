package hs13ab1;
/**
 *
 * @author Yannik Enz
 * @version 0.1
 * Erstelle ein Programm, welches die Fakultät der Zahl 10 berechnet.
 */
public class Fakultaet {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main() {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        * @param iFaku      Produkt aller natuerlichen Zahlen kleiner und gleich iFakuV
        * @param iFakuV     Fakultaet dieser Zahl wird berechnet
        * @param sFakuR     Formatiertes Resultat fuer Ausgabe
        */
        int     i;
        int     iFaku   =   1;
        int     iFakuV  =   10;
        String  sFakuR;
        
        for (i = 1; i <= iFakuV; i++) {
            iFaku   *=  i;
            //System.out.println(iFaku);
        }
        // Formatierung von iFaku fuer Ausgabe in Konsole, speichern in sFakuR
        sFakuR = String.format("%,d", iFaku);
        
        // Ausgabe sFakuR in Konsole
        System.out.println("Die Fakultaet der Zahl " +iFakuV+ " ist: " +sFakuR );
    }
}