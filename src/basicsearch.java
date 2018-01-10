import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kcots on 10.01.2018.
 */
public class basicsearch {
    public static int[] search(String text, String muster) {
        int[] liste = new int[1];

        int i = 0;
        int j;
        int n = text.length();
        int m = muster.length();
        while (i <= n - m) {
            j = 0;
            while (j < m && muster.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == m) System.out.println("hier" + i);
            i++;
        }
    return liste;}
}
