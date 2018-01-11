import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class constructOutput {

    /**
     * stats_lines gibt die Anzahl der Zeilen der eingelesenen Textdatei wieder
     */
    public static void stats_lines(String filename) throws IOException{
        long count = Files.lines(Paths.get(filename)).count();
        System.out.println(count);
    }

    /**
     * rd_lines liest die Datei zeilenweise aus und prüft, ob der Suchstring vorhanden ist.
     * Schließlich wird die Ausgabe konstruiert.
     */
    public void rd_lines(String filename, String suchstring){

        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            int zeilennummer = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                naiveSearch suchi = new naiveSearch();
                searchandcolor mali = new searchandcolor();
                zeilennummer++;
                if (suchi.naiveSearchList(line, suchstring).length != 0){
                    for (int h = 0; h < suchi.naiveSearchList(line, suchstring).length; h++){
                        System.out.println(zeilennummer + ":" + suchi.naiveSearchList(line, suchstring)[h]+ ": " +
                                mali.suchundfaerb(line,suchstring)    );
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}