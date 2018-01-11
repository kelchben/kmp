import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        naiveSearch suche = new naiveSearch();

        constructOutput lesezeit2 = new constructOutput();
        searchandcolor farbsuche = new searchandcolor();
        String[] hi = new String[1];
        String textbeispiel = "k22ull222ul22u";
        String ausschnitt = "22";

        try {
             lesezeit2.rd_lines(args[1],args[0]);}
        catch (Exception e) {
            System.out.println("Errorstats:(");
            System.exit(0);
        }

    }
}
