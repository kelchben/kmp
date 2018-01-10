/**
 * Created by kcots on 10.01.2018.
 */
public class searchandcolor {
    public static void suchundfaerb(String text, String muster) {
        basicsearch suche = new basicsearch();
        ausleser lesezeit = new ausleser();
        colorize farbe = new colorize();
        String[] hi = new String[1];

        farbe.faerbens(text, suche.search(text, muster));
    }
}