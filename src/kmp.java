/**
 * Created by kcots on 11.01.2018.
 */
public class kmp {
    public static void pp(String text, String muster, int[] preprocess) {
        //int[] tabelle = new int[muster.length()+1];
        int i = 0, j = -1;
            while (i < text.length()) {
            while (j >= 0 && text.charAt(i) != muster.charAt(j)) {
                j = preprocess[j];
            }
            i++;
            j++;
            if(j == muster.length()){
                System.out.println("i="i + " und j=" + j);
                j = preprocess[j];
            }
        }
    }
}