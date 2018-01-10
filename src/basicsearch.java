import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by kcots on 10.01.2018.
 */
public class basicsearch {
    public static int[] search(String text, String muster) {
        int[] liste = new int[0];
        int i = 0;
        int j;
        int n = text.length();
        int m = muster.length();
        while (i <= n - m) {
            j = 0;
            while (j < m && muster.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == m) {
                //System.out.print(i);
                int[] neueListe = new int[liste.length + 1];
                for(int y=0;y < liste.length;y++)
                    {neueListe[y] = liste[y];}
                neueListe[neueListe.length-1] = i+1;
                liste = neueListe;

            }
            i++;
        }
    return liste;
    }
    public static void searchhier(String text, String muster) {
        System.out.println(Arrays.toString(search(text, muster)));
    }

}
