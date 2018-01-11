import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        basicsearch suche = new basicsearch();
        //ausleser lesezeit = new ausleser();
        ausleser2 lesezeit2 = new ausleser2();
        searchandcolor farbsuche = new searchandcolor();
        String[] hi = new String[1];
        String textbeispiel = "22ull222ul22u";
        String ausschnitt = "2";

        /*
        try {
            textbeispiel = lesezeit.readbyline(hi);}
        catch (Exception e) {
            System.out.println("Error2!");
            System.exit(0);
        }
        System.out.println(textbeispiel);
        */


        try {
             lesezeit2.rd_lines(args[1],args[0]);}
        catch (Exception e) {
            System.out.println("Errorstats:(");
            System.exit(0);
        }
        System.out.println(farbsuche.suchundfaerb(textbeispiel, ausschnitt));


        //suche.searchhier(textbeispiel, ausschnitt);
        suche.searchhier(textbeispiel, ausschnitt);
    // int[] ergebnis =   suche.search(textbeispiel, ausschnitt);

      /*  for (int x = 0; x < ergebnis.length; x++){
            System.out.println(Arrays.toString(ergebnis));

        }*/
        System.out.println("");
        colorize farbe = new colorize();
        System.out.println(farbe.faerbString((char)65));
        preprocess ppp = new preprocess();

        System.out.println(Arrays.toString(ppp.pp("ababaa")));
    //    String wasfarbe = "asdfghhkk";
    //    System.out.println("Wasfarbe hat " + wasfarbe.length() + "Laenge");
     //   int[] orte = {6,7,8,9};
    //    System.out.println("orte hat" + orte.length + "laenge");
    //    farbe.faerbens(wasfarbe, orte);

      /*  Main dings = new Main();
        String[] hi = new String[1];
        dings.main(hi);*/

  /*      System.out.println("Hello World!1");
        System.out.println((char)97);*/
    }
}
