package hs13ab1;
import java.util.Arrays;
/**
 *
 * @author Yannik Enz
 * @version 0.1
 * Erstelle ein Programm, welchem du 3 Parameter übergeben kannst. 
 * Das Programm, soll die Parameter auf der Konsole ausgeben 
 * und die Anzahl Zeichen der einzelnen Parameter angeben.
 * 
 * application.args=Hallo wie geht es und wie steht es
 * 
 */
public class ParameterUebergabe {
    /**
     * 
     * @param args          Uebergebene Parameter
     */
    public static void main(String[] args) {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        */
        int     i;
        
        // Uebergebene Parameter zur Kontrolle ausgeben.
        System.out.println("Es wurden " +args.length+ " Parameter uebergeben: " +Arrays.toString(args)+ "\n");
        // Tabellenkopf zeichnen
        System.out.printf("%-10s %-10s %-10s\n", "Nummer", "Argument", "Laenge" );
        // Tabelleninhalt zeichnen
        for (i = 0; i < args.length; i++) {
            System.out.printf("%-10s %-10s %-10s\n", i+1, args[i], args[i].length() );
        }
    }
}
