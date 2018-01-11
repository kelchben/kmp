
public class searchandcolor {
    /**
     * Verbindet Such- und Einfärbtätigkeiten
     */
    public String suchundfaerb(String text, String muster) {
        String gesuchtundfaerbt = new String();
        naiveSearch suche = new naiveSearch();
        colorize farbe = new colorize();
        String[] hi = new String[1];

        gesuchtundfaerbt = farbe.ansiColorEscapeFoundNaive(text, suche.naiveSearchList(text, muster));
        return gesuchtundfaerbt;
    }

}