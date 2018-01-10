import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.awt.SystemColor.text;

/**
 * Created by kcots on 10.01.2018.
 */
public class ausleser2 {


    public static void stats_lines(String filename) throws IOException{
        long count = Files.lines(Paths.get(filename)).count();
        System.out.println(count);
    }




    public static void rd_lines(String filename, String suchstring){

        // Location of file to read
        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            int zeile = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                basicsearch suchi = new basicsearch();
                searchandcolor mali = new searchandcolor();
                zeile++;
                if (suchi.search(line, suchstring).length != 0){
                    for (int h = 0; h < suchi.search(line, suchstring).length; h++){
                        System.out.println("Zeilennummer: "+ zeile + "  Spaltennummer:" + suchi.search(line, suchstring)[h]+ "  Zeilentext " +
                                mali.suchundfaerb(line,suchstring)    );
                    }

                  //  suchi.searchhier(line, "2");
                }


                //basicsearch suchi = new basicsearch();


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}