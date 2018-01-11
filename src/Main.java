import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        constructOutput constructOutput = new constructOutput();
        try {
             constructOutput.rd_lines(args[1],args[0]);}
        catch (Exception e) {
            System.out.println("Error :(");
            System.exit(0);
        }

     /*   preprocess kmpPreprocess = new preprocess();
        String ausschnitt = "aba";
        String textbeispiel = "aba okay aba";

        kmp kmpsuche = new kmp();
        colorize farbi = new colorize();
        int[] preprocessList = kmpPreprocess.preprocessWord(ausschnitt);
        kmpsuche.kmpSearch(textbeispiel, ausschnitt, preprocessList);
        List<Integer> vorkommnisse= kmpsuche.kmpSearchList(textbeispiel, ausschnitt, preprocessList);
        for(int i=0;i<vorkommnisse.size();i++){
            System.out.println(vorkommnisse.get(i));
        } ;*/
    }
}
