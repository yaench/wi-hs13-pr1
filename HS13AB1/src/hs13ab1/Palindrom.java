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
}