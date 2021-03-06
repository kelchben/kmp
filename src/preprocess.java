
public class preprocess {
    /**
     * Die Methode preprocessWord ermittelt den maximalen Rand fuer jedes Zeichen des zu suchenden Strings.
     * So lassen sich spaeter Suchdurchgaenge einsparen, indem man bei erfolgloser Suche bis zum anderen Rand springt, um
     * die Suche fortzusetzen. Aus dem
     */
    public static int[] preprocessWord(String muster) {
        int[] tabelle = new int[muster.length()+1];
        int i = 0, j = -1;
        tabelle[i] = j;
        while (i < muster.length()) {
            while (j >= 0 && muster.charAt(i) != muster.charAt(j)) {
                j = tabelle[j];
            }
            i++;
            j++;
            tabelle[i] = j;
        }
        return tabelle;
    }
}