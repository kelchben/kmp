import java.util.List;

public class colorize {

    /**
     * Mit ansiColorEscapeString lassen sich einzelne chars mit einer Faerbung versehen.
     */
    public static String ansiColorEscapeString(char buchstabe) {
        return("\u001B[30;47m" + buchstabe + "\u001B[0m");
    }

    /**
     * Mit ansiColorEscapeFoundKmp lassen sich per Suchalgorithmus gefundene Textzeilen
     * mit einer Faerbung versehen.
     */
    public static String ansiColorEscapeFoundKmp(String ausgabe, int farbStelle, int musterLaenge) {
        String gefaerbt = new String();
        if (farbStelle == 0){
            for (int i = 0; i < musterLaenge; i++) {
                gefaerbt = gefaerbt + ansiColorEscapeString(ausgabe.charAt(i));
            }
            for (int i = musterLaenge; i < ausgabe.length(); i++) {
                gefaerbt = gefaerbt + ausgabe.charAt(i);
            }
            return gefaerbt;
        }

        for (int j = 0; j < farbStelle; j++) {
            gefaerbt = gefaerbt + ausgabe.charAt(j);
        }
        for (int i = farbStelle; i < farbStelle + musterLaenge; i++)
            gefaerbt = gefaerbt + ansiColorEscapeString(ausgabe.charAt(i));

        for (int k = farbStelle + musterLaenge; k < ausgabe.length(); k++) {
            gefaerbt = gefaerbt + ausgabe.charAt(k);
        }
        return gefaerbt;
    }
}
