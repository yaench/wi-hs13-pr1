package hs13ab1;
import java.util.Scanner;
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
public class HS13AB1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        * 
        * @param i          Hilfsvariable in FOR-Schleife
        * @param sSel       Ausgewaehlter Menuepunkt
        * @param sPara3     Enthaelt Parameter fuer ParameterUebergabe.java
        * @param sPara4     Enthaelt Parameter fuer ArithmetischesMittel.java
        * @param sPara5     Enthaelt Parameter fuer Palindrom.java
        * @param in         Input-objekt
        */
        
       String       sSel;
       String[]     sPara3;
       String[]     sPara4;
       String[]     sPara5;
       Scanner      in = new Scanner(System.in);
       
       System.out.println("Bitte waehlen Sie die gewuenschte Aufgabe und bestaetigen Sie mit Enter:"); 
       System.out.printf("%-10s %-30s\n", "Eingabe", "Programm");
       System.out.printf("%-10s %-30s\n", "1", "A) Summe");
       System.out.printf("%-10s %-30s\n", "2", "B) Fakultaet");
       System.out.printf("%-10s %-30s\n", "3", "C) Parameter Uebergabe");
       System.out.printf("%-10s %-30s\n", "4", "D) Arithmetisches Mittel");
       System.out.printf("%-10s %-30s\n", "5", "E) Palindrom");
       System.out.print("Eingabe: ");
       
       // Reads a single line from the console 
       sSel = in.nextLine();      

       // Prints name and age to the console
       switch (sSel) {
           case "1":
               // Summe.java;
               hs13ab1.Summe.main();
               break;
           case "2":
               // Fakultaet.java
               hs13ab1.Fakultaet.main();
               break;
           case "3":
               // ParameterUebergabe.java
               System.out.println("Welche Parameter sollen an das Programm uebergeben werden?\nEingabe:");
               sPara3 = in.nextLine().split("\\s"); 
               hs13ab1.ParameterUebergabe.main(sPara3);
               break;
           case "4":
               // ArithmetischesMittel.java
               System.out.println("Welche Parameter sollen an das Programm uebergeben werden?\nEingabe:");
               sPara4 = in.nextLine().split("\\s"); 
               hs13ab1.ArithmetischesMittel.main(sPara4);
               break;
           case "5":
               // Palindrom.java
               System.out.println("Welche Parameter sollen an das Programm uebergeben werden?\nEingabe:");
               sPara5 = in.nextLine().split("\\s"); 
               hs13ab1.Palindrom.main(sPara5);
               break;
           default:
                // Ungueltige Eingabe
                System.out.println("Ungueltige Eingabe, Programm wird beendet.");
                break;
       }
    }
    
}
