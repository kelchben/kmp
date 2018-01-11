import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class constructOutput {

    /**
     * stats_lines gibt die Anzahl der Zeilen der eingelesenen Textdatei wieder. Die Methode war in einem
     * ersten Entwurf wichtig fuer die Konstruktion der Ausgabe, wurde aber im spaeteren Verlauf des Designprozesses
     * in die andere Methode integriert.
     */
    public static void stats_lines(String filename) throws IOException{
        long count = Files.lines(Paths.get(filename)).count();
        System.out.print(count);
    }

    /**
     * rd_lines liest die Datei zeilenweise aus und prueft Zeile fuer Zeile, ob der Suchstring vorhanden ist.
     * Gibt es mindestens einen Treffer, wird die gewuenschte Ausgabe im Format "Zeilennummer:Spaltennummer: Zeilentext"
     * auf die Konsole geschrieben.
     */
    public void rd_lines(String filename, String suchstring){

        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            int zeilennummer = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                preprocess prp = new preprocess();
                kmp suchi2 = new kmp();
                colorize malili =  new colorize();

                zeilennummer++;
                int[] prepross = prp.preprocessWord(suchstring);
                if (suchi2.kmpSearchList(line, suchstring, prepross).size() != 0){
                    for(int s = 0; s < suchi2.kmpSearchList(line, suchstring, prepross).size(); s++){
                        System.out.print(zeilennummer + ":" + (suchi2.kmpSearchList(line,suchstring,prepross).get(s)+1) + ": " +
                                malili.ansiColorEscapeFoundKmp(line, suchi2.kmpSearchList(line,suchstring,prepross).get(s), suchstring.length()));
                    }
                }

            }


            scanner.close();
        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");
            System.exit(0);
        }


    }
}

