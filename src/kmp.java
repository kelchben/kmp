import java.util.ArrayList;
import java.util.List;

public class kmp {
    /**
     * Der Knuth-Morris-Pratt-Algorithmus (KMP) greift auf die praeprozessierte Liste aus der preprocessWord-Methode
     * der preprocess-Klasse zu. Er springt bei Nichtfinden des Suchstrings gegebenfalls zum anderen "Rand" des bisher
     * gefundenen Strings. So
     */
    public static void kmpSearch(String text, String muster, int[] preprocess) {
        //int[] tabelle = new int[muster.length()+1];
        int i = 0, j = -1;
            while (i < text.length()) {
            while (j >= 0 && text.charAt(i) != muster.charAt(j)) {
                j = preprocess[j];
            }
            i++;
            j++;
            if(j == muster.length()){
                System.out.println("i="+ i + " und j=" + j);
                j = preprocess[j];
            }
        }
    }


    public static List<Integer> kmpSearchList(String text, String muster, int[] preprocess) {
        //int[] tabelle = new int[muster.length()+1];
        int i = 0, j = -1;
        List<Integer> vorkommnisse = new ArrayList<Integer>();
        while (i < text.length()) {
            while (j >= 0 && text.charAt(i) != muster.charAt(j)) {
                j = preprocess[j];
            }
            i++;
            j++;
            if(j == muster.length()){
                    vorkommnisse.add(i-j);
                    j = preprocess[j];
            }
        }
        return vorkommnisse;
    }



}