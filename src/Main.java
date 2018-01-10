import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        basicsearch suche = new basicsearch();
        ausleser lesezeit = new ausleser();
        String[] hi = new String[1];
        String textbeispiel = null;
        String ausschnitt = "2";

        try {
            textbeispiel = lesezeit.readbyline(hi);}
        catch (Exception e) {
            System.out.println("Error2!");
            System.exit(0);
        }
        suche.search(textbeispiel, ausschnitt);
      /*  Main dings = new Main();
        String[] hi = new String[1];
        dings.main(hi);*/

  /*      System.out.println("Hello World!1");
        System.out.println((char)97);*/
    }
}
