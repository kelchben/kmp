/**
 * Created by kcots on 10.01.2018.
 */
public class colorize {
    public static void faerben(char buchstabe) {
        System.out.print("\u001B[30;47m" + buchstabe + "\u001B[0m");
    }

    public static void faerbens(String ausgabe, int[] farbstellen) {
        Boolean gefunden = false;
        for (int i = 0; i < ausgabe.length(); i++) {
                gefunden = false;
                for (int j = 0; j < farbstellen.length && !gefunden; j++) {
                    if (i == farbstellen[j]) {
                        faerben(ausgabe.charAt(i));
                        gefunden = true;
                    break;
                    }

                    }

                if (!gefunden) {
                    System.out.print(ausgabe.charAt(i));
                    gefunden = true;
                }
        }

        }
    }

      /*  for (int i = 0; i < ausgabe.length(); i++) {
            for (int j = 0; j < farbstellen.length; j++) {
                if (i == farbstellen[j]) {
                    faerben(ausgabe.charAt(i));
                }
                else {
                    System.out.print(ausgabe.charAt(i));break;
                }
            }
        }
    }*/

