import java.util.List;

public class colorize {


    public static void faerben(char buchstabe) {
        System.out.print("\u001B[30;47m" + buchstabe + "\u001B[0m");
    }

    /**
     * Mit ansiColorEscapeString lassen sich einzelne chars mit einer Faerbung versehen.
     */
    public static String ansiColorEscapeString(char buchstabe) {
        return("\u001B[30;47m" + buchstabe + "\u001B[0m");
    }

    /**
     * Mit ansiColorEscapeFoundNaive lassen sich per naivem Suchalgorithmus gefundene Textstellen
     * mit einer Faerbung versehen.
     */
    public static String ansiColorEscapeFoundNaive(String ausgabe, int[] farbstellen) {
        Boolean gefunden = false;
        String gefaerbt = new String();
        for (int i = 0; i < ausgabe.length(); i++) {
                gefunden = false;
                for (int j = 0; j < farbstellen.length && !gefunden; j++) {
                    if (i == farbstellen[j]-1) {
                        gefaerbt = gefaerbt + ansiColorEscapeString(ausgabe.charAt(i));
                        gefunden = true;
                    break;
                    }

                    }

                if (!gefunden) {
                    gefaerbt = gefaerbt + ausgabe.charAt(i);
                    gefunden = true;
                }
        }
        return gefaerbt;
    }


    public static String ansiColorEscapeFoundKmp(String ausgabe, int farbStelle, int musterLaenge) {
        Boolean gefunden = false;

        String gefaerbt = new String();
        if (farbStelle == 0){
        for (int i = 0; i < musterLaenge; i++) {
            gefaerbt = gefaerbt + ansiColorEscapeString(ausgabe.charAt(i));
        }
        for (int i = musterLaenge; i < ausgabe.length(); i++) {
            gefaerbt = gefaerbt + ausgabe.charAt(i);
        }return gefaerbt;
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
