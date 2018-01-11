import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class colorize {

    @Test
    public void istBuchstabeRichtigGefaerbt() {
        colorize tester = new colorize(); // MyClass is tested

        // assert statements
        assertEquals("\u001B[30;47m" + 'u' + "\u001B[0m", tester.ansiColorEscapeString('u'));
    }

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
}
