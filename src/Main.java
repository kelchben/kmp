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
        ausleser lesezeit = new ausleser();
        String[] hi = new String[1];
        String textbeispiel = "2ull222";
        String ausschnitt = "2";

        try {
            textbeispiel = lesezeit.readbyline(hi);}
        catch (Exception e) {
            System.out.println("Error2!");
            System.exit(0);
        }


        //suche.searchhier(textbeispiel, ausschnitt);
        int[] ergebnis = suche.search(textbeispiel, ausschnitt);
        System.out.println(ergebnis);
        for (int x = 0; x < ergebnis.length; x++){
            System.out.println(Arrays.toString(ergebnis));

        }



        colorize farbe = new colorize();
        farbe.faerben((char)65);
        String wasfarbe = "asdfghhkk";
        System.out.println("Wasfarbe hat " + wasfarbe.length() + "Länge");
        int[] orte = {6,7,8,9};
        System.out.println("orte hat" + orte.length + "länge");
        farbe.faerbens(wasfarbe, orte);
      /*  Main dings = new Main();
        String[] hi = new String[1];
        dings.main(hi);*/

  /*      System.out.println("Hello World!1");
        System.out.println((char)97);*/
    }
}
