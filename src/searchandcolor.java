import java.util.List;

public class searchandcolor {
    /**
     * Verbindet Such- und Einfaerbtaetigkeiten
     */
    public String suchundfaerb(String text, String muster) {
        String gesuchtundfaerbt = new String();
        naiveSearch suche = new naiveSearch();
        colorize farbe = new colorize();
        String[] hi = new String[1];

        gesuchtundfaerbt = farbe.ansiColorEscapeFoundNaive(text, suche.naiveSearchList(text, muster));
        return gesuchtundfaerbt;
    }
    /*
    public String suchundfaerbKmp(String text, String muster) {
        String gesuchtundfaerbtkmp = new String();
        preprocess kmpPreprocess = new preprocess();
        kmp kmpsuche = new kmp();
        colorize farbe = new colorize();
        String[] hi = new String[1];
        int[] preprocessList = kmpPreprocess.preprocessWord(muster);
        List<Integer> gefunden = kmpsuche.kmp(text, muster, preprocessList);


        gesuchtundfaerbtkmp = farbe.ansiColorEscapeFoundKmp(text, )
        (text, kmpsuche.kmpSearch(text, muster, preprocessList););
        return gesuchtundfaerbtkmp;
    }*/


}