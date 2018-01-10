/**
 * Created by kcots on 10.01.2018.
 */
public class searchandcolor {
    public String suchundfaerb(String text, String muster) {
        String gesuchtundfaerbt = new String();
        basicsearch suche = new basicsearch();
        ausleser lesezeit = new ausleser();
        colorize farbe = new colorize();
        String[] hi = new String[1];

        gesuchtundfaerbt = farbe.faerbens(text, suche.search(text, muster));
        return gesuchtundfaerbt;
    }

}