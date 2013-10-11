package hs13ab1;
import java.util.Arrays;
/**
 *
 * @author Yannik Enz
 * @version 0.1
 * Erstellen ein Programm, 
 * welches für jeden übergebenen Strings überprüft, 
 * ob dieser ein Palindrom ist.
 * 
 * application.args=Lorem Ipsum sugus bla blaalb 123 4224 asldkjf asdfla asdf
 * 
 */
public class Palindrom {
    /**
     * 
     * @param args          Uebergebene Parameter
     */
    public static void main(String[] args) {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        * @param sOrig      Original uebergebene Zeichenkette
        * @param sRevr      Umgekehrte Zeichenkette 
        */
        int     i;
        String  sOrig;
        String  sRevr;
        
        // Uebergebene Parameter zur Kontrolle ausgeben.
        System.out.println("Es wurden " +args.length+ " Parameter uebergeben: " +Arrays.toString(args)+ "\n");
        // Tabellenkopf zeichnen
        System.out.printf("%-50s %-10s\n", "String", "Palindrom");
        
        for (i = 0; i < args.length; i++) {
            // Zeichen werden zu Kleinbuchstaben konvertiert.
            sOrig   =   args[i].toLowerCase();
            sRevr   =   new StringBuffer(sOrig).reverse().toString();
            
            System.out.printf("%-50s %-30s\n", sOrig, sOrig.equals(sRevr) ? "Ja" : "Nein, da " +sRevr+ " nicht " +sOrig+ "" );
        }
    }
    public static void sub (String[] args) {
        /**
        * 
        * @param i,k        Hilfsvariable in FOR-Schleife
        * @param iOrLe      Laenge originaler Zeichenkette
        * @param sOrig      Original uebergebene Zeichenkette
        * @param sRevr      Umgekehrte Zeichenkette 
        */
        int     i,k;
        int     iOrLe;
        String  sOrig;
        String  sRevr = "";
        
        // Uebergebene Parameter zur Kontrolle ausgeben.
        System.out.println("Es wurden " +args.length+ " Parameter uebergeben: " +Arrays.toString(args)+ "\n");
        // Tabellenkopf zeichnen
        System.out.printf("%-50s %-10s\n", "String", "Palindrom");
        
        for (i = 0; i < args.length; i++) {
            sOrig   =   args[i].toLowerCase();
            iOrLe   =   sOrig.length();
            sRevr   =   "";
            
            for (k = iOrLe - 1; k >= 0; k--) {
                // Laenge von originalem String -1 wird heruntergezaehlt und dabei jeweiliger Char in sRevr gespeichert
                sRevr += sOrig.charAt(k);
            }
            System.out.printf("%-50s %-30s\n", sOrig, sOrig.equals(sRevr) ? "Ja" : "Nein, da " +sRevr+ " nicht " +sOrig+ "" );
        }
    }
}