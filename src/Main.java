import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        naiveSearch suche = new naiveSearch();
        //ausleser lesezeit = new ausleser();
        constructOutput lesezeit2 = new constructOutput();
        searchandcolor farbsuche = new searchandcolor();
        String[] hi = new String[1];
        String textbeispiel = "22ull222ul22u";
        String ausschnitt = "2";

        /*
        try {
            textbeispiel = lesezeit.readbyline(hi);}
        catch (Exception e) {
            System.out.println("Error2!");
            System.exit(0);
        }
        System.out.println(textbeispiel);
        */


        try {
             lesezeit2.rd_lines(args[1],args[0]);}
        catch (Exception e) {
            System.out.println("Errorstats:(");
            System.exit(0);
        }
    //    System.out.println(farbsuche.suchundfaerb(textbeispiel, ausschnitt));


        //suche.naiveSearchPrint(textbeispiel, ausschnitt);
    //    suche.naiveSearchPrint(textbeispiel, ausschnitt);
    // int[] ergebnis =   suche.naiveSearchList(textbeispiel, ausschnitt);

      /*  for (int x = 0; x < ergebnis.length; x++){
            System.out.println(Arrays.toString(ergebnis));

        }*/
     //   System.out.println("");
     //   colorize farbe = new colorize();
      //  System.out.println(farbe.ansiColorEscapeString((char)65));
     //   preprocess ppp = new preprocess();
     //   kmp suchi = new kmp();

      //  System.out.println(Arrays.toString(ppp.preprocessWord("ababaa")));
      //  suchi.kmpSearch("erere", "ere", ppp.preprocessWord("ere"));
    //    String wasfarbe = "asdfghhkk";
    //    System.out.println("Wasfarbe hat " + wasfarbe.length() + "Laenge");
     //   int[] orte = {6,7,8,9};
    //    System.out.println("orte hat" + orte.length + "laenge");
    //    farbe.ansiColorEscapeFoundNaive(wasfarbe, orte);

      /*  Main dings = new Main();
        String[] hi = new String[1];
        dings.main(hi);*/

  /*      System.out.println("Hello World!1");
        System.out.println((char)97);*/
    }
}
