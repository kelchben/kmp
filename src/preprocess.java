/**
 * Created by kcots on 11.01.2018.
 */
public class preprocess {
    public static int[] pp(String muster) {
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